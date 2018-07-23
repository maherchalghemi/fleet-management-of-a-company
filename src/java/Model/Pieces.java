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
 * Pieces entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pieces", catalog = "flauto")
public class Pieces implements java.io.Serializable {

	// Fields

	private Integer idP;
	private String nom;
	private Integer qte;
	private double prix;
	private Set<DemPiece> demPieces = new HashSet<DemPiece>(0);

	// Constructors

	/** default constructor */
	public Pieces() {
	}

	/** minimal constructor */
	public Pieces(String nom, Integer qte, double prix) {
		this.nom = nom;
		this.qte = qte;
		this.prix = prix;
	}

	/** full constructor */
	public Pieces(String nom, Integer qte, double prix, Set<DemPiece> demPieces) {
		this.nom = nom;
		this.qte = qte;
		this.prix = prix;
		this.demPieces = demPieces;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_p", unique = true, nullable = false)
	public Integer getIdP() {
		return this.idP;
	}

	public void setIdP(Integer idP) {
		this.idP = idP;
	}

	@Column(name = "nom", nullable = false, length = 30)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "qte", nullable = false)
	public Integer getQte() {
		return this.qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	@Column(name = "prix", nullable = false, precision = 7, scale = 3)
	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "pieces")
	public Set<DemPiece> getDemPieces() {
		return this.demPieces;
	}

	public void setDemPieces(Set<DemPiece> demPieces) {
		this.demPieces = demPieces;
	}

}