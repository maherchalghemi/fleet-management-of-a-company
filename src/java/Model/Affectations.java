package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * Affectations entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "affectations", catalog = "flauto")
public class Affectations implements java.io.Serializable {

	// Fields

	private Integer idAffectations;
	private Chauffeurs chauffeurs;
	private Vehicules vehicules;
	private Date dateS;
	private Date dateR;
	private String mission;
	private String parcour;
	private List<DemCarb> demCarbs = new ArrayList<DemCarb>(0);

	// Constructors

	/** default constructor */
	public Affectations() {
	}

	/** minimal constructor */
	public Affectations(Chauffeurs chauffeurs, Vehicules vehicules, Date dateS,
			Date dateR, String mission, String parcour) {
		this.chauffeurs = chauffeurs;
		this.vehicules = vehicules;
		this.dateS = dateS;
		this.dateR = dateR;
		this.mission = mission;
		this.parcour = parcour;
	}

	/** full constructor */
	public Affectations(Chauffeurs chauffeurs, Vehicules vehicules, Date dateS,
			Date dateR, String mission, String parcour, List<DemCarb> demCarbs) {
		this.chauffeurs = chauffeurs;
		this.vehicules = vehicules;
		this.dateS = dateS;
		this.dateR = dateR;
		this.mission = mission;
		this.parcour = parcour;
		this.demCarbs = demCarbs;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_affectations", unique = true, nullable = false)
	public Integer getIdAffectations() {
		return this.idAffectations;
	}

	public void setIdAffectations(Integer idAffectations) {
		this.idAffectations = idAffectations;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_c", nullable = false)
	public Chauffeurs getChauffeurs() {
		return this.chauffeurs;
	}

	public void setChauffeurs(Chauffeurs chauffeurs) {
		this.chauffeurs = chauffeurs;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_v", nullable = false)
	public Vehicules getVehicules() {
		return this.vehicules;
	}

	public void setVehicules(Vehicules vehicules) {
		this.vehicules = vehicules;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_s", nullable = false, length = 10)
	public Date getDateS() {
		return this.dateS;
	}

	public void setDateS(Date dateS) {
		this.dateS = dateS;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_r", nullable = false, length = 10)
	public Date getDateR() {
		return this.dateR;
	}

	public void setDateR(Date dateR) {
		this.dateR = dateR;
	}

	@Column(name = "mission", nullable = false, length = 65535)
	public String getMission() {
		return this.mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	@Column(name = "parcour", nullable = false, length = 20)
	public String getParcour() {
		return this.parcour;
	}

	public void setParcour(String parcour) {
		this.parcour = parcour;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "affectations")
	public List<DemCarb> getDemCarbs() {
		return this.demCarbs;
	}

	public void setDemCarbs(List<DemCarb> demCarbs) {
		this.demCarbs = demCarbs;
	}

    public void setAffectations(Affectations affectations) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}