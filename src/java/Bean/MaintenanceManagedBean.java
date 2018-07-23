/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.Maintenance;
import Model.Vehicules;
import Service.IMaintenanceService;
import Service.IVehiculesService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static java.util.jar.Pack200.Packer.ERROR;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.text.ParseException;
import static javax.security.auth.message.AuthStatus.SUCCESS;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author maho
 */
@ManagedBean(name="maintenanceMB")
@SessionScoped
public class MaintenanceManagedBean implements Serializable{

    /**
     * Creates a new instance of AffectationManagedBean
     */
	
	@ManagedProperty(value="#{MaintenanceService}")
	       IMaintenanceService maintenanceService;
        @ManagedProperty(value="#{VehiculesService}")
	IVehiculesService vehiculesService;
        
        List<Maintenance> maintenanceList;
        List<Maintenance> maintenanceTraiterList;
        List<Maintenance> maintenanceNonTraiterList;
        private String idVSelected ;
        
        private Maintenance maintenance;

        private Maintenance selectMaintenance;

    
    public MaintenanceManagedBean() {
         maintenance = new Maintenance();
    }
   
    public void addMaintenance( String idVSelected){
        
       
        Vehicules vehicule = new Vehicules();
        vehicule = getVehiculesService().getVehiculesById(idVSelected);
        
        
        maintenance.setVehicules(vehicule);
        
        getMaintenanceService().addMaintenance(maintenance);
        
        
        vehicule.setPanne(1);
        getVehiculesService().updateVehicules(vehicule);
        
       //return "/demandcarburant.xhtml";
        
    }
    	public void deleteMaintenance() {
            try{
               
        
        
	getMaintenanceService().deleteMaintenance(selectMaintenance);
        
		
        
            }catch (Exception e){
                System.out.println(e);
            }
	
	}
        
        public void updMaintenance() {
		
            selectMaintenance.setTaiter(1);
			getMaintenanceService().updateMaintenance(selectMaintenance);
                        Vehicules vehicule = new Vehicules();
                System.out.println("1" + selectMaintenance.getIdMaintenance() + selectMaintenance.getPanne() +selectMaintenance.getDateFir() + selectMaintenance.getQte() + selectMaintenance.toString() );
        vehicule = getVehiculesService().getVehiculesById(selectMaintenance.getVehicules().getIdV());
            System.out.println("2");
                        System.out.println("3");
		vehicule.setPanne(0);
                System.out.println("4");
        getVehiculesService().updateVehicules(vehicule);
            System.out.println("5");
		
	}

    public IMaintenanceService getMaintenanceService() {
        return maintenanceService;
    }

    public void setMaintenanceService(IMaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    
    public Maintenance getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public IVehiculesService getVehiculesService() {
        return vehiculesService;
    }

    public void setVehiculesService(IVehiculesService vehiculesService) {
        this.vehiculesService = vehiculesService;
    }

    public Maintenance getSelectMaintenance() {
        return selectMaintenance;
    }

    public void setSelectMaintenance(Maintenance selectMaintenance) {
        this.selectMaintenance = selectMaintenance;
    }

    public String getIdVSelected() {
        return idVSelected;
    }

    public void setIdVSelected(String idVSelected) {
        this.idVSelected = idVSelected;
    }



    public List<Maintenance> getMaintenanceList() {
        		maintenanceList = new ArrayList<Maintenance>();
		maintenanceList.addAll(getMaintenanceService().getMaintenance()); 
        return maintenanceList;
    }

    public void setMaintenanceList(List<Maintenance> maintenanceList) {
        this.maintenanceList = maintenanceList;
    }
    
     public List<Maintenance> getMaintenanceTraiterList() {
        		maintenanceTraiterList = new ArrayList<Maintenance>();
		maintenanceTraiterList.addAll(getMaintenanceService().getMaintenanceTraiter()); 
        return maintenanceTraiterList;
    }

    public void setMaintenanceTraiterList(List<Maintenance> maintenanceTraiterList) {
        this.maintenanceTraiterList = maintenanceTraiterList;
    }
    

    
        public List<Maintenance> getMaintenanceNonTraiterList() {
        		maintenanceNonTraiterList = new ArrayList<Maintenance>();
		maintenanceNonTraiterList.addAll(getMaintenanceService().getMaintenanceNonTraiter()); 
        return maintenanceNonTraiterList;
    }

    public void setMaintenanceNonTraiterList(List<Maintenance> maintenanceNonTraiterList) {
        this.maintenanceNonTraiterList = maintenanceNonTraiterList;
    }
}
