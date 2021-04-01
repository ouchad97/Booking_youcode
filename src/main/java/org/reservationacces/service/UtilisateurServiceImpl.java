package org.reservationacces.service;

import java.sql.SQLException;
import java.util.List;
 
import org.reservationacces.dao.UtilisateurDao; 
import org.reservationacces.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("utilisateurService")
//@Transactional(propagation = Propagation.SUPPORTS, rollbackFor=Exception.class)
public class UtilisateurServiceImpl implements UtilisateurService {
	
	@Autowired
	@Qualifier("utilisateurDao")
	private UtilisateurDao utilisateurDao;
	
	@Override
	public void save(Utilisateur utilisateur) throws ClassNotFoundException, SQLException {
		//return etudiantRepository.save(etudiant);
		utilisateurDao.createUtilisateur(utilisateur);
	}
 
	@Override
	@Transactional
	public List<Utilisateur> findAll() throws ClassNotFoundException, SQLException {
		return utilisateurDao.getAll();
		//return (List<Etudiant>) etudiantRepository.findAll();
	}

	@Override
	@Transactional
	public Utilisateur findById(int idUtilisateur) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return utilisateurDao.getById(idUtilisateur);
		//return etudiantRepository.findById(id).get();
	}



	@Override
	@Transactional
	public void delete(int idUtilisateur) throws ClassNotFoundException, SQLException {
		utilisateurDao.delete(idUtilisateur);
		//etudiantRepository.deleteById(id);

	}

	

}
