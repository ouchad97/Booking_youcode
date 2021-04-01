package org.reservationacces.dao;

import java.sql.SQLException;
import java.util.List;

import org.reservationacces.model.OffreAcces; 


public interface OffreDao {

 
	public void createOffer(OffreAcces offre) throws ClassNotFoundException, SQLException; 
	public List<OffreAcces> getAll() throws ClassNotFoundException, SQLException;
	public void update(OffreAcces offre) throws ClassNotFoundException, SQLException;
	public OffreAcces edit (int idOffre)throws ClassNotFoundException, SQLException;
	public void delete(int idOffre)throws ClassNotFoundException, SQLException;
	
}
