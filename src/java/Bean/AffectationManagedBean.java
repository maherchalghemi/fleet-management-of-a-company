/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.Affectations;
import Model.Chauffeurs;
import Model.Vehicules;
import Service.IAffectationsService;
import Service.IChauffeursService;
import Service.IVehiculesService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static java.util.jar.Pack200.Packer.ERROR;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author maho
 */
@ManagedBean(name="affectationMB")
@SessionScoped
public class AffectationManagedBean implements Serializable{

    /**
     * Creates a new instance of AffectationManagedBean
     */
	@ManagedProperty(value="#{ChauffeursService}")
	IChauffeursService chauffeursService;
	@ManagedProperty(value="#{AffectationsService}")
	       IAffectationsService affectationsService;
        @ManagedProperty(value="#{VehiculesService}")
	IVehiculesService vehiculesService;
        
        List<Affectations> affectationList;
        List<Affectations> affectationNretourList;
        private String idVSelected ;
        private String idCSelected ;
        private Affectations affectations;

        private Affectations selectAffectations;

    
    public AffectationManagedBean() {
         affectations = new Affectations();
    }
   
    public String affectation( int idCSelected){
        
        Chauffeurs chauffeurs = new Chauffeurs();
        chauffeurs =  getChauffeursService().getChauffeursById(idCSelected);
        Vehicules vehicule = new Vehicules();
        vehicule = getVehiculesService().getVehiculesById(idVSelected);
        
        affectations.setChauffeurs(chauffeurs);
        affectations.setVehicules(vehicule);
        
        getAffectationsService().addAffectations(affectations);
        chauffeurs.setDiispo(0);
        getChauffeursService().updateChauffeurs(chauffeurs);
        vehicule.setDispo(0);
        getVehiculesService().updateVehicules(vehicule);
        
       return "/adminPage/demandcarburant.xhtml?faces-redirect=true";
        
    }
    	public void deleteAffectations() {
            try{
                
	getAffectationsService().deleteAffectations(selectAffectations);
        Chauffeurs chauffeurs = new Chauffeurs();
        chauffeurs =  getChauffeursService().getChauffeursById(selectAffectations.getChauffeurs().getIdC());
        Vehicules vehicule = new Vehicules();
        vehicule = getVehiculesService().getVehiculesById(selectAffectations.getVehicules().getIdV());
        
	chauffeurs.setDiispo(1);
        getChauffeursService().updateChauffeurs(chauffeurs);	
        vehicule.setDispo(1);
        getVehiculesService().updateVehicules(vehicule);
            }catch (Exception e){
                System.out.println(e);
            }
	
	}

    public IAffectationsService getAffectationsService() {
        return affectationsService;
    }

    public void setAffectationsService(IAffectationsService affectationsService) {
        this.affectationsService = affectationsService;
    }

    public IChauffeursService getChauffeursService() {
        return chauffeursService;
    }

    public void setChauffeursService(IChauffeursService chauffeursService) {
        this.chauffeursService = chauffeursService;
    }

    public Affectations getAffectations() {
        return affectations;
    }

    public void setAffectations(Affectations affectations) {
        this.affectations = affectations;
    }

    public IVehiculesService getVehiculesService() {
        return vehiculesService;
    }

    public void setVehiculesService(IVehiculesService vehiculesService) {
        this.vehiculesService = vehiculesService;
    }

    public Affectations getSelectAffectations() {
        return selectAffectations;
    }

    public void setSelectAffectations(Affectations selectAffectations) {
        this.selectAffectations = selectAffectations;
    }

    public String getIdVSelected() {
        return idVSelected;
    }

    public void setIdVSelected(String idVSelected) {
        this.idVSelected = idVSelected;
    }

  

    public String getIdCSelected() {
        return idCSelected;
    }

    public void setIdCSelected(String idCSelected) {
        this.idCSelected = idCSelected;
    }

    public List<Affectations> getAffectationList() {
        		affectationList = new ArrayList<Affectations>();
		affectationList.addAll(getAffectationsService().getAffectations()); 
        return affectationList;
    }

    public void setAffectationList(List<Affectations> affectationList) {
        this.affectationList = affectationList;
    }

   

   
    

    
}
