package Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import Model.Carburant;
import DAO.ICarburantDAO;

/**
 * 
 * Carburant Service
 * 
 *
 */
@Transactional(readOnly = true)
public class CarburantService implements ICarburantService {

	// CarburantDAO is injected...
	ICarburantDAO carburantDAO;
	
	/**
	 * Add Carburant
	 * 
	 * @param  Carburant carburant
	 */
	@Transactional(readOnly = false)
	@Override
	public void addCarburant(Carburant carburant) {
		getCarburantDAO().addCarburant(carburant);
	}

	/**
	 * Delete Carburant
	 * 
	 * @param  Carburant carburant
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteCarburant(Carburant carburant) {
		getCarburantDAO().deleteCarburant(carburant);
	}
	
	/**
	 * Update Carburant
	 * 
	 * @param  Carburant carburant
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateCarburant(Carburant carburant) {
		getCarburantDAO().updateCarburant(carburant);
	}
	
	/**
	 * Get Carburant
	 * 
	 * @param  int Carburant Id
	 */
	
	public Carburant getCarburantById(int id) {
		return getCarburantDAO().getCarburantById(id);
	}

	/**
	 * Get Carburant List
	 * 
	 */
	@Override
	public List<Carburant> getCarburant() {	
		return getCarburantDAO().getCarburant();
	}

	/**
	 * Get Carburant DAO
	 * 
	 * @return ICarburantDAO - Carburant DAO
	 */
	public ICarburantDAO getCarburantDAO() {
		return carburantDAO;
	}

	/**
	 * Set Carburant DAO
	 * 
	 * @param ICarburantDAO - Carburant DAO
	 */
	public void setCarburantDAO(ICarburantDAO carburantDAO) {
		this.carburantDAO = carburantDAO;
	}

}
