package com.designpatterns.behavioral.state.good.states;

import com.designpatterns.behavioral.state.good.Car;
import com.designpatterns.behavioral.state.good.State;

public class Gas implements State {
	private Gear gear = new Gear();

	public void execute(Car car) {
		if (car.getEngineStatus().equals("start")) {
			car.setKmh(car.getKmh() + 10);
		} else {
			System.err.println("You must start the engine first!");
		}
		gear.execute(car);
	}

}
