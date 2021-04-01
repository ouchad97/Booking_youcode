package org.reservationacces.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction; 
import org.reservationacces.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Component("loginDao")
public class LoginDaoImp implements LoginDao  {

	@Autowired
	SessionFactory sessionFactory;
	Session session;

	protected Session currentSession() {
		
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		return session;	}
	 
	@Override
	public Utilisateur login(String emailUtilisateur, String mdpsUtilisateur)
			throws ClassNotFoundException, SQLException {

		System.out.println("Connexion methode...!");
		session = sessionFactory.openSession();

		session.beginTransaction();

		String query = "From Utilisateur WHERE EMAIL_UTILISATEUR = :EMAIL_UTILISATEUR AND MDPS_UTILISATEUR = :MDPS_UTILISATEUR ";

		Utilisateur utilisateur = (Utilisateur) session.createQuery(query).setParameter("EMAIL_UTILISATEUR", emailUtilisateur).setParameter("MDPS_UTILISATEUR", mdpsUtilisateur)
				.uniqueResult();

		if (utilisateur != null) {
			System.out.println("utilisateur not null");
			return utilisateur;
		} else {
			System.out.println("utilisateur null");
			return null;
		}
		
		
	}

 

	

}
