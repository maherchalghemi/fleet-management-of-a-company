package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Carburant entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "carburant", catalog = "flauto")
public class Carburant implements java.io.Serializable {

	// Fields

	private Integer idCar;
	private Integer categorie;
	private Integer qte;

	// Constructors

	/** default constructor */
	public Carburant() {
	}

	/** full constructor */
	public Carburant(Integer categorie, Integer qte) {
		this.categorie = categorie;
		this.qte = qte;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_car", unique = true, nullable = false)
	public Integer getIdCar() {
		return this.idCar;
	}

	public void setIdCar(Integer idCar) {
		this.idCar = idCar;
	}

	@Column(name = "categorie", nullable = false)
	public Integer getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Integer categorie) {
		this.categorie = categorie;
	}

	@Column(name = "qte", nullable = false)
	public Integer getQte() {
		return this.qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

}