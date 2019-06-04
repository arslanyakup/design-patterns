package com.designpatterns.behavioral.state.good.states;

import com.designpatterns.behavioral.state.good.Car;
import com.designpatterns.behavioral.state.good.State;

public class StopEngine implements State {
	public void execute(Car car) {
		if (car.getEngineStatus().equals("stop")) {
			System.err.println("Engine is already stopped!");
		} else {
			System.err.println("Engine is stopped!");
			car.setEngineStatus("stop");
			car.setKmh(0);
			car.setGearStatus(0);
		}
	}
}
