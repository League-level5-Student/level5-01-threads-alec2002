package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	
	public static void main(String[] args) {
		Robot r1 = new Robot(200, 250);
		Robot r2 = new Robot(550, 250);
		Robot r3 = new Robot(900, 250);
		Robot r4 = new Robot(350, 600);
		Robot r5 = new Robot(850, 600);
		
		
		
		r1.setSpeed(10);
		r1.setPenColor(Color.BLUE);
		r1.penDown();
		
		r2.setSpeed(10);
		r2.penDown();
		
		r3.setSpeed(10);
		r3.setPenColor(Color.RED);
		r3.penDown();
		
		r4.setSpeed(10);
		r4.setPenColor(Color.YELLOW);
		r4.penDown();
		
		r5.setSpeed(10);
		r5.setPenColor(Color.GREEN);
		r5.penDown();
		
		
		Thread s1 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r1.move(20);
				r1.turn(5);
			}
		} );
		
		Thread s2 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r2.move(20);
				r2.turn(5);
			}
		} );
		
		Thread s3 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r3.move(20);
				r3.turn(5);
			}
		} );
		

		Thread s4 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r4.move(20);
				r4.turn(5);
			}
		} );
		
		Thread s5 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r5.move(20);
				r5.turn(5);
			}
		} );
		
			s1.start();
			s2.start();
			s3.start();
			s4.start();
			s5.start();
		
		
		
		
		
		
	}

}

