package Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import Model.Vehicules;
import DAO.IVehiculesDAO;

/**
 * 
 * Vehicules Service
 * 
 *
 */
@Transactional(readOnly = true)
public class VehiculesService implements IVehiculesService {

	// VehiculesDAO is injected...
	IVehiculesDAO vehiculesDAO;
	
	/**
	 * Add Vehicules
	 * 
	 * @param  Vehicules vehicules
	 */
	@Transactional(readOnly = false)
	@Override
	public void addVehicules(Vehicules vehicules) {
		getVehiculesDAO().addVehicules(vehicules);
	}

	/**
	 * Delete Vehicules
	 * 
	 * @param  Vehicules vehicules
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteVehicules(Vehicules vehicules) {
		getVehiculesDAO().deleteVehicules(vehicules);
	}
	
	/**
	 * Update Vehicules
	 * 
	 * @param  Vehicules vehicules
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateVehicules(Vehicules vehicules) {
		getVehiculesDAO().updateVehicules(vehicules);
	}
	
	/**
	 * Get Vehicules
	 * 
	 * @param  String Vehicules Id
	 */
	
	public Vehicules getVehiculesById(String id) {
		return getVehiculesDAO().getVehiculesById(id);
	}

	/**
	 * Get Vehicules List
	 * 
	 */
	@Override
	public List<Vehicules> getVehicules() {	
		return getVehiculesDAO().getVehicules();
	}
        
        /**
	 * Get Vehicules Dispo List
	 * 
	 */
	@Override
	public List<Vehicules> getVehiculesDispo() {	
		return getVehiculesDAO().getVehiculesDispo();
	}

	/**
	 * Get Vehicules DAO
	 * 
	 * @return IVehiculesDAO - Vehicules DAO
	 */
        
	public List<Vehicules> getVehiculesPanne() {	
		return getVehiculesDAO().getVehiculesPanne();
	}
	public IVehiculesDAO getVehiculesDAO() {
		return vehiculesDAO;
	}

	/**
	 * Set Vehicules DAO
	 * 
	 * @param IVehiculesDAO - Vehicules DAO
	 */
	public void setVehiculesDAO(IVehiculesDAO vehiculesDAO) {
		this.vehiculesDAO = vehiculesDAO;
	}

}
