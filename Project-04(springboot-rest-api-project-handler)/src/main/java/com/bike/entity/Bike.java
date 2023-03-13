package com.bike.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bikeNo;
	private String bikeName;
	private String bikeModel;
	private String gearType;
	private String engineType;
	private double weight;
	private float miledge;
	private String ownerName;
	private String cityName;
	public Bike(int bikeNo, String bikeName, String bikeModel, String gearType, String engineType, double weight,
			float miledge, String ownerName, String cityName) {
		super();
		this.bikeNo = bikeNo;
		this.bikeName = bikeName;
		this.bikeModel = bikeModel;
		this.gearType = gearType;
		this.engineType = engineType;
		this.weight = weight;
		this.miledge = miledge;
		this.ownerName = ownerName;
		this.cityName = cityName;
	}
	public int getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public float getMiledge() {
		return miledge;
	}
	public void setMiledge(float miledge) {
		this.miledge = miledge;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bike [bikeNo=" + bikeNo + ", bikeName=" + bikeName + ", bikeModel=" + bikeModel + ", gearType="
				+ gearType + ", engineType=" + engineType + ", weight=" + weight + ", miledge=" + miledge
				+ ", ownerName=" + ownerName + ", cityName=" + cityName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
