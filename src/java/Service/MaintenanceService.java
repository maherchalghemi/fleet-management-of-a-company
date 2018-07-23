package Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import Model.Maintenance;
import DAO.IMaintenanceDAO;

/**
 * 
 * Maintenance Service
 * 
 *
 */
@Transactional(readOnly = true)
public class MaintenanceService implements IMaintenanceService {

	// MaintenanceDAO is injected...
	IMaintenanceDAO maintenanceDAO;
	
	/**
	 * Add Maintenance
	 * 
	 * @param  Maintenance maintenance
	 */
	@Transactional(readOnly = false)
	@Override
	public void addMaintenance(Maintenance maintenance) {
		getMaintenanceDAO().addMaintenance(maintenance);
	}

	/**
	 * Delete Maintenance
	 * 
	 * @param  Maintenance maintenance
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteMaintenance(Maintenance maintenance) {
		getMaintenanceDAO().deleteMaintenance(maintenance);
	}
	
	/**
	 * Update Maintenance
	 * 
	 * @param  Maintenance maintenance
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateMaintenance(Maintenance maintenance) {
		getMaintenanceDAO().updateMaintenance(maintenance);
	}
	
	/**
	 * Get Maintenance
	 * 
	 * @param  int Maintenance Id
	 */
	
	public Maintenance getMaintenanceById(int id) {
		return getMaintenanceDAO().getMaintenanceById(id);
	}

	/**
	 * Get Maintenance List
	 * 
	 */
	@Override
	public List<Maintenance> getMaintenance() {	
		return getMaintenanceDAO().getMaintenance();
	}
        
        
        public List<Maintenance> getMaintenanceTraiter() {	
		return getMaintenanceDAO().getMaintenanceTraiter();
	}
        
         public List<Maintenance> getMaintenanceNonTraiter() {	
		return getMaintenanceDAO().getMaintenanceNonTraiter();
	}

	/**
	 * Get Maintenance DAO
	 * 
	 * @return IMaintenanceDAO - Maintenance DAO
	 */
	public IMaintenanceDAO getMaintenanceDAO() {
		return maintenanceDAO;
	}

	/**
	 * Set Maintenance DAO
	 * 
	 * @param IMaintenanceDAO - Maintenance DAO
	 */
	public void setMaintenanceDAO(IMaintenanceDAO maintenanceDAO) {
		this.maintenanceDAO = maintenanceDAO;
	}

}
