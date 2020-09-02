package com.spicycoder.tutorial;

public class ObjectOriented {
	public static void main(String[] args) {
		AirCraft details=new AirCraft();
		details.passangers=5;
		details.cruiseSpeed=140;
		details.fuelCapacity=56.2f;
		details.fuelBurnRate=9.5f;
		AirCraft techni=new AirCraft();
		techni.passangers=4;
		techni.cruiseSpeed=130;
		techni.fuelCapacity=45.2f;
		techni.fuelBurnRate=4.5f;
		System.out.println("details of AirCraft: "+ details.passangers);
		System.out.println("\ndetails of AirCraft: "+ techni.fuelBurnRate);
		double average =details.cruiseSpeed/details.passangers;
		double average2=techni.cruiseSpeed/techni.passangers;
		System.out.println("\n" +average);
		System.out.println("\n" +average2);
		details.perform();
		System.out.println(details.total);
	}
}
class AirCraft{
	int passangers;
	int cruiseSpeed;
	int total;
	float fuelCapacity;
	float fuelBurnRate;
	public void perform() {
		total=passangers+cruiseSpeed;
	}
}