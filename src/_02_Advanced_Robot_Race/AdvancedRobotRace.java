package _02_Advanced_Robot_Race;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	static boolean raceRunning = true;
	static int win = 0;
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	//1. make a main method
		public static void main(String[] args) {
			//2. create an array of 5 robots.
			 Robot[] rob = new Robot[5];
			
			//3. use a for loop to initialize the robots.
	for (int i = 0; i < rob.length; i++) {
		rob[i] = new Robot();
	}
				//4. make each robot start at the bottom of the screen, side by side, facing up
	int num = 200;
		for (int i = 0; i < rob.length; i++) {
			rob[i].setX(num);
			rob[i].setAngle(0);
			num += 150;
			rob[i].setSpeed(10);
		}
			//5. use another for loop to iterate through the array and make each robot move 
		    //   a random amount less than 50.
		
		
		Random r = new Random();
		
		
		
		Thread s0 = new Thread(()-> {
            while(raceRunning) {
         	   if(rob[0].getY() > 0) {
         		   rob[0].move(r.nextInt(49));
         	   }
         	   
         	   else {
         		   win = 0;
         		   raceRunning = false;
         	   }
            }
            
          
           
			
		} );
		
		Thread s1 = new Thread(()-> {
               while(raceRunning) {
            	   if(rob[1].getY() > 0) {
            		   rob[1].move(r.nextInt(49));
            	   }
            	   
            	   else {
            		   win = 1;
            		   raceRunning = false;
            	   }
               }
               
             
              
			
		} );
		
		Thread s2 = new Thread(()-> {
            while(raceRunning) {
         	   if(rob[2].getY() > 0) {
         		   rob[2].move(r.nextInt(49));
         	   }
         	   
         	   else {
         		 win = 2;
         		   raceRunning = false;
         	   }
            }
            
          
           
			
		} );
		
		Thread s3 = new Thread(()-> {
            while(raceRunning) {
         	   if(rob[3].getY() > 0) {
         		   rob[3].move(r.nextInt(49));
         	   }
         	   
         	   else {
         		 win = 3;
         		   raceRunning = false;
         	   }
            }
            
          
           
			
		} );
		
		Thread s4 = new Thread(()-> {
            while(raceRunning) {
         	   if(rob[4].getY() > 0) {
         		   rob[4].move(r.nextInt(49));
         	   }
         	   
         	   else {
         		 win = 4;
         		   raceRunning = false;
         	   }
            }
            
          
           
			
		} );
		
		    s0.start();
			s1.start();
			s2.start();
			s3.start();
			s4.start();
			
			try {
				s0.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				s1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				s2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				s3.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				s4.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
			JOptionPane.showMessageDialog(null, "Robot " + win + " won");
		
		
			//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

			//7. declare that robot the winner and throw it a party!
	    	
			//8. try different races with different amounts of robots.
	    	
		    //9. make the robots race around a circular track.

		}

}