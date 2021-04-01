package org.reservationacces.controller;

import java.sql.SQLException;
import java.util.Map;
import org.reservationacces.model.Utilisateur;
import org.reservationacces.service.OffreService;
import org.reservationacces.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 

 

@Controller  
public class InscriptionController {
	
	
	@Autowired
	 UtilisateurService utilisateurService;
	 OffreService offreService;
	//getJSP
 
	@RequestMapping(value="/inscription", method=RequestMethod.GET)
	public String Inscription( Map<String, Object> map) throws ClassNotFoundException, SQLException {
		map.put("utilisateur",new Utilisateur());   
		return "inscription";
	}

	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create( Utilisateur utilisateur, Map<String, Object> map) throws ClassNotFoundException, SQLException {
		utilisateurService.save(utilisateur);
		return "login";
	}	
 
	

	
			 
	

}
