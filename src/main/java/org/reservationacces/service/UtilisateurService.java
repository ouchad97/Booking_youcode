package org.reservationacces.service;

import java.sql.SQLException;
import java.util.List;
 
import org.reservationacces.model.Utilisateur;

//@Service
public interface UtilisateurService {
	
	public List<Utilisateur>findAll() throws ClassNotFoundException, SQLException;
    public Utilisateur findById(int idUtilisateur) throws ClassNotFoundException, SQLException;
    public void save(Utilisateur utilisateur) throws ClassNotFoundException, SQLException;
    public void delete(int idUtilisateur) throws ClassNotFoundException, SQLException;
   
}
