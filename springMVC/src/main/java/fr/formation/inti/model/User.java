package fr.formation.inti.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author IN-TR-018
 *
 */
@Entity
@Table(name = "user", catalog = "bd_example2")
public class User {
	
	private Integer idUser;
	private String email;
	private String password;
	private Date dateCreation;
	private String first_name;
	private String last_name;
	private String roleName;
	
	public User(){
		
	}
	
	public User(Integer idUser, String email, String password, Date dateCreation, String first_name, String last_name,
			String roleName) {
		super();
		this.idUser = idUser;
		this.email = email;
		this.password = password;
		this.dateCreation = dateCreation;
		this.first_name = first_name;
		this.last_name = last_name;
		this.roleName = roleName;
	}
	
	public User(String email, String password, Date dateCreation, String first_name, String last_name,
			String roleName) {
		super();
		
		this.email = email;
		this.password = password;
		this.dateCreation = dateCreation;
		this.first_name = first_name;
		this.last_name = last_name;
		this.roleName = roleName;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idUser", unique = true, nullable = false)
	public Integer getIdUser() {
		return idUser;
	}
	
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "dateCreation")
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	@Column(name = "first_name")
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	@Column(name = "last_name")
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	@Column(name = "roleName")
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", email=" + email + ", password=" + password + ", dateCreation="
				+ dateCreation + ", first_name=" + first_name + ", last_name=" + last_name + ", roleName=" + roleName
				+ "]";
	}
	
	
}
