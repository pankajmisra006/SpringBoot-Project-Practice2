package com.howtodoinjava.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personid;
	
	@Column
	private String name;
	
	
	@OneToMany(mappedBy = "person")
	List<Ticketstatus> ticketstatus;


	public int getPersonid() {
		return personid;
	}


	public void setPersonid(int personid) {
		this.personid = personid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}







	public List<Ticketstatus> getTicketstatus() {
		return ticketstatus;
	}


	public void setTicketstatus(List<Ticketstatus> ticketstatus) {
		this.ticketstatus = ticketstatus;
	}


	@Override
	public String toString() {
		return "Person [personid=" + personid + ", name=" + name + ", ticketstatus=" + ticketstatus + "]";
	}


	
}
