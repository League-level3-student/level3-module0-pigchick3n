package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	// 1. make a main method
	public static void main(String[] args) {
		int distance;
		boolean win = true;
		Robot[] army = new Robot[5];
		for (int i = 0; i < army.length; i++) {
			army[i]= new Robot();
		}
		for (int i = 0; i < army.length; i++) {
			army[i].setX(175*i+75);
			army[i].setY(550);
		}
		while(win == true)
		for (int i = 0; i < army.length; i++) {
			Random ran = new Random(); 
			int randomNum= ran.nextInt(50);
			distance= randomNum;
			army[i].setSpeed(10);
			army[i].move(distance);
			if (army[i].getY()<= 0) {
				win = false;
				i++;
				JOptionPane.showMessageDialog(null, "ROBOT " + i + " HAS WON HEHE XD");
			}
		}

	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.
	
	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
	}
}
