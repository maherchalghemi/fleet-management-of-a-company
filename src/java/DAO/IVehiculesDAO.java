package DAO;

import java.util.List;

import Model.Vehicules;

/**
 * 
 * Vehicules DAO Interface
 * 
 *
 */
public interface IVehiculesDAO {

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
	 * @param  int Vehicules Id
	 */
	public Vehicules getVehiculesById(String id);
	
	/**
	 * Get Vehicules List
	 * 
	 */
	public List<Vehicules> getVehicules();
        
        public List<Vehicules> getVehiculesDispo();
        
        public List<Vehicules> getVehiculesPanne();
}
