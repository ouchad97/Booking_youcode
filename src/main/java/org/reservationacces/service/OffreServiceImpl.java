package org.reservationacces.service;

import java.sql.SQLException;
import java.util.List;

import org.reservationacces.dao.OffreDao;
import org.reservationacces.model.OffreAcces; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.stereotype.Service; 

@Service("offreService")
//@Transactional(propagation = Propagation.SUPPORTS, rollbackFor=Exception.class)
public class OffreServiceImpl implements OffreService {
	
	@Autowired
	@Qualifier("offreDao")
	private OffreDao offreDao;
	
	@Override
	public void save(OffreAcces offre) throws ClassNotFoundException, SQLException { 
		offreDao.createOffer(offre);
	}

	@Override
	public List<OffreAcces> getAll() throws ClassNotFoundException, SQLException {
 		return offreDao.getAll();
	}

	@Override
	public void update(OffreAcces offre) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OffreAcces edit(int idOffre) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int idOffre) throws ClassNotFoundException, SQLException {
			offreDao.delete(idOffre);
	}
 

}
