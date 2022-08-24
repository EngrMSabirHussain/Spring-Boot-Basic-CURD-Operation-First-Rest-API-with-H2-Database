package com.example.demo.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	@Id
	@Column(name="user_id")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column(name="user_first_name")
	private String Fname;
	
	
	@Column(name="user_last_name")
	private String Lname;
	
	
	
	
	@Column(name="user_gender")
	private String gender;
	
	
	@Column(name="user_age")
	private int age;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return Fname;
	}


	public void setFname(String fname) {
		Fname = fname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}




	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", gender=" + gender + ", age=" + age + "]";
	}




	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String fname, String lname, String gender, int age) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.gender = gender;
		this.age = age;
	}



	
	
	
	
	

}
