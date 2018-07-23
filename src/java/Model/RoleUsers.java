package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * RoleUsers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "role_users", catalog = "flauto")
public class RoleUsers implements java.io.Serializable {

	// Fields

	private Integer idRoleUsers;
	private Users users;
	private String role;

	// Constructors

	/** default constructor */
	public RoleUsers() {
	}

	/** full constructor */
	public RoleUsers(Users users, String role) {
		this.users = users;
		this.role = role;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_roleUsers", unique = true, nullable = false)
	public Integer getIdRoleUsers() {
		return this.idRoleUsers;
	}

	public void setIdRoleUsers(Integer idRoleUsers) {
		this.idRoleUsers = idRoleUsers;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_u", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "role", nullable = false, length = 20)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}