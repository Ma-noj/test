package edu.clarivate.manytomany.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private String studentEmail;
	@ManyToMany
	private List<Cource> cources;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public List<Cource> getCources() {
		return cources;
	}
	public void setCources(List<Cource> cources) {
		this.cources = cources;
	}
	
	

}
