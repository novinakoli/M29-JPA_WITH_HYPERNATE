package org.stjohn.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * below annotation ensures that the given class is an 
 * entity in the database table
 */

@Entity
@Table(name="Employee")
public class Employee implements Serializable{
	/*
	 * it represents the primary key
	 */
	@Id
	private int id;
	private String name;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
