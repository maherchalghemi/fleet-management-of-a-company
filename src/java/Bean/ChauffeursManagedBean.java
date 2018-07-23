package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.springframework.dao.DataAccessException;
import Model.Chauffeurs;
import Service.IChauffeursService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * Chauffeurs Managed Bean
 *
 *
 */
@ManagedBean(name = "chauffeursMB")
@SessionScoped
public class ChauffeursManagedBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    //Spring Chauffeurs Service is injected...
    @ManagedProperty(value = "#{ChauffeursService}")
    IChauffeursService chauffeursService;

    List<Chauffeurs> chauffeursList;
    List<Chauffeurs> chauffeursDispoList;

    private int id;
    private String day;
    private String month;
    private String year;
    private Chauffeurs chauffeurs;
    private Chauffeurs selectedChauffeurs;

    public ChauffeursManagedBean() {
        selectedChauffeurs = new Chauffeurs();
        chauffeurs = new Chauffeurs();
    }

    /**
     * Add Chauffeurs
     *
     * @return String - Response Message
     */
    public String addChauffeurs() throws ParseException {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String dateInString = day + "/" + month + "/" + year;

            Date date = formatter.parse(dateInString);
            chauffeurs.setDateNaissance(date);
            chauffeurs.setDiispo(1);
            getChauffeursService().addChauffeurs(chauffeurs);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Ajout chauffeur avec succes", ""));
            return "/adminPage/listechauffeur.xhtml?faces-redirect=true";
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return ERROR;
    }

    /**
     * Update Chauffeurs
     *
     * @return String - Response Message
     */
    public String updChauffeurs() {
        try {
            getChauffeursService().updateChauffeurs(selectedChauffeurs);
            return SUCCESS;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return ERROR;
    }

    /**
     * Delete Chauffeurs
     *
     * @return String - Response Message
     */
    public String deleteChauffeurs() {
        try {
            getChauffeursService().deleteChauffeurs(selectedChauffeurs);
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
     * Get Chauffeurs List
     *
     * @return List - Chauffeurs List
     */
    public List<Chauffeurs> getChauffeursList() {
        System.out.println("je suis la");
        chauffeursList = new ArrayList<Chauffeurs>();
        chauffeursList.addAll(getChauffeursService().getChauffeurs());
        System.out.println(chauffeursList.size());
        return chauffeursList;
    }

    /**
     * Get Chauffeurs Service
     *
     * @return IChauffeursService - Chauffeurs Service
     */
    public IChauffeursService getChauffeursService() {
        return chauffeursService;
    }

    /**
     * Set Chauffeurs Service
     *
     * @param IChauffeursService - Chauffeurs Service
     */
    public void setChauffeursService(IChauffeursService chauffeursService) {
        this.chauffeursService = chauffeursService;
    }

    /**
     * Set Chauffeurs List
     *
     * @param List - Chauffeurs List
     */
    public void setChauffeursList(List<Chauffeurs> chauffeursList) {
        this.chauffeursList = chauffeursList;
    }

    /**
     * Get Chauffeurs Id
     *
     * @return int - Chauffeurs Id
     */
    public int getId() {
        return id;
    }

    /**
     * Set Chauffeurs Id
     *
     * @param int - Chauffeurs Id
     */
    public void setId(int id) {
        this.id = id;
    }

    public Chauffeurs getSelectedChauffeurs() {
        return selectedChauffeurs;
    }

    public void setSelectedChauffeurs(Chauffeurs selectedChauffeurs) {
        this.selectedChauffeurs = selectedChauffeurs;
    }

    public Chauffeurs getChauffeurs() {
        return chauffeurs;
    }

    public void setChauffeurs(Chauffeurs chauffeurs) {
        this.chauffeurs = chauffeurs;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Chauffeurs> getChauffeursDispoList() {
        chauffeursDispoList = new ArrayList<Chauffeurs>();
        chauffeursDispoList.addAll(getChauffeursService().getChauffeursDispo());
        return chauffeursDispoList;
    }

    public void setChauffeursDispoList(List<Chauffeurs> chauffeursDispoList) {
        this.chauffeursDispoList = chauffeursDispoList;
    }

}
