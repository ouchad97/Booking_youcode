package org.reservationacces.dao;

import java.sql.SQLException;
import java.util.List;
 
import org.reservationacces.model.Utilisateur;


public interface UtilisateurDao {


	public Utilisateur getById(int idUtilisateur) throws ClassNotFoundException, SQLException;
	public void createUtilisateur(Utilisateur utilisateur) throws ClassNotFoundException, SQLException;
	public void delete(int id) throws ClassNotFoundException, SQLException;
	public List<Utilisateur> getAll() throws ClassNotFoundException, SQLException;
 
}
