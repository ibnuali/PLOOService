package com.service.rating.model;

import java.util.List;

public class PlayerRating {
	
	private double DEF;
	private double SPD;
	private double DRI;
	private double SHT;
	private double PHY;
	private double PAS;
	public double getDEF() {
		return DEF;
	}
	public void setDEF(double dEF) {
		DEF = dEF;
	}
	public double getSPD() {
		return SPD;
	}
	public void setSPD(double sPD) {
		SPD = sPD;
	}
	public double getDRI() {
		return DRI;
	}
	public void setDRI(double dRI) {
		DRI = dRI;
	}
	public double getSHT() {
		return SHT;
	}
	public void setSHT(double sHT) {
		SHT = sHT;
	}
	public double getPHY() {
		return PHY;
	}
	public void setPHY(double pHY) {
		PHY = pHY;
	}
	public double getPAS() {
		return PAS;
	}
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
