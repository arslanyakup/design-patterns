package com.designpatterns.behavioral.state.bad;

import java.util.HashMap;
import java.util.Map;

/*
	Consider the acceleration state of a car to sample the state design pattern.
	
	4 cases will be dealt with here for the car.
		1) Start Engine
		2) Stop Engine
		4) Gas
		5) Brake
*/

public class Car {

	private int kmh;
	private String engineStatus;
	private int gearStatus;

	public Car() {
		kmh = 0;
		gearStatus = 0;
		engineStatus = "stop";
	}

	public void runEngine() {
		System.out.println("Engine is started!");
		engineStatus = "start";
		kmh = 0;
		gearStatus = 0;
	}

	public void stopEngine() {
		System.err.println("Engine is stopped!");
		engineStatus = "stop";
		kmh = 0;
		gearStatus = 0;
	}

	public void accelerate() {
		kmh += 10;
	}

	public void decelerate() {
		kmh -= 10;
	}

	public void setGear() {
		if (engineStatus.equals("start")) {
			if (kmh > 0 && kmh < 25) {
				gearStatus = 1;
			} else if (kmh >= 25 && kmh < 50) {
				gearStatus = 2;
			} else if (kmh >= 50 && kmh < 80) {
				gearStatus = 3;
			} else if (kmh >= 80 && kmh < 110) {
				gearStatus = 4;
			} else if (kmh >= 110 && kmh < 150) {
				gearStatus = 5;
			} else if (kmh >= 150) {
				gearStatus = 6;
			}
		} else {
			gearStatus = 0;
		}
	}

	public Map<String, Object> execute(String status) {
		HashMap<String, Object> vehicleStatus = new HashMap<String, Object>();
		if (status.equals("start")) {
			if (!engineStatus.equals("start")) {
				runEngine();
			} else {
				System.err.println("Engine is already started!");
			}
		} else if (status.equals("stop")) {
			if (!engineStatus.equals("stop")) {
				stopEngine();
			} else {
				System.err.println("Engine is already stopped!");
			}
		} else if (status.equals("gas")) {
			if (engineStatus.equals("start")) {
				accelerate();
			} else {
				System.err.println("You must start the engine first!");
			}
			setGear();
		} else if (status.equals("brake")) {
			if (kmh == 0) {
				if (!engineStatus.equals("stop")) {
					stopEngine();
				} else {
					System.err.println("You must start the engine first!");
				}
			} else {
				decelerate();
			}
			setGear();
		}
		vehicleStatus.put("engineStatus", "Engine -> " + engineStatus);
		vehicleStatus.put("gearStatus", "Gear -> " + gearStatus);
		vehicleStatus.put("kmh", "KMH -> " + kmh);
		return vehicleStatus;
	}

}
