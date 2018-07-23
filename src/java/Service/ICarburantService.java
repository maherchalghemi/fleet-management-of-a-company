package Service;

import java.util.List;

import Model.Carburant;

/**
 * 
 * Carburant Service Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface ICarburantService {
	
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
	 * @return List - Carburant list
	 */
	public List<Carburant> getCarburant();
}
