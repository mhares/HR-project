package com.mostafa.HRproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "department_name")
	private String departmentName;
	@OneToOne(fetch = FetchType.LAZY ,
			cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "manager_id")
	private Employee manager;

	@ManyToOne(fetch=FetchType.LAZY,
	cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "location_id")
	private Location location;

	public Department() {
	}

	public Department(String departmentName , Employee manager , Location location) {
		this.departmentName = departmentName;
		this.manager = manager;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department{" + "id=" + id + ", departmentName='" + departmentName + '\'' + ", Manager=" + manager + ", location=" + location + '}';
	}
}
