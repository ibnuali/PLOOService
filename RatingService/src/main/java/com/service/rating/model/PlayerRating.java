package com.service.rating.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerRating {
	
	private double DEF;
	private double SPD;
	private double DRI;
	private double SHT;
	private double PHY;
	private double PAS;
	
	@JsonProperty("DEF")
	public double getDEF() {
		return DEF;
	}
	@JsonProperty("DEF")
	public void setDEF(double dEF) {
		DEF = dEF;
	}
	
	@JsonProperty("SPD")
	public double getSPD() {
		return SPD;
	}
	@JsonProperty("SPD")
	public void setSPD(double sPD) {
		SPD = sPD;
	}
	
	@JsonProperty("DRI")
	public double getDRI() {
		return DRI;
	}
	@JsonProperty("DRI")
	public void setDRI(double dRI) {
		DRI = dRI;
	}
	
	@JsonProperty("SHT")
	public double getSHT() {
		return SHT;
	}
	@JsonProperty("SHT")
	public void setSHT(double sHT) {
		SHT = sHT;
	}
	
	@JsonProperty("PHY")
	public double getPHY() {
		return PHY;
	}
	@JsonProperty("PHY")
	public void setPHY(double pHY) {
		PHY = pHY;
	}
	
	@JsonProperty("PAS")
	public double getPAS() {
		return PAS;
	}
	@JsonProperty("PAS")
	public void setPAS(double pAS) {
		PAS = pAS;
	}
	
	public PlayerRating(){
		this.DEF = 0;
		this.DRI = 0;
		this.PAS = 0;
		this.PHY = 0;
		this.SHT = 0;
		this.SPD = 0;
	}
	
	public PlayerRating(double dEF, double dRI, double pAS, double pHY, double sHT, double sPD){
		this.DEF = dEF;
		this.DRI = dRI;
		this.PAS = pAS;
		this.PHY = pHY;
		this.SHT = sHT;
		this.SPD = sPD;
	}
	
	public void CalculatePlayerRating(List<RatingHistory> ratingHistory){
		System.out.print(ratingHistory.size());
		for(RatingHistory ratinghistory : ratingHistory){
			if(ratinghistory.getShort_rating_category().getShort_rating_category().equals("DEF")){
				this.DEF = this.DEF + ratinghistory.getScore_rating().getScore_rating();
			}
			if(ratinghistory.getShort_rating_category().getShort_rating_category().equals("DRI")){
				this.DRI = this.DRI + ratinghistory.getScore_rating().getScore_rating();
			}
			if(ratinghistory.getShort_rating_category().getShort_rating_category().equals("PAS")){
				this.PAS = this.PAS + ratinghistory.getScore_rating().getScore_rating();
			}
			if(ratinghistory.getShort_rating_category().getShort_rating_category().equals("PHY")){
				this.PHY = this.PHY + ratinghistory.getScore_rating().getScore_rating();
			}
			if(ratinghistory.getShort_rating_category().getShort_rating_category().equals("SHT")){
				this.SHT = this.SHT + ratinghistory.getScore_rating().getScore_rating();
			}
			if(ratinghistory.getShort_rating_category().getShort_rating_category().equals("SPD")){
				this.SPD = this.SPD + ratinghistory.getScore_rating().getScore_rating();
			}
		}
		this.DEF = this.DEF / (ratingHistory.size() / 6);
		this.DRI = this.DRI / (ratingHistory.size() / 6);
		this.PAS = this.PAS / (ratingHistory.size() / 6);
		this.PHY = this.PHY / (ratingHistory.size() / 6);
		this.SHT = this.SHT / (ratingHistory.size() / 6);
		this.SPD = this.SPD / (ratingHistory.size() / 6);
	}
}
