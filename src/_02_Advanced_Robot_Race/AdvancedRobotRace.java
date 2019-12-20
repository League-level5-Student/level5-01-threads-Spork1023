package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.

	// 1. make a main method
	public static void main(String[] args) {
		Random r = new Random();
		int y = 999;
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		robots[0].moveTo(200, 800);
		robots[1].moveTo(400, 800);
		robots[2].moveTo(600, 800);
		robots[3].moveTo(800, 800);
		robots[4].moveTo(1000, 800);
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Thread t1 = new Thread(() -> {
			robots[0].move(r.nextInt(50));
		});

		Thread t2 = new Thread(() -> {
			robots[1].move(r.nextInt(50));
		});
		Thread t3 = new Thread(() -> {
			robots[2].move(r.nextInt(50));
		});
		Thread t4 = new Thread(() -> {
			robots[3].move(r.nextInt(50));
		});
		Thread t5 = new Thread(() -> {
			robots[4].move(r.nextInt(50));
		});
		while (y != 0) {
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			for (int i = 0; i < robots.length; i++) {
				if (robots[i].getY() < y) {
					y = robots[i].getY();
				}
			}
		}
	}
}
