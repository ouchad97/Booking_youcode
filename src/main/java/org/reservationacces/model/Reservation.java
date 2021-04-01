package org.reservationacces.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name= "RESERVATION")
public class Reservation implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_RESERVATION")
	private int idReservation;
	@Column(name="ID_UTILISATEUR")
	private int idUtilisateur;
	@Column(name="ID_OFFRE")
	private int idOffre;
	
	
	public Reservation(int idUtilisateur, int idOffre) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idOffre = idOffre;
	}
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public int getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}
	
	
	
}
