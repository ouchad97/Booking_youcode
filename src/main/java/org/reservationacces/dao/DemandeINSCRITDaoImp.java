package org.reservationacces.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.reservationacces.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("demandeINSCRITDao")
public class DemandeINSCRITDaoImp implements DemandeINSCRITDao {

	
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
	public List<Utilisateur> getAll() throws ClassNotFoundException, SQLException {
		//return currentSession().createCriteria(Utilisateur.class).list();
		
		session = sessionFactory.openSession();

		session.beginTransaction();

		String query = "FROM Utilisateur WHERE VALIDATION_COMPTE=false";
		

        //currentSession.createQuery("from customer", Customer.class);

		List<Utilisateur> apprenantliste =  (List<Utilisateur>) currentSession().createQuery(query, Utilisateur.class).list();


		return apprenantliste;
 	}
 

	@Override
	public void delete(int idUtilisateur) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Utilisateur apprenant = new Utilisateur();
		apprenant.setIdUtilisateur(idUtilisateur);
		this.sessionFactory.getCurrentSession().delete(apprenant);
		
	}

	@Override
	public Utilisateur edit(int idUtilisateur) throws ClassNotFoundException, SQLException {
 		return find(idUtilisateur);
	}


	@Override
	public void update(Utilisateur utilisateur) throws ClassNotFoundException, SQLException {
				currentSession().update(utilisateur); 
	}


	@Override
	public Utilisateur find(int idUtilisateur) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return (Utilisateur)currentSession().get(Utilisateur.class, idUtilisateur);
	}


	@Override
	public void modif(int idUtilisateur) throws ClassNotFoundException, SQLException {
		Utilisateur apprenant = new Utilisateur();
		apprenant.setIdUtilisateur(idUtilisateur);
		apprenant.setValidationCompte(true);
		this.sessionFactory.getCurrentSession().update(apprenant);
				
	} 

}
