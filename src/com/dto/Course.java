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
@Table(name = "course")
public class Course {
	@Id
	@Column(name = "courseId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;

	@Column(name = "courseName")
	private String courseName;

	@Column(name = "courseDuration")
	private int courseDuration;

	@Column(name = "courseFess")
	private int courseFess;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cid", referencedColumnName = "courseId")

	private Set children;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public int getCourseFess() {
		return courseFess;
	}

	public void setCourseFess(int courseFess) {
		this.courseFess = courseFess;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

}
