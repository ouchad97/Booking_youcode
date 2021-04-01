package org.reservationacces.controller;
 
import java.sql.SQLException;
import java.util.Map;

import org.reservationacces.model.OffreAcces; 
import org.reservationacces.service.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
  
@Controller
public class OffreController { 
	 

	@Autowired
	 OffreService offreService; 
	
	
 
	
//	//liste Inscrit
//			@RequestMapping(value="/demandesinscrit", method=RequestMethod.GET)
//			public String inscrilist(Map<String, Object> map)  throws ClassNotFoundException, SQLException{
//				map.put("inscrilist",demandeINSCRITService.getAll());
//				return "Demandeinscri";
//			}
	
	 

  
											/***OffreController***/
	
	//get page add offre
		@RequestMapping(value="/lanceroffre", method=RequestMethod.GET)
		public String lanceroffre(Map<String, Object> map)  throws ClassNotFoundException, SQLException{
			map.put("offre",new OffreAcces());
			return "Lanceroffre";
		}
	//AddOffre
		@RequestMapping(value="/createoffre", method=RequestMethod.POST)
		public String createoffre( OffreAcces offre, Map<String, Object> map) throws ClassNotFoundException, SQLException {
			offreService.save(offre);
			return "Offres";
		}
	//liste offre
		@RequestMapping(value="/offres", method=RequestMethod.GET)
		public String listeoffre(Map<String, Object> map)  throws ClassNotFoundException, SQLException{
			map.put("offrelist",offreService.getAll());
			return "Offres";
		}
	//delete offre
	@RequestMapping(value="/deleteoffre/{idOffre}", method=RequestMethod.GET)
		public String deleteoffre(@PathVariable("idOffre") int idOffre,  Map<String, Object> map)  throws ClassNotFoundException, SQLException{
			offreService.delete(idOffre);
			return "redirect:/offres";
		}
											/***EndOffreController***/
	//get page   offreListe
	@RequestMapping(value="/offreliste", method=RequestMethod.GET)
	public String offreliste(Map<String, Object> map)  throws ClassNotFoundException, SQLException{
		map.put("offreliste",offreService.getAll());
		return "Offresliste";
	}

}
