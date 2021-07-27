package com.mostafa.HRproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {

	@Id
	@Column(name = "country_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "country_name")
	private String countryName;

	@ManyToOne( fetch = FetchType.LAZY,
			cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "region_id")
	private Region region;

	public Country() {
	}

	public Country(String countryName , Region region) {
		this.countryName = countryName;
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Country{" + "id=" + id + ", countryName='" + countryName + '\'' + ", region=" + region + '}';
	}
}
