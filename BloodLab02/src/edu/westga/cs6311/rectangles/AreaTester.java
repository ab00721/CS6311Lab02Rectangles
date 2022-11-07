package edu.westga.cs6311.rectangles;

import java.awt.Rectangle;

/**
 * Info
 * @author Anna Blood
 * @version CS6311 - 08/25/2022
 *
 */

public class AreaTester {
	
	/**
	 * Application entry point 
	 * 
	 * @param args Not used 
	 */
	public static void main(String[] args) {
	
		Rectangle rectangleOne = new Rectangle(25, 50, 70, 30);
		
		double rectangleWidth = rectangleOne.getWidth();
		double rectangleHeight = rectangleOne.getHeight();
		double area = rectangleWidth * rectangleHeight;
		
		System.out.println("Expected area: 2100.0");
		System.out.println("Calculated area: " + area);
	}

}
