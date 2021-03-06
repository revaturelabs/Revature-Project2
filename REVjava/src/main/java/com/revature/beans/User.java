package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="revuser")
public class User {

	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="client")
	private String client;
	
	@Column(name="batch_id")
	private int batch_id;
	
	@Column(name="position")
	private String position;
	
	@Column(name="approved")
	private int approved;
	
	public int getApproved() {
		return approved;
	}

	public void setApproved(int approved) {
		this.approved = approved;
	}
	
	public User(String email) {
		this.email = email;
	}

	public User(String firstName, String lastName, String email, String password, String city, String state,
			String client, int batch_id, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.city = city;
		this.state = state;
		this.client = client;
		this.batch_id = batch_id;
		this.position = position;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", city=" + city + ", state=" + state + ", clientCompany=" + client
				+ ", batchId=" + batch_id + ", position=" + position + ", approved=" + approved + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String clientCompany) {
		this.client = clientCompany;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batchId) {
		this.batch_id = batchId;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	

}
