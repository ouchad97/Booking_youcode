package org.reservationacces.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name= "OFFREACCES")
public class OffreAcces implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_OFFRE")
	private int idOffre;
	@Column(name="DATE_DEBUT")
	private Date dateDebut;
	@Column(name="DATE_FIN")
	private Date dateFin;
	@Column(name="NOMBRE_APPRENANT")
	private int nombreApprenant;
	@Column(name="DESCRIPTION")
	private String description;
	
	public OffreAcces(Date dateDebut, Date dateFin, int nombreApprenant, String description) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nombreApprenant = nombreApprenant;
		this.description = description;
	}
	public OffreAcces() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public int getNombreApprenant() {
		return nombreApprenant;
	}
	public void setNombreApprenant(int nombreApprenant) {
		this.nombreApprenant = nombreApprenant;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "OffreAcces [idOffre=" + idOffre + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", nombreApprenant=" + nombreApprenant + ", description=" + description + "]";
	}
	
}
