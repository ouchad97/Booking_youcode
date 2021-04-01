package org.reservationacces.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity 
@Table(name= "UTILISATEUR")
@Inheritance(strategy=InheritanceType.JOINED)
public class Utilisateur implements Serializable {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_UTILISATEUR")
	private int idUtilisateur;
	@Column(name="NOM_UTILISATEUR")
	private String nomUtilisateur;
	@Column(name="PRENOM_UTILISATEUR")
	private String prenomUtilisateur;
	@Column(name="TEL_UTILISATEUR")
	private int TelUtilisateur;
	@Column(name="EMAIL_UTILISATEUR")
	private String emailUtilisateur;
	@Column(name="MDPS_UTILISATEUR")
	private String mdpsUtilisateur;
	@Column(name="ROLE_UTILISATEUR")
	private String roleUtilisateur;
	@Column(name="VALIDATION_COMPTE")
	private Boolean validationCompte;
	
	
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, int TelUtilisateur, String emailUtilisateur,
			String mdpsUtilisateur, String roleUtilisateur, Boolean validationCompte) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.TelUtilisateur = TelUtilisateur;
		this.emailUtilisateur = emailUtilisateur;
		this.mdpsUtilisateur = mdpsUtilisateur;
		this.roleUtilisateur = roleUtilisateur;
		this.validationCompte = validationCompte;
	}


	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public String getNomUtilisateur() {
		return nomUtilisateur;
	}


	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}


	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}


	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}


	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}


	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}


	public String getMdpsUtilisateur() {
		return mdpsUtilisateur;
	}


	public void setMdpsUtilisateur(String mdpsUtilisateur) {
		this.mdpsUtilisateur = mdpsUtilisateur;
	}


	public int getTelUtilisateur() {
		return TelUtilisateur;
	}


	public void setTelUtilisateur(int telUtilisateur) {
		TelUtilisateur = telUtilisateur;
	}


	public String getRoleUtilisateur() {
		return roleUtilisateur;
	}


	public void setRoleUtilisateur(String roleUtilisateur) {
		this.roleUtilisateur = roleUtilisateur;
	}


	public Boolean getValidationCompte() {
		return validationCompte;
	}


	public void setValidationCompte(Boolean validationCompte) {
		this.validationCompte = validationCompte;
	}

 
	
}
