package com.designpatterns.behavioral.state.good.states;

import com.designpatterns.behavioral.state.good.Car;
import com.designpatterns.behavioral.state.good.State;

public class Brake implements State {
	private StopEngine stopEngine = new StopEngine();
	private Gear gear = new Gear();

	public void execute(Car car) {
		if (car.getKmh()-10	 == 0) {
			if (!car.getEngineStatus().equals("stop")) {
				stopEngine.execute(car);
			} else {
				System.err.println("You must start the engine first!");
			}
		} else {
			car.setKmh(car.getKmh() - 10);
		}
		gear.execute(car);
	}

}
