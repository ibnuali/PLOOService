package api.gateway.futsalkeun.model;

public class Country{ 

  private int id_country; 

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