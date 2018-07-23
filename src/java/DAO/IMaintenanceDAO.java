package DAO;

import java.util.List;

import Model.Maintenance;

/**
 * 
 * Maintenance DAO Interface
 * 
 *
 */
public interface IMaintenanceDAO {

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
	 */
	public List<Maintenance> getMaintenance();
        
        public List<Maintenance> getMaintenanceTraiter();
        public List<Maintenance> getMaintenanceNonTraiter() ;
}
