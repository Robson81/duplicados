package poo;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product;

public class ProductProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);  
	Product x = new Product();
	
	
	System.out.print("Enter the name of Product: ");
	x.name = sc.nextLine().toUpperCase();
	System.out.print("Enter the price of Product: ");
	x.price = sc.nextDouble();
	System.out.print("Enter the quantity of Product: ");
	x.quantity = sc.nextInt();
	
	System.out.println(x);
	System.out.print("\n\nEnter the quantity to add in the stok: ");
	
	x.addProduct(sc.nextInt());
	System.out.println(x);
	System.out.print("\n\nEnter the quantity to remove in the stok: ");
	
	x.removProduct(sc.nextInt());
	System.out.println(x);
	
	

	
	sc.close();
	}

}
