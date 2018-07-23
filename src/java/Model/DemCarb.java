package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * DemCarb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "dem_carb", catalog = "flauto")
public class DemCarb implements java.io.Serializable {

	// Fields

	private Integer idDemCarb;
	private Affectations affectations;
	private Integer prix;
	private Date date;
       

 
	// Constructors

	/** default constructor */
	public DemCarb() {
	}

	/** minimal constructor */
	public DemCarb(Integer prix, Date date) {
		this.prix = prix;
		this.date = date;
	}

	/** full constructor */
	public DemCarb(Affectations affectations, Integer prix, Date date) {
		this.affectations = affectations;
		this.prix = prix;
		this.date = date;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_demCarb", unique = true, nullable = false)
	public Integer getIdDemCarb() {
		return this.idDemCarb;
	}

	public void setIdDemCarb(Integer idDemCarb) {
		this.idDemCarb = idDemCarb;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_affectation")
	public Affectations getAffectations() {
		return this.affectations;
	}

	public void setAffectations(Affectations affectations) {
		this.affectations = affectations;
	}

	@Column(name = "prix", nullable = false)
	public Integer getPrix() {
		return this.prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}