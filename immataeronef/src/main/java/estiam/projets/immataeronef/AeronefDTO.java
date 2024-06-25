package estiam.projets.immataeronef;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AeronefDTO {

	private String immatriculation; 
	private String constructeur;
	private String modele;
	private String aerodromeAttache;

}


/*  package estiam.projets.immataeronef;
public class AeronefDTO {

    private String matricule;
    private String constructeur;
    private String modele;
    private String aerodromeAttache;

    public AeronefDTO(String matricule, String constructeur, String modele, String aerodromeAttache) {
        this.matricule = matricule;
        this.constructeur = constructeur;
        this.modele = modele;
        this.aerodromeAttache = aerodromeAttache;
    }
    public String getMatricule() {
        return matricule;
    }
    public String getConstructeur() {
        return constructeur;
    }

    public String getModele() {
        return modele;
    }

    public String getAerodromeAttache() {
        return aerodromeAttache;
    }
} */