package org.reservationacces.service;

import java.sql.SQLException;
import java.util.List;

import org.reservationacces.dao.LoginDao;
import org.reservationacces.model.OffreAcces;
import org.reservationacces.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.stereotype.Service; 

@Service("loginService")
//@Transactional(propagation = Propagation.SUPPORTS, rollbackFor=Exception.class)
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	@Qualifier("loginDao")
	private LoginDao loginDao;

	@Override
	public Utilisateur login(String emailUtilisateur, String mdpsUtilisateur)
			throws ClassNotFoundException, SQLException {
		if (LoginVerification(emailUtilisateur, mdpsUtilisateur)) {
			System.out.println("Utilisateur Service Impl not null");
			return loginDao.login(emailUtilisateur, mdpsUtilisateur);
		} else {
			System.out.println("Utilisateur Service Impl null");
			return null;
		}
	}
	 
	@Override
	public boolean LoginVerification(String emailUtilisateur, String mdpsUtilisateur) {
		if (emailUtilisateur != null && mdpsUtilisateur != null && !(emailUtilisateur.isBlank() && mdpsUtilisateur.isBlank())) 
			return true;
		return false;
	}
}
