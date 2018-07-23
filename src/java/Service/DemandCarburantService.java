package Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import Model.DemCarb;
import DAO.IDemandCarburantDAO;

/**
 * 
 * DemandCarburant Service
 * 
 *
 */
@Transactional(readOnly = true)
public class DemandCarburantService implements IDemandCarburantService {

	// DemandCarburantDAO is injected...
	IDemandCarburantDAO demandCarburantDAO;
	
	/**
	 * Add DemandCarburant
	 * 
	 * @param  DemandCarburant demandCarburant
	 */
	@Transactional(readOnly = false)
	@Override
	public void addDemandCarburant(DemCarb demandCarburant) {
		getDemandCarburantDAO().addDemandCarburant(demandCarburant);
	}

	/**
	 * Delete DemandCarburant
	 * 
	 * @param  DemandCarburant demandCarburant
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteDemandCarburant(DemCarb demandCarburant) {
		getDemandCarburantDAO().deleteDemandCarburant(demandCarburant);
	}
	
	/**
	 * Update DemandCarburant
	 * 
	 * @param  DemandCarburant demandCarburant
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateDemandCarburant(DemCarb demandCarburant) {
		getDemandCarburantDAO().updateDemandCarburant(demandCarburant);
	}
	
	/**
	 * Get DemandCarburant
	 * 
	 * @param  int DemandCarburant Id
	 */
	
	public DemCarb getDemandCarburantById(int id) {
		return getDemandCarburantDAO().getDemandCarburantById(id);
	}

	/**
	 * Get DemandCarburant List
	 * 
	 */
	@Override
	public List<DemCarb> getDemandCarburant() {	
		return getDemandCarburantDAO().getDemandCarburant();
	}

	/**
	 * Get DemandCarburant DAO
	 * 
	 * @return IDemandCarburantDAO - DemandCarburant DAO
	 */
	public IDemandCarburantDAO getDemandCarburantDAO() {
		return demandCarburantDAO;
	}

	/**
	 * Set DemandCarburant DAO
	 * 
	 * @param IDemandCarburantDAO - DemandCarburant DAO
	 */
	public void setDemandCarburantDAO(IDemandCarburantDAO demandCarburantDAO) {
		this.demandCarburantDAO = demandCarburantDAO;
	}

}
