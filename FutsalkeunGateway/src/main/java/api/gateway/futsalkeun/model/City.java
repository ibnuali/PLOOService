package api.gateway.futsalkeun.model;

public class City { 

  private int id_city; 
  
  private Province id_province; 

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
}

