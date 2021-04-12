package org.reservationacces.test;

import java.sql.SQLException;

import org.junit.Test; 
import org.reservationacces.model.Utilisateur;
import org.reservationacces.service.UtilisateurServiceImpl; 

 
public class UtilisateurTest {
  
	@Test
	public void testAddUtilisateur() throws Exception, ClassNotFoundException, SQLException {
		UtilisateurServiceImpl userService = new UtilisateurServiceImpl();
		Utilisateur user = new Utilisateur("testNom", "testPrenom", 633,"testEmail", "testMdps", "testRole", false);
		userService.save(user);
		System.out.print(user.toString());
	}
}
