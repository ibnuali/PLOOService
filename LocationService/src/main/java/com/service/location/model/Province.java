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
@Table(name = "province") 
public class Province { 
   
  @Id 
  @Column(name = "id_province") 
  private int id_province; 
  
  @Column(name = "name_province") 
  private String name_province; 
  
  @Autowired 
  @ManyToOne(fetch=FetchType.EAGER) 
  @JoinColumn(name = "id_country") 
  private Country id_country; 
   
  public int getId_province() { 
    return id_province; 
  } 
 
  public void setId_province(int id_province) { 
    this.id_province = id_province; 
  } 
 
  public Country getId_country() { 
    return id_country; 
  } 
 
  public void setId_country(Country id_country) { 
    this.id_country = id_country; 
  } 
 
  public String getName_province() { 
    return name_province; 
  } 
 
  public void setName_province(String name_province) { 
    this.name_province = name_province; 
  } 
 
} 
