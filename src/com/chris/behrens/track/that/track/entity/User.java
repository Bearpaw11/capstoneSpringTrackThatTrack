package com.chris.behrens.track.that.track.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="userName")
	private String userName;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private List<UserRecord> userRecords;
	
	//empty constructor
	public User() {
		
	}

	
	//getters and setters for all fields

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public List<UserRecord> getUserRecords() {
		return userRecords;
	}


	public void setUserRecords(List<UserRecord> userRecords) {
		this.userRecords = userRecords;
	}
	
	
//Override toString method
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", userName=" + userName + "]";
	}
}
