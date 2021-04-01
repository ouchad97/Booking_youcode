package org.reservationacces.controller;
 
import java.sql.SQLException;
import java.util.Map;
 
import org.reservationacces.service.DemandeINSCRITService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
  
@Controller
public class DemandeInscriController { 
	 

	@Autowired
	 DemandeINSCRITService demandeINSCRITService;
	
	
	@RequestMapping(value="/demandesinscrit", method=RequestMethod.GET)
	public String inscrilist(Map<String, Object> map)  throws ClassNotFoundException, SQLException{
		map.put("inscrilist",demandeINSCRITService.getAll()); 
		return "Demandeinscri";
	}
	 
	//modif offre
		@RequestMapping(value="/modifapprenant/{idUtilisateur}", method=RequestMethod.GET)
			public String modifapprenant(@PathVariable("idUtilisateur") int idUtilisateur,  Map<String, Object> map)  throws ClassNotFoundException, SQLException{
			demandeINSCRITService.modif(idUtilisateur);
				return "redirect:/demandesinscrit";
			}
	 
	//delete offre
	@RequestMapping(value="/deleteapprenant/{idUtilisateur}", method=RequestMethod.GET)
		public String deleteapprenant(@PathVariable("idUtilisateur") int idUtilisateur,  Map<String, Object> map)  throws ClassNotFoundException, SQLException{
		demandeINSCRITService.delete(idUtilisateur);
			return "redirect:/demandesinscrit";
		}
}