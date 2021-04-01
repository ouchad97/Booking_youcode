package org.reservationacces.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory; 
import org.reservationacces.model.OffreAcces; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional; 
@Repository
@Component("offreDao")
public class OffreDaoImp implements OffreDao {

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
	public void createOffer(OffreAcces offre) throws ClassNotFoundException, SQLException {
		currentSession().save(offre);
		
	}



	@Override
	public List<OffreAcces> getAll() throws ClassNotFoundException, SQLException {
 	
 		return currentSession().createCriteria(OffreAcces.class).list();

	}
 
	@Override
	public void update(OffreAcces offre) throws ClassNotFoundException, SQLException {
				currentSession().update(offre);
	}


	@Override
	public OffreAcces edit(int idOffre) throws ClassNotFoundException, SQLException {
 		
		return null;
	}
 

	@Transactional
	public void delete(int idOffre) throws ClassNotFoundException, SQLException {
		OffreAcces offre = new OffreAcces();
		offre.setIdOffre(idOffre);
		this.sessionFactory.getCurrentSession().delete(offre);
	}
	  
	
	
	
	

 

	 
}
