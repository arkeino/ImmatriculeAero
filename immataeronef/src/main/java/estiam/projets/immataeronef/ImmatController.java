package estiam.projets.immataeronef;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImmatController {

	/* @Autowired
	//ImmatService immatService;
	private ImmatService immatService;
	
	@GetMapping("/aeronef/{immat}")
	public AeronefDTO getAeronef(@PathVariable("immat") String immat, HttpServletResponse response) {
		var result = immatService.getAeronefFromImmat(immat);
		
		if (result.isEmpty()) {
			response.setStatus(SC_NO_CONTENT);
			return null;
		}
		
		return result.get();
	}

	@GetMapping("/aeronefs") 
	//http://localhost:8080/aeronefs?matricule=some_value
	public List<AeronefDTO> getAeronefsByMatriculegetAeronef(@RequestParam String matricule) {
		
	private final ImmatService immatService;

    /* @Autowired */
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
