package Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import Model.Chauffeurs;
import DAO.IChauffeursDAO;

/**
 * 
 * Chauffeurs Service
 * 
 *
 */
@Transactional(readOnly = true)
public class ChauffeursService implements IChauffeursService {

	// ChauffeursDAO is injected...
	IChauffeursDAO chauffeursDAO;
	
	/**
	 * Add Chauffeurs
	 * 
	 * @param  Chauffeurs chauffeurs
	 */
	@Transactional(readOnly = false)
	@Override
	public void addChauffeurs(Chauffeurs chauffeurs) {
		getChauffeursDAO().addChauffeurs(chauffeurs);
	}

	/**
	 * Delete Chauffeurs
	 * 
	 * @param  Chauffeurs chauffeurs
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteChauffeurs(Chauffeurs chauffeurs) {
		getChauffeursDAO().deleteChauffeurs(chauffeurs);
	}
	
	/**
	 * Update Chauffeurs
	 * 
	 * @param  Chauffeurs chauffeurs
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateChauffeurs(Chauffeurs chauffeurs) {
		getChauffeursDAO().updateChauffeurs(chauffeurs);
	}
	
	/**
	 * Get Chauffeurs
	 * 
	 * @param  int Chauffeurs Id
	 */
	
	public Chauffeurs getChauffeursById(int id) {
		return getChauffeursDAO().getChauffeursById(id);
	}

	/**
	 * Get Chauffeurs List
	 * 
	 */
	@Override
	public List<Chauffeurs> getChauffeurs() {	
		return getChauffeursDAO().getChauffeurs();
	}
        
        /**
	 * Get Chauffeurs Dispo List
	 * 
	 */
	@Override
	public List<Chauffeurs> getChauffeursDispo() {	
		return getChauffeursDAO().getChauffeursDispo();
	}

	/**
	 * Get Chauffeurs DAO
	 * 
	 * @return IChauffeursDAO - Chauffeurs DAO
	 */
	public IChauffeursDAO getChauffeursDAO() {
		return chauffeursDAO;
	}

	/**
	 * Set Chauffeurs DAO
	 * 
	 * @param IChauffeursDAO - Chauffeurs DAO
	 */
	public void setChauffeursDAO(IChauffeursDAO chauffeursDAO) {
		this.chauffeursDAO = chauffeursDAO;
	}

}
