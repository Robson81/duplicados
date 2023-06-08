package poo;

import java.util.Locale;
import java.util.Scanner;

import entitites.ProductConstructors;

public class Construtors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  
		
		
		
		System.out.print("Enter the name of Product: ");
	    String name = sc.nextLine().toUpperCase();
		System.out.print("Enter the price of Product: ");
		Double price = sc.nextDouble();
		System.out.print("Enter the quantity of Product: ");
		int quantity = sc.nextInt();
		ProductConstructors x = new ProductConstructors(name, price, quantity);
		
		x.setName("TESTE");
		
		System.out.println("UPDATED NAME: " + x.getName());
		
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
