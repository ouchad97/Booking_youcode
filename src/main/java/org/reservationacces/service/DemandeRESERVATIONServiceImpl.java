package org.reservationacces.service;

import java.sql.SQLException;
import java.util.List;
 
import org.reservationacces.dao.DemandeRESERVATIONDao;
import org.reservationacces.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 

@Service("demandeRESERVATIONService")
//@Transactional(propagation = Propagation.SUPPORTS, rollbackFor=Exception.class)
@Transactional
public class DemandeRESERVATIONServiceImpl implements DemandeRESERVATIONService {
	
	@Autowired
	@Qualifier("demandeRESERVATIONDao")
	private DemandeRESERVATIONDao demandeRESERVATIONDao;
 
	@Override
	public List<Reservation> getAll() throws ClassNotFoundException, SQLException {
		return demandeRESERVATIONDao.getAll();
	}

 

 
  
}
