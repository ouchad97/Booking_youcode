package org.reservationacces.service;

import java.sql.SQLException;
import java.util.List;

import org.reservationacces.model.Reservation;

//@Service
public interface DemandeRESERVATIONService {
	   public List<Reservation> getAll() throws ClassNotFoundException, SQLException;
	 
}