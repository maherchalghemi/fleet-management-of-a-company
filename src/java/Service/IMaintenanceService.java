package Service;

import java.util.List;

import Model.Maintenance;

/**
 * 
 * Maintenance Service Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface IMaintenanceService {
	
	/**
	 * Add Maintenance
	 * 
	 * @param  Maintenance maintenance
	 */
	public void addMaintenance(Maintenance maintenance);
	
	/**
	 * Update Maintenance
	 * 
	 * @param  Maintenance maintenance
	 */
	public void updateMaintenance(Maintenance maintenance);

	/**
	 * Delete Maintenance
	 * 
	 * @param  Maintenance maintenance
	 */
	public void deleteMaintenance(Maintenance maintenance);
	
	/**
	 * Get Maintenance
	 * 
	 * @param  int Maintenance Id
	 */
	public Maintenance getMaintenanceById(int id);
	
	/**
	 * Get Maintenance List
	 * 
	 * @return List - Maintenance list
	 */
	public List<Maintenance> getMaintenance();
        public List<Maintenance> getMaintenanceTraiter();
        public List<Maintenance> getMaintenanceNonTraiter();
}
