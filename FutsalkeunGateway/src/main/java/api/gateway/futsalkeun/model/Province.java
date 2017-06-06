package api.gateway.futsalkeun.model;

public class Province { 
    
  private int id_province; 
  
  private String name_province; 
  
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
