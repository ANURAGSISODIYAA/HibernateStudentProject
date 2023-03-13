package com.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "marksheet")
public class Marksheet {
	@Id
	@Column(name = "marksheetId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int marksheetId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;

	@OneToOne(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "stu_id", referencedColumnName = "studentId")
	private Student parent;

	@Column(name = "chemistryNumbers")
	private int chemistryNumbers;

	@Column(name = "physicsNumbers")
	private int physicsNumbers;

	@Column(name = "MathsNumbers")
	private int MathsNumbers;

	@Column(name = "electronicsNumber")
	private int electronicsNumber;

	@Column(name = "MechanicalNumbers")
	private int MechanicalNumbers;

	public int getMarksheetId() {
		return marksheetId;
	}

	public void setMarksheetId(int marksheetId) {
		this.marksheetId = marksheetId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Student getParent() {
		return parent;
	}

	public void setParent(Student parent) {
		this.parent = parent;
	}

	public int getChemistryNumbers() {
		return chemistryNumbers;
	}

	public void setChemistryNumbers(int chemistryNumbers) {
		this.chemistryNumbers = chemistryNumbers;
	}

	public int getPhysicsNumbers() {
		return physicsNumbers;
	}

	public void setPhysicsNumbers(int physicsNumbers) {
		this.physicsNumbers = physicsNumbers;
	}

	public int getMathsNumbers() {
		return MathsNumbers;
	}

	public void setMathsNumbers(int mathsNumbers) {
		MathsNumbers = mathsNumbers;
	}

	public int getElectronicsNumber() {
		return electronicsNumber;
	}

	public void setElectronicsNumber(int electronicsNumber) {
		this.electronicsNumber = electronicsNumber;
	}

	public int getMechanicalNumbers() {
		return MechanicalNumbers;
	}

	public void setMechanicalNumbers(int mechanicalNumbers) {
		MechanicalNumbers = mechanicalNumbers;
	}

}
