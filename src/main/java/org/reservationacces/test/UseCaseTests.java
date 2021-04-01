package org.reservationacces.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.reservationacces.dao.UtilisateurDao;
import org.reservationacces.model.Utilisateur; 

public class UseCaseTests {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("null")
	@Test
	public void testAddUtilisateur() throws Exception {
		
//		Utilisateur user=new Utilisateur("test", "test", 33, "test", "test");
//		UtilisateurDao AjouterUser = null  ;
//		AjouterUser.createUtilisateur(user);
//
//		
	}

}
