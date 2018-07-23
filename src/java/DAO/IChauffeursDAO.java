package DAO;

import java.util.List;

import Model.Chauffeurs;

/**
 * 
 * Chauffeurs DAO Interface
 * 
 *
 */
public interface IChauffeursDAO {

	/**
	 * Add Chauffeurs
	 * 
	 * @param  Chauffeurs chauffeurs
	 */
	public void addChauffeurs(Chauffeurs chauffeurs);
	
	/**
	 * Update Chauffeurs
	 * 
	 * @param  Chauffeurs chauffeurs
	 */
	public void updateChauffeurs(Chauffeurs chauffeurs);
	
	/**
	 * Delete Chauffeurs
	 * 
	 * @param  Chauffeurs chauffeurs
	 */
	public void deleteChauffeurs(Chauffeurs chauffeurs);
	
	/**
	 * Get Chauffeurs
	 * 
	 * @param  int Chauffeurs Id
	 */
	public Chauffeurs getChauffeursById(int id);
	
	/**
	 * Get Chauffeurs List
	 * 
	 */
	public List<Chauffeurs> getChauffeurs();
        
        public List<Chauffeurs> getChauffeursDispo();
}
