package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.springframework.dao.DataAccessException;

import Model.Carburant;
import Service.ICarburantService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * Carburant Managed Bean
 * 
 *
 */
@ManagedBean(name="carburantMB")
@SessionScoped
public class CarburantManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
	
	//Spring Carburant Service is injected...
	@ManagedProperty(value="#{CarburantService}")
	ICarburantService carburantService;
	
	List<Carburant> carburantList;
        List<Carburant> carburantDispoList;
	
	private int id;
        private Carburant carburant;
	private Carburant selectedCarburant;
	
	
	
	public CarburantManagedBean() {
		selectedCarburant = new Carburant();
                carburant = new Carburant();
	}

	/**
	 * Add Carburant
	 * 
	 * @return String - Response Message
	 */
	public String addCarburant() throws ParseException {
		try {

			getCarburantService().addCarburant(carburant);
			return "/chefmagPag/listecarburant.xhtml?faces-redirect=true";
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	
	/**
	 * Update Carburant
	 * 
	 * @return String - Response Message
	 */
	public String updCarburant() {
		try {
			getCarburantService().updateCarburant(selectedCarburant);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	
	/**
	 * Delete Carburant
	 * 
	 * @return String - Response Message
	 */
	public String deleteCarburant() {
		try {
			getCarburantService().deleteCarburant(selectedCarburant);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	
	/**
	 * Reset Fields
	 * 
	 */
	public void reset() {
		this.setId(0);
	}
	
	/**
	 * Get Carburant List
	 * 
	 * @return List - Carburant List
	 */
	public List<Carburant> getCarburantList() {
            System.out.println("je suis la");
		carburantList = new ArrayList<Carburant>();
		carburantList.addAll(getCarburantService().getCarburant()); 
                 System.out.println(carburantList.size());
		return carburantList;
	}
	
	/**
	 * Get Carburant Service
	 * 
	 * @return ICarburantService - Carburant Service
	 */
	public ICarburantService getCarburantService() {
		return carburantService;
	}

	/**
	 * Set Carburant Service
	 * 
	 * @param ICarburantService - Carburant Service
	 */
	public void setCarburantService(ICarburantService carburantService) {
		this.carburantService = carburantService;
	}
	
	/**
	 * Set Carburant List
	 * 
	 * @param List - Carburant List
	 */
	public void setCarburantList(List<Carburant> carburantList) {
		this.carburantList = carburantList;
	}
	
	/**
	 * Get Carburant Id
	 * 
	 * @return int - Carburant Id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set Carburant Id
	 * 
	 * @param int - Carburant Id
	 */
	public void setId(int id) {
		this.id = id;
	}



	public Carburant getSelectedCarburant() {
		return selectedCarburant;
	}

	public void setSelectedCarburant(Carburant selectedCarburant) {
		this.selectedCarburant = selectedCarburant;
	}

    public Carburant getCarburant() {
        return carburant;
    }

    public void setCarburant(Carburant carburant) {
        this.carburant = carburant;
    }
	
	
}