package org.reservationacces.controller;
 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.reservationacces.model.OffreAcces;
import org.reservationacces.model.Utilisateur;
import org.reservationacces.service.LoginService;
import org.reservationacces.service.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView; 
 

 

@Controller
public class LoginController { 
	
	@Autowired
	LoginService loginService;
	@Autowired
	 OffreService offreService; 
	
	
	
	private Utilisateur thisUtilisateur = null;
	private String connexionfait = null;


	@RequestMapping(value="/", method=RequestMethod.GET)
	public String Login(ModelMap model) {

		model.addAttribute("connexionfait", connexionfait);
		return "login";
	}
	 
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Model model, Utilisateur utilisateur, HttpSession session) throws ClassNotFoundException, SQLException {

		 thisUtilisateur = loginService.login(utilisateur.getEmailUtilisateur(), utilisateur.getMdpsUtilisateur());

			connexionfait = "false";
		if (utilisateur != null) {
			
			connexionfait = "true";
			System.out.println(this.thisUtilisateur.getRoleUtilisateur());
			System.out.println("Connexionfait true");
			
			
			if (this.thisUtilisateur.getRoleUtilisateur().equals("Admin")) {
				session.setAttribute("thisUtilisateur", this.thisUtilisateur);
				session.setAttribute("Admin", this.thisUtilisateur);
				System.out.println("SessionAdmin true");
				
				return "Offres";
			}
			
			else { if(this.thisUtilisateur.getRoleUtilisateur().equals("Apprenant")){
 				session.setAttribute("thisUtilisateur", this.thisUtilisateur);
				session.setAttribute("Apprenant", this.thisUtilisateur); 
				System.out.println("SessionApprenant true");
				
				return "Offresliste";
				
			}
				
				
			}

		}  
		return "redirect:/inscription";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
 
		connexionfait = null; 
		thisUtilisateur = null;

		return "login";
	}
}
