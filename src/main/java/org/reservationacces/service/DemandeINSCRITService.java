package org.reservationacces.service;

import java.sql.SQLException;
import java.util.List;

import org.reservationacces.model.Utilisateur;

//@Service
public interface DemandeINSCRITService {
	   public List<Utilisateur> getAll() throws ClassNotFoundException, SQLException;
	   public void delete(int idUtilisateur)throws ClassNotFoundException, SQLException;
	   public Utilisateur edit(int idUtilisateur)throws ClassNotFoundException, SQLException;
	   public void update(Utilisateur utilisateur)throws ClassNotFoundException, SQLException;
	   public Utilisateur find(int idUtilisateur)throws ClassNotFoundException, SQLException;
	   public void modif(int idUtilisateur)throws ClassNotFoundException, SQLException;

}