package com.ashima.switches;

public class VehicleImpl {

	public static void main(String[] args) {
		Vehicle vehicle = Vehicle.CAR;
		VehicleImpl impl =  new VehicleImpl();
		System.out.println(impl.getSpeedLimit(vehicle));
	}

	public int getSpeedLimit(Vehicle vehicle) {
		int speedAllowed = switch(vehicle) {
			case BICYCLE, SCOOTER -> 40; 
			case CAR -> 80;
			case TRAIN -> 120;
			case TRUCK -> 50;
			default -> 0;
		};
		
		return speedAllowed;
	}

}
