package org.reservationacces.dao;
 
 
import java.sql.SQLException;

import org.reservationacces.model.Utilisateur;


public interface LoginDao {

			Utilisateur login(String emailUtilisateur, String mdpsUtilisateur) throws ClassNotFoundException, SQLException;
}
