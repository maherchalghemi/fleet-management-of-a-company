package Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import Model.Affectations;
import DAO.IAffectationsDAO;

/**
 * 
 * Affectations Service
 * 
 *
 */
@Transactional(readOnly = true)
public class AffectationsService implements IAffectationsService {

	// AffectationsDAO is injected...
	IAffectationsDAO affectationsDAO;
	
	/**
	 * Add Affectations
	 * 
	 * @param  Affectations affectations
	 */
	@Transactional(readOnly = false)
	@Override
	public void addAffectations(Affectations affectations) {
		getAffectationsDAO().addAffectations(affectations);
	}

	/**
	 * Delete Affectations
	 * 
	 * @param  Affectations affectations
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteAffectations(Affectations affectations) {
		getAffectationsDAO().deleteAffectations(affectations);
	}
	
	/**
	 * Update Affectations
	 * 
	 * @param  Affectations affectations
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateAffectations(Affectations affectations) {
		getAffectationsDAO().updateAffectations(affectations);
	}
	
	/**
	 * Get Affectations
	 * 
	 * @param  int Affectations Id
	 */
	
	public Affectations getAffectationsById(int id) {
		return getAffectationsDAO().getAffectationsById(id);
	}

	/**
	 * Get Affectations List
	 * 
	 */
	@Override
	public List<Affectations> getAffectations() {	
		return getAffectationsDAO().getAffectations();
	}

	/**
	 * Get Affectations DAO
	 * 
	 * @return IAffectationsDAO - Affectations DAO
	 */
	public IAffectationsDAO getAffectationsDAO() {
		return affectationsDAO;
	}

	/**
	 * Set Affectations DAO
	 * 
	 * @param IAffectationsDAO - Affectations DAO
	 */
	public void setAffectationsDAO(IAffectationsDAO affectationsDAO) {
		this.affectationsDAO = affectationsDAO;
	}
        
        

}
