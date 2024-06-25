package estiam.projets.immataeronef;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImmatController {
	
	public ImmatController(ImmatService immatService) {
        this.immatService = immatService;
    }
    @GetMapping("/aeronefs")public List<AeronefDTO> getAeronefsByMatricule(@RequestParam String matricule) {
        System.out.println("Requête reçue pour l'immatriculation : " + matricule);
        List<AeronefDTO> aeronefs = immatService.findAeronefsByMatricule(matricule);        System.out.println("Returning " + aeronefs.size() + " aeronef(s) to client.");
        return aeronefs;
    }

    @GetMapping("/aeronef")public Optional<AeronefDTO> getAeronef(@RequestParam String immat) {
        System.out.println("Requête reçue pour obtenir l'aéronef avec l'immatriculation : " + immat);
        return immatService.getAeronefFromImmat(immat);
    }
}
