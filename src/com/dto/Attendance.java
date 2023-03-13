package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {

	@Id
	@Column(name = "attendanceId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attendanceId;

	@Column(name = "semister1")
	private int semister1;

	@Column(name = "semister2")
	private int semister2;

	public int getAttendanceId() {
		return attendanceId;
	}

	public int getSemister1() {
		return semister1;
	}

	public void setSemister1(int semister1) {
		this.semister1 = semister1;
	}

	public int getSemister2() {
		return semister2;
	}

	public void setSemister2(int semister2) {
		this.semister2 = semister2;
	}

}
