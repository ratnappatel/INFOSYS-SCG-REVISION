package com.gl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	private int id;
	private int houseno;
	private String street;
	private String city;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Address(int id, int houseno, String street, String city, User user) {
		super();
		this.id = id;
		this.houseno = houseno;
		this.street = street;
		this.city = city;
		this.user = user;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", houseno=" + houseno + ", street=" + street + ", city=" + city + ", user=" + user
				+ "]";
	}
	
	
	

}
