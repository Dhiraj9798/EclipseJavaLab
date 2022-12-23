package com.qs3;


public class Test {

	public static void main(String[] args) {
		Square s1 = new Square(18, 15, 9);
		System.out.println("Area of Square is =" + s1.area(9, 9));
		System.out.println("Perimeter of Square is =" + s1.perimeter(9, 9));
		System.out.println("Area of Rectangle is =" + s1.area(18, 15));
		System.out.println("Perimeter of Rectangle is =" + s1.perimeter(18, 15));

	}

}