package edu.westga.cs6311.rectangles;

import java.awt.Rectangle;

/**
 * Info
 * @author Anna Blood
 * @version CS6311 - 08/26/2022
 *
 */

public class UnionTester {

	/**
	 * Application entry point
	 * 
	 * @param args Not used
	 */
	public static void main(String[] args) {
				
		Rectangle rectangleOne = new Rectangle(10, 10, 20, 10);
		Rectangle rectangleTwo = new Rectangle(15, 5, 10, 25);
		
		System.out.println("Rectangle One: " + rectangleOne);
		System.out.println("Rectangle Two: " + rectangleTwo);
		
		Rectangle unionRectangle = rectangleOne.union(rectangleTwo);
		
		System.out.println("Union Rectangle: " + unionRectangle);
		
		double rectangleWidth = unionRectangle.getWidth();
		double rectangleHeight = unionRectangle.getHeight();
		double perimeter = 2 * rectangleWidth + 2 * rectangleHeight;
		
		System.out.println("Calculated union rectangle perimeter: " + perimeter);		
			
	}

}
