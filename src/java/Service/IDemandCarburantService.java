package Service;

import java.util.List;

import Model.DemCarb;

/**
 * 
 * DemandCarburant Service Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface IDemandCarburantService {
	
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
	 * @return List - DemandCarburant list
	 */
	public List<DemCarb> getDemandCarburant();
}
