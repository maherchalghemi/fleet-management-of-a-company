package DAO;

import java.util.List;

import Model.DemCarb;

/**
 * 
 * DemandCarburant DAO Interface
 * 
 *
 */
public interface IDemandCarburantDAO {

	/**
	 * Add DemandCarburant
	 * 
	 * @param  DemandCarburant demandCarburant
	 */
	public void addDemandCarburant(DemCarb demandCarburant);
	
	/**
	 * Update DemandCarburant
	 * 
	 * @param  DemandCarburant demandCarburant
	 */
	public void updateDemandCarburant(DemCarb demandCarburant);
	
	/**
	 * Delete DemandCarburant
	 * 
	 * @param  DemandCarburant demandCarburant
	 */
	public void deleteDemandCarburant(DemCarb demandCarburant);
	
	/**
	 * Get DemandCarburant
	 * 
	 * @param  int DemandCarburant Id
	 */
	public DemCarb getDemandCarburantById(int id);
	
	/**
	 * Get DemandCarburant List
	 * 
	 */
	public List<DemCarb> getDemandCarburant();
}
