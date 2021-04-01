package org.reservationacces.service;

import java.sql.SQLException;
import java.util.List;

import org.reservationacces.dao.DemandeINSCRITDao;
import org.reservationacces.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 

@Service("demandeINSCRITService")
//@Transactional(propagation = Propagation.SUPPORTS, rollbackFor=Exception.class)
@Transactional
public class DemandeINSCRITServiceImpl implements DemandeINSCRITService {
	
	@Autowired
	@Qualifier("demandeINSCRITDao")
	private DemandeINSCRITDao demandeINSCRITDao;
 
	@Override
	public List<Utilisateur> getAll() throws ClassNotFoundException, SQLException {
		return demandeINSCRITDao.getAll();
	}

	@Override
	public void delete(int idUtilisateur) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		demandeINSCRITDao.delete(idUtilisateur);
		
	}

	@Override
	public Utilisateur edit(int idUtilisateur) throws ClassNotFoundException, SQLException {
 		return demandeINSCRITDao.edit(idUtilisateur);
	}

	@Override
	public void update(Utilisateur utilisateur) throws ClassNotFoundException, SQLException {
		demandeINSCRITDao.update(utilisateur);		
	}

	@Override
	public Utilisateur find(int idUtilisateur) throws ClassNotFoundException, SQLException {
		 
		return demandeINSCRITDao.find(idUtilisateur);
	}

	@Override
	public void modif(int idUtilisateur) throws ClassNotFoundException, SQLException {
		demandeINSCRITDao.modif(idUtilisateur);
		
	}
  
}
