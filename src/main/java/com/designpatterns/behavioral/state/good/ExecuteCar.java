package com.designpatterns.behavioral.state.good;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.designpatterns.behavioral.state.good.states.Brake;
import com.designpatterns.behavioral.state.good.states.Gas;
import com.designpatterns.behavioral.state.good.states.StartEngine;
import com.designpatterns.behavioral.state.good.states.StopEngine;

public class ExecuteCar {

	public static void main(String[] args) {
		Car car = new Car();
		while (true) {
			System.out.println("Please enter a status. ('start', 'stop', 'gas', 'brake') --> ");
			try {
				car.setState(getLine());
				car.execute();
			} catch (Exception e) {
				System.err.println("Car is terminated!!");
				break;
			}
		}
	}

	static State getLine() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		State state = null;
		try {
			line = in.readLine();
			switch (line) {
			case "gas":
				state = new Gas();
				break;
			case "brake":
				state = new Brake();
				break;
			case "start":
				state = new StartEngine();
				break;
			case "stop":
				state = new StopEngine();
				break;
			default:
				break;
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return state;
	}
}
