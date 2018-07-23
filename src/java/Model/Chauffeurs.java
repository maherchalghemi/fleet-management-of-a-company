package Model;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * Chauffeurs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "chauffeurs", catalog = "flauto")
public class Chauffeurs implements java.io.Serializable {

	// Fields

	private Integer idC;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String tel;
	private String adr;
	private String cin;
	private Integer diispo;
	private Set<Affectations> affectationses = new HashSet<Affectations>(0);

	// Constructors

	/** default constructor */
	public Chauffeurs() {
	}

	/** minimal constructor */
	public Chauffeurs(String nom, String prenom, Date dateNaissance,
			String tel, String adr, String cin, Integer diispo) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.tel = tel;
		this.adr = adr;
		this.cin = cin;
		this.diispo = diispo;
	}

	/** full constructor */
	public Chauffeurs(String nom, String prenom, Date dateNaissance,
			String tel, String adr, String cin, Integer diispo,
			Set<Affectations> affectationses) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.tel = tel;
		this.adr = adr;
		this.cin = cin;
		this.diispo = diispo;
		this.affectationses = affectationses;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_c", unique = true, nullable = false)
	public Integer getIdC() {
		return this.idC;
	}

	public void setIdC(Integer idC) {
		this.idC = idC;
	}

	@Column(name = "nom", nullable = false, length = 50)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false, length = 50)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_naissance", nullable = false, length = 10)
	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Column(name = "tel", nullable = false, length = 20)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "adr", nullable = false, length = 100)
	public String getAdr() {
		return this.adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	@Column(name = "cin", nullable = false, length = 8)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Column(name = "diispo", nullable = false)
	public Integer getDiispo() {
		return this.diispo;
	}

	public void setDiispo(Integer diispo) {
		this.diispo = diispo;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "chauffeurs")
	public Set<Affectations> getAffectationses() {
		return this.affectationses;
	}

	public void setAffectationses(Set<Affectations> affectationses) {
		this.affectationses = affectationses;
	}

}