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
 * Users entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "users", catalog = "flauto")
public class Users implements java.io.Serializable {

	// Fields

	private Integer idU;
	private String nom;
	private String prenom;
	private String login;
	private String pwd;
	private Date dateNaissance;
	private String cin;
	private Integer enable;
	private Set<RoleUsers> roleUserses = new HashSet<RoleUsers>(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String nom, String prenom, String login, String pwd,
			Date dateNaissance, String cin, Integer enable) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pwd = pwd;
		this.dateNaissance = dateNaissance;
		this.cin = cin;
		this.enable = enable;
	}

	/** full constructor */
	public Users(String nom, String prenom, String login, String pwd,
			Date dateNaissance, String cin, Integer enable,
			Set<RoleUsers> roleUserses) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pwd = pwd;
		this.dateNaissance = dateNaissance;
		this.cin = cin;
		this.enable = enable;
		this.roleUserses = roleUserses;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_u", unique = true, nullable = false)
	public Integer getIdU() {
		return this.idU;
	}

	public void setIdU(Integer idU) {
		this.idU = idU;
	}

	@Column(name = "nom", nullable = false, length = 30)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false, length = 30)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "login", nullable = false, length = 30)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "pwd", nullable = false, length = 100)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_naissance", nullable = false, length = 10)
	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Column(name = "cin", nullable = false, length = 8)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Column(name = "enable", nullable = false)
	public Integer getEnable() {
		return this.enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "users")
	public Set<RoleUsers> getRoleUserses() {
		return this.roleUserses;
	}

	public void setRoleUserses(Set<RoleUsers> roleUserses) {
		this.roleUserses = roleUserses;
	}

}