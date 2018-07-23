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
 * Maintenance entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "maintenance", catalog = "flauto")
public class Maintenance implements java.io.Serializable {

    // Fields
    private Integer idMaintenance;
    private Vehicules vehicules;
    private String nomPiece;
    private Integer qte;
    private String panne;
    private Date dateDbr;
    private Date dateFir;
    private int taiter;

    // Constructors
    /**
     * default constructor
     */
    public Maintenance() {
    }

    /**
     * min constructor
     */
    public Maintenance(Vehicules vehicules) {
        this.vehicules = vehicules;
    }

    /**
     * full constructor
     */
    public Maintenance(Vehicules vehicules, String nomPiece, Integer qte,
            String panne, Date dateDbr, Date dateFir) {
        this.vehicules = vehicules;
        this.nomPiece = nomPiece;
        this.qte = qte;
        this.panne = panne;
        this.dateDbr = dateDbr;
        this.dateFir = dateFir;
    }

    // Property accessors
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id_maintenance", unique = true, nullable = false)
    public Integer getIdMaintenance() {
        return this.idMaintenance;
    }

    public void setIdMaintenance(Integer idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_v", nullable = false)
    public Vehicules getVehicules() {
        return this.vehicules;
    }

    public void setVehicules(Vehicules vehicules) {
        this.vehicules = vehicules;
    }

    @Column(name = "nom_piece", nullable = true, length = 30)
    public String getNomPiece() {
        return this.nomPiece;
    }

    public void setNomPiece(String nomPiece) {
        this.nomPiece = nomPiece;
    }

    @Column(name = "qte", nullable = true)
    public Integer getQte() {
        return this.qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    @Column(name = "panne", nullable = true, length = 65535)
    public String getPanne() {
        return this.panne;
    }

    public void setPanne(String panne) {
        this.panne = panne;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date_dbr", nullable = false, length = 10)
    public Date getDateDbr() {
        return this.dateDbr;
    }

    public void setDateDbr(Date dateDbr) {
        this.dateDbr = dateDbr;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date_fir", nullable = true, length = 10)
    public Date getDateFir() {
        return this.dateFir;
    }

    public void setDateFir(Date dateFir) {
        this.dateFir = dateFir;
    }

    @Column(name = "traiter", nullable = true)
    public int getTaiter() {
        return taiter;
    }

    public void setTaiter(int taiter) {
        this.taiter = taiter;
    }

}
