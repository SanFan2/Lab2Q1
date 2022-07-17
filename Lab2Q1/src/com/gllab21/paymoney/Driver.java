package com.gllab21.paymoney;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number number of days for computation (size of transaction array) :");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		for (int i = 0; i< size; i++) {
			System.out.println("Enter transaction amount (in crores of Rs) in Day "+ (i + 1) + " :");
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the target amount (in crores of Rs) :");
		int target = sc.nextInt();
		PayMoney pm =new PayMoney();
		int numberOfDays = pm.numberofDayTransactions(transactions, target);
		if (numberOfDays == -1)
			System.out.println("The Target " + target + "is not acheived!");
		else {
			System.out.println ("The Target " + target + " Crores is achieved in " + numberOfDays + " days" );
		}
		
		//displayTransactions(transactions);
		sc.close();
	}
	
	public static void displayTransactions(int[] transactions) {
		for (int transaction : transactions) {
			System.out.print(transaction + " ");
		}
		System.out.println();

	}

}
