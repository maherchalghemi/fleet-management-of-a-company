package Model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Vehicules entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "vehicules", catalog = "flauto")
public class Vehicules implements java.io.Serializable {

	// Fields

	private String idV;
	private String carros;
	private String marque;
	private String model;
	private Integer dispo;
	private Integer panne;
	private String couleur;
	private Integer puissF;
	private Integer puissD;
	private double moyCons;
	private Set<Affectations> affectationses = new HashSet<Affectations>(0);
	private Set<Maintenance> maintenances = new HashSet<Maintenance>(0);

	// Constructors

	/** default constructor */
	public Vehicules() {
	}

	/** minimal constructor */
	public Vehicules(String carros, String marque, String model, Integer dispo,
			Integer panne, String couleur, Integer puissF, Integer puissD,
			double moyCons) {
		this.carros = carros;
		this.marque = marque;
		this.model = model;
		this.dispo = dispo;
		this.panne = panne;
		this.couleur = couleur;
		this.puissF = puissF;
		this.puissD = puissD;
		this.moyCons = moyCons;
	}

	/** full constructor */
	public Vehicules(String carros, String marque, String model, Integer dispo,
			Integer panne, String couleur, Integer puissF, Integer puissD,
			double moyCons, Set<Affectations> affectationses,
			Set<Maintenance> maintenances) {
		this.carros = carros;
		this.marque = marque;
		this.model = model;
		this.dispo = dispo;
		this.panne = panne;
		this.couleur = couleur;
		this.puissF = puissF;
		this.puissD = puissD;
		this.moyCons = moyCons;
		this.affectationses = affectationses;
		this.maintenances = maintenances;
	}

	// Property accessors
	
	@Id
	@Column(name = "id_v", unique = true, nullable = false, length = 8)
	public String getIdV() {
		return this.idV;
	}

	public void setIdV(String idV) {
		this.idV = idV;
	}

	@Column(name = "carros", nullable = false, length = 15)
	public String getCarros() {
		return this.carros;
	}

	public void setCarros(String carros) {
		this.carros = carros;
	}

	@Column(name = "marque", nullable = false, length = 15)
	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Column(name = "model", nullable = false, length = 15)
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "dispo", nullable = false)
	public Integer getDispo() {
		return this.dispo;
	}

	public void setDispo(Integer dispo) {
		this.dispo = dispo;
	}

	@Column(name = "panne", nullable = false)
	public Integer getPanne() {
		return this.panne;
	}

	public void setPanne(Integer panne) {
		this.panne = panne;
	}

	@Column(name = "couleur", nullable = false, length = 10)
	public String getCouleur() {
		return this.couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Column(name = "puiss_f", nullable = false)
	public Integer getPuissF() {
		return this.puissF;
	}

	public void setPuissF(Integer puissF) {
		this.puissF = puissF;
	}

	@Column(name = "puiss_d", nullable = false)
	public Integer getPuissD() {
		return this.puissD;
	}

	public void setPuissD(Integer puissD) {
		this.puissD = puissD;
	}

	@Column(name = "moy_cons", nullable = false, precision = 5, scale = 3)
	public double getMoyCons() {
		return this.moyCons;
	}

	public void setMoyCons(double moyCons) {
		this.moyCons = moyCons;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "vehicules")
	public Set<Affectations> getAffectationses() {
		return this.affectationses;
	}

	public void setAffectationses(Set<Affectations> affectationses) {
		this.affectationses = affectationses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "vehicules")
	public Set<Maintenance> getMaintenances() {
		return this.maintenances;
	}

	public void setMaintenances(Set<Maintenance> maintenances) {
		this.maintenances = maintenances;
	}

}