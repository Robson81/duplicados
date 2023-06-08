package poo;


import java.util.Locale;
import java.util.Scanner;

import entitites.Triangle;
public class triangleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Triangle x, y;
	
	x = new Triangle();
	y = new Triangle();
	
	System.out.println("Enter the measues of triangle x: ");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	System.out.println("Enter the measues of triangle y: ");
	y.a = sc.nextDouble();	
	y.b = sc.nextDouble();	
	y.c = sc.nextDouble();
	
	double xArea = x.areaTriangle();
	double yArea = y.areaTriangle();
	
	System.out.printf("Area Triangle X: %.4f\n", xArea);
	System.out.printf("Area Triangle y: %.4f\n", yArea);
	if(xArea>yArea)
		System.out.println("Large Area: Triangle X");
	else
	    System.out.println("Large Area: Triangle y");
	
	
	sc.close();
	}

}
