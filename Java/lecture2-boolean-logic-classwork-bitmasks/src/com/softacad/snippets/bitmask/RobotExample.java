package com.softacad.snippets.bitmask;

public class RobotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		
		robot.setFlag(Robot.IS_MOVING);
		robot.printStatus();
		
		System.out.println("--------------------");		
		robot.setFlag(Robot.LIGHTS_ON | Robot.IS_MOVING);
		robot.printStatus();		
	}
}
