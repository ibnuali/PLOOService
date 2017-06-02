package com.service.location.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "country") 
public class Country{ 
  @Id 
  @Column(name = "id_country") 
  private int id_country; 
    
  @Column(name = "name_country") 
  private String name_country; 
    
  public int getId_country() {
	return id_country;
  }

	public void setId_country(int id_country) {
		this.id_country = id_country;
	}
	
	public String getName_country() {
		return name_country;
	}
	
	public void setName_country(String name_country) {
		this.name_country = name_country;
	}
	
	public Country(){ 
	      
	} 
   
  @Override 
    public String toString() { 
        return String.format("{id_country : %d, name_country : '%s}", this.id_country, this.name_country); 
    } 
} 