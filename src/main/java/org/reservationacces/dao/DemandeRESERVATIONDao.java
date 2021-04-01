package org.reservationacces.dao;

import java.sql.SQLException;
import java.util.List;

import org.reservationacces.model.Reservation; 

public interface DemandeRESERVATIONDao {

	  public List<Reservation> getAll() throws ClassNotFoundException, SQLException;
 
}