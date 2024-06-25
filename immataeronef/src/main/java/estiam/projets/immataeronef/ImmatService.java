package estiam.projets.immataeronef;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opencsv.exceptions.CsvException;

@Service
public class ImmatService {

	private final ImmatCSVReader immatCSVReader;

    public static final String UNKNOWN = "unknown";

    public ImmatService(@Autowired ImmatCSVReader immatCSVReader, @Autowired AppConf appConf) throws CsvException, IOException 
	{
        this.immatCSVReader = immatCSVReader;
        immatCSVReader.importFile(new File(appConf.getFilename()));
    }
    public Optional<AeronefDTO> getAeronefFromImmat(String immat) {
        // Convertir l'immatriculation en majuscules pour ignorer la casse
        immat = immat.toUpperCase();

        
        
        // Ajout d'une alerte (log) chaque fois que la fonction est utilisée        
		System.out.println("Appel de la fonction getAeronefFromImmat() avec l'immatriculation : " + immat);
                var entry = immatCSVReader.getEntryByImmat(immat);
        if (entry.isEmpty()) {
            System.out.println("Aucune entrée trouvée pour l'immatriculation : " + immat);
            return Optional.empty();
        }
        // Log pour vérifier les détails de l'aéronef trouvé
        System.out.println("Entrée trouvée dans le CSV pour l'immatriculation : " + immat + ". Détails : " + entry);
        
        var constructeur = entry.getOrDefault("CONSTRUCTEUR", UNKNOWN);
        var modele = entry.getOrDefault("MODELE", UNKNOWN);
        var aerodromeAttache = entry.getOrDefault("AERODROME_ATTACHE", UNKNOWN);

        return Optional.ofNullable(new AeronefDTO(immat, constructeur, modele, aerodromeAttache));
    }

    public List<AeronefDTO> findAeronefsByMatricule(String matricule) {
        // Convertir le matricule en majuscules pour ignorer la casse
        final String matriculeUpper = matricule.toUpperCase();

        List<AeronefDTO> allAeronefs = immatCSVReader.findAll();
        List<AeronefDTO> filteredAeronefs = allAeronefs.stream()
                .filter(aeronef -> aeronef.getImmatriculation().contains(matricule))
                .collect(Collectors.toList());
        System.out.println("Found " + filteredAeronefs.size() + " aeronef(s) with matricule: " + matricule);
        return filteredAeronefs;
    }
}