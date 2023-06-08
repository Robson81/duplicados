package poo;

import java.util.Locale;
import java.util.Scanner;
import entitites.BankAccount;

public class BankAccountProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount bank;;
		
		System.out.print("Enter Account Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Account Holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an Initial Deposit? (y/n): ");
		char ask = sc.next().charAt(0);
		if (ask=='y') {
		System.out.print("Enter an initial deposit value: ");
		double initialDeposit = sc.nextDouble();
	
			bank = new BankAccount(number, name, initialDeposit);
			System.out.println(bank);
		}else {
			 bank = new BankAccount(number, name);
			System.out.println(bank);
		}
		bank.aux=1;
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bank.deposit(deposit);
		System.out.println(bank);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bank.withdraw(withdraw);
		System.out.println(bank);
		System.out.println();
		
		

		sc.close();
	}

}
