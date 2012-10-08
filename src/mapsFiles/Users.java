package mapsFiles;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
@Entity
@Table(appliesTo = "users")
public class Users {
	private Integer id;
	private String name;
	private String password;
	private boolean isActive, isAdmin;
	private Date registrationDate;
	

	public Users(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password
				+ ", isActive=" + isActive + ", isAdmin=" + isAdmin
				+ ", registrationDate=" + "]";
	}
}
