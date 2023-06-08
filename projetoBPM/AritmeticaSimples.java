package projetoBPM;

import java.util.Locale;
import java.util.Scanner;

public class AritmeticaSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

			System.out.println("To calculate the rectangle area, enter the measures below: ");
			System.out.print("Width: ");
			double width = sc.nextDouble();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			double area = width * height;
			System.out.printf("The rectangle area: %.2f\n", area);

			System.out.println("To continue, enter 1; to exit, enter 0");
			
			
		sc.close();
	}

}
