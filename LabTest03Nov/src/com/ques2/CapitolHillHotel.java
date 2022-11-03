/*
 * Q.2
 * Program: WAP in java to draw a diamond?
 * @Name: Dhiraj kumar
 * @Date: 03/11/2022
 * */

package com.ques2;

public class CapitolHillHotel
	{
	
	private int roomNo;
	private String roomType;
	private boolean acFacility;
	private float roomArea;
	private float roomPrice;
	
	
	public CapitolHillHotel  () 
		{
		super();
		this.roomNo=0;
		this.roomType="Standard";
		this.acFacility=true;
		this.roomArea=100.0f;
		this.roomPrice=250;
		
	}
	
	


	public CapitolHillHotel(float roomArea) {
		super();
		this.roomArea = 150;
	}






	public CapitolHillHotel(int roomNo, String roomType, boolean acFacility, float roomArea, float roomPrice) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.acFacility = acFacility;
		this.roomArea = roomArea;
		this.roomPrice = roomPrice;
	}




	public int getRoomNo() {
		return roomNo;
	}




	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}




	public String getRoomType() {
		return roomType;
	}




	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}




	public boolean isAcFacility() {
		return acFacility;
	}




	public void setAcFacility(boolean acFacility) {
		this.acFacility = acFacility;
	}




	public float getRoomArea() {
		return roomArea;
	}




	public void setRoomArea(float roomArea) {
		this.roomArea = roomArea;
	}




	public float getRoomPrice() {
		return roomPrice;
	}




	public void setRoomPrice(float roomPrice) {
		this.roomPrice = roomPrice;
	}




	@Override
	public String toString() {
		return "Hotel [roomNo=" + roomNo + ", roomType=" + roomType + ", acFacility=" + acFacility + ", roomArea="
				+ roomArea + ", roomPrice=" + roomPrice + "]";
	}
	//End of Method

}