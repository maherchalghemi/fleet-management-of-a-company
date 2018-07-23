package DAO;

import java.util.List;

import Model.Affectations;

/**
 * 
 * Affectations DAO Interface
 * 
 *
 */
public interface IAffectationsDAO {

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
	 */
	public List<Affectations> getAffectations();
       
}
