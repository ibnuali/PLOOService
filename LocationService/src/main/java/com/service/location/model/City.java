package com.service.location.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity 
@Table(name = "city") 
public class City { 
   
  @Id 
  @Column(name = "id_city") 
  private int id_city; 
   
  @Autowired 
  @ManyToOne(fetch=FetchType.EAGER) 
  @JoinColumn(name = "id_province") 
  private Province id_province; 
   
  @Column(name = "name_city") 
  private String name_city; 
    
  public int getId_city() { 
    return id_city; 
  } 
 
  public void setId_city(int id_city) { 
    this.id_city = id_city; 
  } 
 
  public Province getId_province() { 
    return id_province; 
  } 
 
  public void setId_province(Province id_province) { 
    this.id_province = id_province; 
  } 
 
  public String getName_city() { 
    return name_city; 
  } 
 
  public void setName_city(String name_city) { 
    this.name_city = name_city; 
  } 
 
  public City(){ 
      
  } 
   
  @Override 
    public String toString() { 
        return String.format("{id_city : %d, id_province : %d, name_city : %s}", this.id_city, this.id_province.toString(), this.name_city); 
    } 
}

