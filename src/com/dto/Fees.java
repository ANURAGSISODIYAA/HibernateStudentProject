package com.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fees")
public class Fees {

	@OneToOne(targetEntity = Student.class, cascade = CascadeType.ALL)

	@JoinColumn(name = "stu_id", referencedColumnName = "studentId")
	private Student parent;

	@Id
	@Column(name = "feesId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feesId;

	@Column(name = "Semister", length = 10)
	private int semister;

	@Column(name = "fees", length = 10)
	private int fees;

	public Student getParent() {
		return parent;
	}

	public void setParent(Student parent) {
		this.parent = parent;
	}

	public int getFeesId() {
		return feesId;
	}

	public void setFeesId(int feesId) {
		this.feesId = feesId;
	}

	public int getSemister() {
		return semister;
	}

	public void setSemister(int semister) {
		this.semister = semister;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

}