package com.mostafa.HRproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "regions")
public class Region {
	@Id
	@Column(name = "region_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "region_name")
	private String RegionName;

	public Region() {
	}

	public Region(String regionName) {
		RegionName = regionName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegionName() {
		return RegionName;
	}

	public void setRegionName(String regionName) {
		RegionName = regionName;
	}

	@Override
	public String toString() {
		return "Region{" + "id=" + id + ", RegionName='" + RegionName + '\'' + '}';
	}
}
