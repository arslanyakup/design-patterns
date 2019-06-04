package com.designpatterns.behavioral.state.bad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class ExecuteCar {

	public static void main(String[] args) {
		Car car = new Car();
		while (true) {
			System.out.println("Please enter a status. ('start', 'stop', 'gas', 'brake') --> ");
			String status = getLine();
			Map<String, Object> carStatus = car.execute(status);
			System.out.println(carStatus);
			if (carStatus.get("engineStatus").equals("stop")) {
				break;
			}
		}
	}

	static String getLine() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return line;
	}
}
