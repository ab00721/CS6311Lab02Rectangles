package edu.westga.cs6311.rectangles;

import java.awt.Rectangle;

/**
 * Info
 * @author Anna Blood
 * @version CS6311 - 08/25/2022
 *
 */

public class PerimeterTester {

	/**
	 * Application entry point
	 * 
	 * @param args Not used
	 */
	public static void main(String[] args) {

		Rectangle rectangleOne = new Rectangle(30, 40, 65, 25);
		
		double rectangleWidth = rectangleOne.getWidth();
		double rectangleHeight = rectangleOne.getHeight();
		double perimeter = 2 * rectangleWidth + 2 * rectangleHeight;
		
		System.out.println("Expected perimeter: 180.0");
		System.out.println("Calculated perimeter: " + perimeter);		
	}

}
