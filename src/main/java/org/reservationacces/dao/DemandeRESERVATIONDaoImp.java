package org.reservationacces.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.reservationacces.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("demandeRESERVATIONDao")
public class DemandeRESERVATIONDaoImp implements DemandeRESERVATIONDao {

	
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
	public List<Reservation> getAll() throws ClassNotFoundException, SQLException {
		 return currentSession().createCriteria(Reservation.class).list();
		 
 	}

  
}
