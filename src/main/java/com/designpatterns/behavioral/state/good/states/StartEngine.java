package com.designpatterns.behavioral.state.good.states;

import com.designpatterns.behavioral.state.good.Car;
import com.designpatterns.behavioral.state.good.State;

public class StartEngine implements State {
	public void execute(Car car) {
		System.err.println("Engine is started!");
		car.setEngineStatus("start");
		car.setKmh(0);
		car.setGearStatus(0);
	}
}
