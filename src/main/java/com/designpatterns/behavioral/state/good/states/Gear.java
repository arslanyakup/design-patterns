package com.designpatterns.behavioral.state.good.states;

import com.designpatterns.behavioral.state.good.Car;
import com.designpatterns.behavioral.state.good.State;

public class Gear implements State {
	public void execute(Car car) {
		if (car.getEngineStatus().equals("start")) {
			int kmh = car.getKmh();
			car.setGearStatus((kmh / 25) + 1 >= 6 ? 6 : (kmh / 25) + 1);
		} else {
			car.setGearStatus(0);
		}
	}

}
