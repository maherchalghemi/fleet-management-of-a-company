/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.Affectations;
import Model.Carburant;

import Model.DemCarb;

import Service.IAffectationsService;
import Service.ICarburantService;

import Service.IDemandCarburantService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author maho
 */
@ManagedBean(name="demCarbMB")
@SessionScoped
public class DemCarbManagedBean implements Serializable{

    /**
     * Creates a new instance of AffectationManagedBean
     */
	@ManagedProperty(value="#{DemandCarburantService}")
	IDemandCarburantService demandCarburantService;
	@ManagedProperty(value="#{AffectationsService}")
	       IAffectationsService affectationsService;
        @ManagedProperty(value="#{CarburantService}")
	       ICarburantService carburantService;
        
        
        List<DemCarb> demCarbsList;
        
        private int idASelected ;
        private DemCarb demCarb;

        private DemCarb selectDemCarb;
        
        private double carb;
        private int distance;
        private List<String> selectedOptions ; 
        private int qte1;
        private int qte2;
        private int qte3;
        
    
    public DemCarbManagedBean() {
         demCarb = new DemCarb();
    }
   
    public String addDemCarb( Affectations affectations){
      
        demCarb.setAffectations(affectations);
        carb = (getDemCarb().getAffectations().getVehicules().getMoyCons()) *(distance);
        demCarb.setDate(demCarb.getAffectations().getDateS());
        getDemandCarburantService().addDemandCarburant(demCarb);
        
       return "/adminPage/listeaffectation.xhtml?faces-redirect=true";
        
    }
    public double estimer(double consMoy){
    carb = (((consMoy)/100) *(distance)) *(1.5);
    return carb;
    }
    	public void deleteDemCarb() {
            Carburant Car = new Carburant();
            System.out.println("je suis la" + selectedOptions.size());
            for (int i=0; i < selectedOptions.size();i++){
                System.out.println("     gg    " + selectedOptions.get(i) + "     "+ qte1);
                if(selectedOptions.get(i).equals("10")){
                    int qte10 = getCarburantService().getCarburantById(2).getQte() - qte1;
                    Car = getCarburantService().getCarburantById(2);
                    Car.setQte(qte10);
                    getCarburantService().updateCarburant(Car);
                
            }
                if(selectedOptions.get(i).equals("20")){
                    int qte20 = getCarburantService().getCarburantById(1).getQte() - qte2;
                    Car = getCarburantService().getCarburantById(1);
                    Car.setQte(qte20);
                    getCarburantService().updateCarburant(Car);
                
            }
                if(selectedOptions.get(i).equals("50")){
                int qte50 = getCarburantService().getCarburantById(3).getQte() - qte3;
                    Car = getCarburantService().getCarburantById(3);
                    Car.setQte(qte50);
                    getCarburantService().updateCarburant(Car);
            }
            }
		
	getDemandCarburantService().deleteDemandCarburant(selectDemCarb);
		
	}

    public IAffectationsService getAffectationsService() {
        return affectationsService;
    }

    public void setAffectationsService(IAffectationsService affectationsService) {
        this.affectationsService = affectationsService;
    }

    public IDemandCarburantService getDemandCarburantService() {
        return demandCarburantService;
    }

    public void setDemandCarburantService(IDemandCarburantService demandCarburantService) {
        this.demandCarburantService = demandCarburantService;
    }

  

    public DemCarb getSelectDemCarb() {
        return selectDemCarb;
    }

    public void setSelectDemCarb(DemCarb selectDemCarb) {
        this.selectDemCarb = selectDemCarb;
    }

    
  

    public int getIdASelected() {
        return idASelected;
    }

    public void setIdASelected(int idASelected) {
        this.idASelected = idASelected;
    }

    public List<DemCarb> getDemCarbsList() {
        		demCarbsList = new ArrayList<DemCarb>();
		demCarbsList.addAll(getDemandCarburantService().getDemandCarburant()); 
        return demCarbsList;
    }

    public void setDemCarbsList(List<DemCarb> demCarbsList) {
        this.demCarbsList = demCarbsList;
    }

    public DemCarb getDemCarb() {
        return demCarb;
    }

    public void setDemCarb(DemCarb demCarb) {
        this.demCarb = demCarb;
    }

    public double getCarb() {
        return carb;
    }

    public void setCarb(double carb) {
        this.carb = carb;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public List<String> getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(List<String> selectedOptions) {
        this.selectedOptions = new ArrayList<String>();
        this.selectedOptions = selectedOptions;
    }

    public int getQte1() {
        return qte1;
    }

    public void setQte1(int qte1) {
        this.qte1 = qte1;
    }

    public int getQte2() {
        return qte2;
    }

    public void setQte2(int qte2) {
        this.qte2 = qte2;
    }

    public int getQte3() {
        return qte3;
    }

    public void setQte3(int qte3) {
        this.qte3 = qte3;
    }

    public ICarburantService getCarburantService() {
        return carburantService;
    }

    public void setCarburantService(ICarburantService carburantService) {
        this.carburantService = carburantService;
    }
    

    
    
}
