package poo;

import java.util.Locale;
import java.util.Scanner;

import entitites.CurrencyConverter;

public class DolarConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("What is the dollar price: ");
	double price = sc.nextDouble();
	System.out.print("How many dollars will be bought: ");
	double dollarBought = sc.nextDouble();
	
	System.out.printf("Total to paid in reais: %.2f", CurrencyConverter.currencyConverter(price, dollarBought));
	
	sc.close();
	}

}
