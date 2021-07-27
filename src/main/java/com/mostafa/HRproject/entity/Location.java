package com.mostafa.HRproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

	@Id
	@Column(name = "location_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "street_name")
	private String streetName;
	@Column(name = "postal_code")
	private String postalCode;
	@Column(name = "city")
	private String city;
	@Column(name = "state_province")
	private String state_province;

	@ManyToOne(fetch = FetchType.LAZY,
	cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "country_id")
	private Country country;

	public Location() {
	}

	public Location(String streetName , String postalCode , String city , String state_province , Country country) {
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.city = city;
		this.state_province = state_province;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_province() {
		return state_province;
	}

	public void setState_province(String state_province) {
		this.state_province = state_province;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location{" + "id=" + id + ", streetName='" + streetName + '\'' + ", postalCode='" + postalCode + '\'' + ", city='" + city + '\'' + ", state_province='" + state_province + '\'' + ", country=" + country + '}';
	}
}
