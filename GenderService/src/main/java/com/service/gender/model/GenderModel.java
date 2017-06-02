package com.service.gender.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genders")
public class GenderModel {
	 @Id
	 @Column(name = "gender")
	 private String gender;
	 
	/* Get Set Event Gender*/
	 public String getGender() { 
		    return gender; 
	 } 
	 public void setGender(String gender) { 
		    this.gender = gender; 
	 }
	 /* ------------------------------ */
}
