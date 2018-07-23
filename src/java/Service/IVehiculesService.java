package Service;

import java.util.List;

import Model.Vehicules;

/**
 * 
 * Vehicules Service Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface IVehiculesService {
	
	/**
	 * Add Vehicules
	 * 
	 * @param  Vehicules vehicules
	 */
	public void addVehicules(Vehicules vehicules);
	
	/**
	 * Update Vehicules
	 * 
	 * @param  Vehicules vehicules
	 */
	public void updateVehicules(Vehicules vehicules);

	/**
	 * Delete Vehicules
	 * 
	 * @param  Vehicules vehicules
	 */
	public void deleteVehicules(Vehicules vehicules);
	
	/**
	 * Get Vehicules
	 * 
	 * @param  String Vehicules Id
	 */
	public Vehicules getVehiculesById(String id);
	
	/**
	 * Get Vehicules List
	 * 
	 * @return List - Vehicules list
	 */
	public List<Vehicules> getVehicules();
        
        public List<Vehicules> getVehiculesDispo();
        
        public List<Vehicules> getVehiculesPanne();
}
