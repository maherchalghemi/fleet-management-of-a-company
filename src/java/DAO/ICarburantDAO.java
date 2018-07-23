package DAO;

import java.util.List;

import Model.Carburant;

/**
 * 
 * Carburant DAO Interface
 * 
 *
 */
public interface ICarburantDAO {

	/**
	 * Add Carburant
	 * 
	 * @param  Carburant carburant
	 */
	public void addCarburant(Carburant carburant);
	
	/**
	 * Update Carburant
	 * 
	 * @param  Carburant carburant
	 */
	public void updateCarburant(Carburant carburant);
	
	/**
	 * Delete Carburant
	 * 
	 * @param  Carburant carburant
	 */
	public void deleteCarburant(Carburant carburant);
	
	/**
	 * Get Carburant
	 * 
	 * @param  int Carburant Id
	 */
	public Carburant getCarburantById(int id);
	
	/**
	 * Get Carburant List
	 * 
	 */
	public List<Carburant> getCarburant();
}
