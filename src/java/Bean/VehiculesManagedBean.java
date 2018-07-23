package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.springframework.dao.DataAccessException;

import Model.Vehicules;
import Service.IVehiculesService;
import javax.faces.context.FacesContext;

/**
 * 
 * Vehicules Managed Bean
 * 
 *
 */
@ManagedBean(name="vehiculesMB")
@SessionScoped
public class VehiculesManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
	
	//Spring Vehicules Service is injected...
	@ManagedProperty(value="#{VehiculesService}")
	IVehiculesService vehiculesService;
	
	List<Vehicules> vehiculesList;
        List<Vehicules> vehiculesDispoList;
        List<Vehicules> vehiculesPanneList;
	
	private int id;
	private String name;
	private String surname;
        private Vehicules vehicules;
	private Vehicules selectedVehicules;
	
	
	
	public VehiculesManagedBean() {
		selectedVehicules = new Vehicules();
                vehicules = new Vehicules();
	}

	/**
	 * Add Vehicules
	 * 
	 * @return String - Response Message
	 */
	public String addVehicules() {
		try {
			vehicules.setDispo(1);
                        vehicules.setPanne(0);
			getVehiculesService().addVehicules(vehicules);
			return "/adminPage/welcomePrimefaces.xhtml?faces-redirect=true";
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	
	/**
	 * Update Vehicules
	 * 
	 * @return String - Response Message
	 */
	public String updVehicules() {
		try {
			getVehiculesService().updateVehicules(selectedVehicules);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	
	/**
	 * Delete Vehicules
	 * 
	 * @return String - Response Message
	 */
	public String deleteVehicules() {
		try {
			getVehiculesService().deleteVehicules(selectedVehicules);
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
		this.setName("");
		this.setSurname("");
	}
	
	/**
	 * Get Vehicules List
	 * 
	 * @return List - Vehicules List
	 */
	public List<Vehicules> getVehiculesList() {
            System.out.println("je suis la");
		vehiculesList = new ArrayList<Vehicules>();
		vehiculesList.addAll(getVehiculesService().getVehicules()); 
                 System.out.println(vehiculesList.size());
		return vehiculesList;
	}
	
	/**
	 * Get Vehicules Service
	 * 
	 * @return IVehiculesService - Vehicules Service
	 */
	public IVehiculesService getVehiculesService() {
		return vehiculesService;
	}

	/**
	 * Set Vehicules Service
	 * 
	 * @param IVehiculesService - Vehicules Service
	 */
	public void setVehiculesService(IVehiculesService vehiculesService) {
		this.vehiculesService = vehiculesService;
	}
	
	/**
	 * Set Vehicules List
	 * 
	 * @param List - Vehicules List
	 */
	public void setVehiculesList(List<Vehicules> vehiculesList) {
		this.vehiculesList = vehiculesList;
	}
	
	/**
	 * Get Vehicules Id
	 * 
	 * @return int - Vehicules Id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set Vehicules Id
	 * 
	 * @param int - Vehicules Id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get Vehicules Name
	 * 
	 * @return String - Vehicules Name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set Vehicules Name
	 * 
	 * @param String - Vehicules Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get Vehicules Surname
	 * 
	 * @return String - Vehicules Surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Set Vehicules Surname
	 * 
	 * @param String - Vehicules Surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Vehicules getSelectedVehicules() {
		return selectedVehicules;
	}

	public void setSelectedVehicules(Vehicules selectedVehicules) {
		this.selectedVehicules = selectedVehicules;
	}

    public Vehicules getVehicules() {
        return vehicules;
    }

    public void setVehicules(Vehicules vehicules) {
        this.vehicules = vehicules;
    }

    public List<Vehicules> getVehiculesDispoList() {
        vehiculesDispoList = new ArrayList<Vehicules>();
		vehiculesDispoList.addAll(getVehiculesService().getVehiculesDispo()); 
                 System.out.println(vehiculesDispoList.size());
        return vehiculesDispoList;
    }

    public void setVehiculesDispoList(List<Vehicules> vehiculesDispoList) {
        this.vehiculesDispoList = vehiculesDispoList;
    }

    public List<Vehicules> getVehiculesPanneList() {
        vehiculesPanneList = new ArrayList<Vehicules>();
        vehiculesPanneList.addAll(getVehiculesService().getVehiculesPanne());
        System.out.println(vehiculesDispoList.size());
        return vehiculesPanneList;
    }

    public void setVehiculesPanneList(List<Vehicules> vehiculesPanneList) {
        this.vehiculesPanneList = vehiculesPanneList;
    }
	
	
	
}