package Service;

import java.util.List;

import Model.Chauffeurs;

/**
 * 
 * Chauffeurs Service Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface IChauffeursService {
	
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
	 * @return List - Chauffeurs list
	 */
	public List<Chauffeurs> getChauffeurs();
        
        public List<Chauffeurs> getChauffeursDispo();
}
