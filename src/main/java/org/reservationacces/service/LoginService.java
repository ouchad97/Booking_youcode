package org.reservationacces.service;

import java.sql.SQLException; 
 
import org.reservationacces.model.Utilisateur;

//@Service
public interface LoginService {
	 
	Utilisateur login(String emailUtilisateur, String mdpsUtilisateur) throws ClassNotFoundException, SQLException;

		boolean LoginVerification(String emailUtilisateur, String mdpsUtilisateur);
}
