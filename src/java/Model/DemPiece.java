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
 * DemPiece entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "dem_piece", catalog = "flauto")
public class DemPiece implements java.io.Serializable {

	// Fields

	private Integer idDemPiece;
	private Pieces pieces;
	private Integer qte;
        private Date date;

	// Constructors

	/** default constructor */
	public DemPiece() {
	}

	/** full constructor */
	public DemPiece(Pieces pieces, Integer qte) {
		this.pieces = pieces;
		this.qte = qte;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_demPiece", unique = true, nullable = false)
	public Integer getIdDemPiece() {
		return this.idDemPiece;
	}

	public void setIdDemPiece(Integer idDemPiece) {
		this.idDemPiece = idDemPiece;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_p", nullable = false)
	public Pieces getPieces() {
		return this.pieces;
	}

	public void setPieces(Pieces pieces) {
		this.pieces = pieces;
	}

	@Column(name = "qte", nullable = false)
	public Integer getQte() {
		return this.qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
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