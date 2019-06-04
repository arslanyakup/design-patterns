package com.designpatterns.behavioral.state.good;
/*
Consider the acceleration state of a car to sample the state design pattern.

4 cases will be dealt with here for the car.
	1) Start Engine
	2) Stop Engine
	4) Gas
	5) Brake
*/

public class Car {
	private State state;
	private int kmh;
	private String engineStatus;
	private int gearStatus;

	public Car() {
		engineStatus = "stop";
		kmh = 0;
		gearStatus = 0;
	}

	public void setState(State s) {
		state = s;
	}

	public void execute() {
		state.execute(this);
		System.out.println("KMH -> " + kmh);
		System.out.println("Engine Status -> " + engineStatus);
		System.out.println("Gear Status -> " + gearStatus);
	}

	public int getKmh() {
		return kmh;
	}

	public void setKmh(int kmh) {
		this.kmh = kmh;
	}

	public String getEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(String engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getGearStatus() {
		return gearStatus;
	}

	public void setGearStatus(int gearStatus) {
		this.gearStatus = gearStatus;
	}

	@Override
	public String toString() {
		return "Car [state=" + state + ", kmh=" + kmh + ", engineStatus=" + engineStatus + ", gearStatus=" + gearStatus + "]";
	}

}
