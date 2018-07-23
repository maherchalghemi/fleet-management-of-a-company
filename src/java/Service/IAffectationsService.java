package Service;

import java.util.List;

import Model.Affectations;

/**
 * 
 * Affectations Service Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface IAffectationsService {
	
	/**
	 * Add Affectations
	 * 
	 * @param  Affectations affectations
	 */
	public void addAffectations(Affectations affectations);
	
	/**
	 * Update Affectations
	 * 
	 * @param  Affectations affectations
	 */
	public void updateAffectations(Affectations affectations);

	/**
	 * Delete Affectations
	 * 
	 * @param  Affectations affectations
	 */
	public void deleteAffectations(Affectations affectations);
	
	/**
	 * Get Affectations
	 * 
	 * @param  int Affectations Id
	 */
	public Affectations getAffectationsById(int id);
	
	/**
	 * Get Affectations List
	 * 
	 * @return List - Affectations list
	 */
	public List<Affectations> getAffectations();
        
       
}
