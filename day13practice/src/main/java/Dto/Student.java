package Dto;

import jakarta.persistence.*;
@Entity
public class Student {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String email;
private String adress;
private String course;
private int level;
public Student(String email, String adress, String course, int level) {
	super();
	this.email = email;
	this.adress = adress;
	this.course = course;
	this.level = level;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
@Override
public String toString() {
	return "Student [id=" + id + ", email=" + email + ", adress=" + adress + ", course=" + course + ", level=" + level
			+ "]";
}

	

}
