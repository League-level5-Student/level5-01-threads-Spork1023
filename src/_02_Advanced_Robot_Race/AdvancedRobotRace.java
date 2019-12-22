package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	static boolean isRacing = true;
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		
		Random rand = new Random();
		Robot[] Robs = new Robot[5];
		
		for (int i = 0; i < Robs.length; i++) {
			Robs[i] = new Robot();
		}
		
		for (int i = 0; i < Robs.length; i++) {
			Robs[i].setX(200*i);
			Robs[i].setY(400);
		}
		Thread t1 = new Thread(()-> {
			while(isRacing) {
				Robs[0].move(rand.nextInt(50));
				if(Robs[0].getY()<=0) {
					isRacing = false;
				}
			}
		});
		Thread t2 = new Thread(()-> {
			while(isRacing) {
				Robs[1].move(rand.nextInt(50));
				if(Robs[1].getY()<=0) {
					isRacing = false;
				}
			}
		});
		Thread t3 = new Thread(()-> {
			while(isRacing) {
				Robs[2].move(rand.nextInt(50));
				if(Robs[2].getY()<=0) {
					isRacing = false;
				}
			}
		});
		Thread t4 = new Thread(()-> {
			while(isRacing) {
				Robs[3].move(rand.nextInt(50));
				if(Robs[3].getY()<=0) {
					isRacing = false;
				}
			}
		});
		Thread t5 = new Thread(()-> {
			while(isRacing) {
				Robs[4].move(rand.nextInt(50));
				if(Robs[4].getY()<=0) {
					isRacing = false;
				}
			}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		JOptionPane.showMessageDialog(null, "Robot Won!!!");
	}
}