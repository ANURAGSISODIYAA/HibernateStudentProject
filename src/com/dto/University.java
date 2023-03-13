package com.dto;

import java.util.Set;

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
@Table(name = "university")
public class University {
	@Id
	@Column(name = "universityId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int universityId;

	@Column(name = "universityName")
	private String universityName;

	@Column(name = "universityAddress")
	private String universityAddress;

	@Column(name = "universityFess")
	private int universityFess;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "uid", referencedColumnName = "universityId")

	private Set children;

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityAddress() {
		return universityAddress;
	}

	public void setUniversityAddress(String universityAddress) {
		this.universityAddress = universityAddress;
	}

	public int getUniversityFess() {
		return universityFess;
	}

	public void setUniversityFess(int universityFess) {
		this.universityFess = universityFess;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

}
