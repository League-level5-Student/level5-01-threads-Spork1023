package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot r1 = new Robot(300, 700);
		Robot r2 = new Robot(500, 800);
		Robot r3 = new Robot(700, 700);
		Robot r4 = new Robot(900, 800);
		Robot r5 = new Robot(1100, 700);

		r1.setSpeed(400);
		r2.setSpeed(400);
		r3.setSpeed(400);
		r4.setSpeed(400);
		r5.setSpeed(400);
		
		r1.penDown();
		r1.setPenWidth(10);
		r2.penDown();
		r2.setPenWidth(10);
		r3.penDown();
		r3.setPenWidth(10);
		r4.penDown();
		r4.setPenWidth(10);
		r5.penDown();
		r5.setPenWidth(10);

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r1.turn(1);
				r1.move(3);
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r2.turn(1);
				r2.move(3);
			}
		});

		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r3.turn(1);
				r3.move(3);
			}
		});

		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r4.turn(1);
				r4.move(3);
			}
		});

		Thread t5 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r5.turn(1);
				r5.move(3);
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
