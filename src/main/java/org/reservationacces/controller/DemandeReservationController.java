package org.reservationacces.controller;
 
import java.sql.SQLException;
import java.util.Map;
 
import org.reservationacces.service.DemandeRESERVATIONService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
  
@Controller
public class DemandeReservationController { 
	 

	@Autowired
	DemandeRESERVATIONService demandeRESERVATIONService;
	 
	@RequestMapping(value="/demandesreservation", method=RequestMethod.GET)
	public String reservationlist(Map<String, Object> map)  throws ClassNotFoundException, SQLException{
		map.put("reservationlist",demandeRESERVATIONService.getAll()); 
		return "Demanderes";
	}
 
 
	 
 
}