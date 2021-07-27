package com.mostafa.HRproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "job")
public class Job {

	@Id
	@Column(name = "job_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "job_title")
	private String jobTitle;
	@Column(name = "min_salary")
	private String minSalary;
	@Column(name = "max_salary")
	private String maxSalary;
	public Job() {
	}

	public Job(String jobTitle , String minSalary , String maxSalary) {
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(String minSalary) {
		this.minSalary = minSalary;
	}

	public String getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(String maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return "Job{" + "id=" + id + ", jobTitle='" + jobTitle + '\'' + ", minSalary='" + minSalary + '\'' + ", maxSalary='" + maxSalary + '\'' + '}';
	}
}
