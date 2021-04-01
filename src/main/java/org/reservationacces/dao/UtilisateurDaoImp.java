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
@Component("utilisateurDao")
public class UtilisateurDaoImp implements UtilisateurDao {

	@Override
	public Utilisateur getById(int idUtilisateur) throws ClassNotFoundException, SQLException {
		Utilisateur utilisateur = null;
		Session session = null;
		try {

			// get  by id
			utilisateur = (Utilisateur) session.get(Utilisateur.class, idUtilisateur);
			System.out.println("lu !");
		} finally {
			if (session != null) {
				session.close();
			}

		}

		return utilisateur;

	}
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
	
	
	
	//create

	@Override
	public void createUtilisateur(Utilisateur utilisateur) throws ClassNotFoundException, SQLException {
		currentSession().save(utilisateur);
	}
	
 

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		Utilisateur utilisateur = getById(id);
		Session session = null;
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(utilisateur);
			transaction.commit();
			System.out.println("utilisateur suprimer !");

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}

		}

	}

	@SuppressWarnings("unchecked")
	public List<Utilisateur> getAll() throws ClassNotFoundException, SQLException {

		Session session = null;
		List<Utilisateur> etudiants = null;
		try {

			org.hibernate.Query query = session.getNamedQuery("Utilisateur.All");
			etudiants = query.list();

			System.out.println("utilisateur lu !");
		} finally {
			if (session != null) {
				session.close();
			}

		}

		return etudiants;

	}



	

}
