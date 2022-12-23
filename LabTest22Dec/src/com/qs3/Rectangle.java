/*
 * Program: Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
 * two methods to print the area and perimeter of the rectangle respectively.
 * Its constructor having parameters for length and breadth is used to initialize length and
 * breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
 * class with its constructor having a parameter for its side (suppose s) 
 * calling the constructor of its parent class as 'super(s,s)'. Print the area and
 * perimeter of a rectangle and a square.
 * @Author: Dhiraj kumar
 * @Date: 23/12/2022
 * 
 * */

package com.qs3;

public class Rectangle 

{
	int length, breadth;

	public int area(int length, int breadth)
	
	{
		return length * breadth;
	}

	public int perimeter(int length, int breadth) 
	
	{
		return 2 * (length + breadth);
	}

	public Rectangle(int length, int breadth)
	
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}
}

class Square extends Rectangle 
{

	private int side;

	public Square(int length, int breadth, int side) {
		super(length, breadth);
		this.side = side;
	}

}