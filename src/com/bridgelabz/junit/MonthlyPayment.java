package com.bridgelabz.junit;

import java.util.Scanner;

public class MonthlyPayment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Princple Amount: ");
		double P = sc.nextDouble();
		System.out.println("Enter Years: ");
		double Y = sc.nextDouble();
		System.out.println("Enter Rate: ");
		double R = sc.nextDouble();
		sc.close();

		double monthlyAmount = monthlyPayment(P, Y, R);
		System.out.printf("Monthly Payment: %.3f", monthlyAmount);
	}

	public static double monthlyPayment(double P, double Y, double R) {
		double n, r;
		n = 12 * Y;
		r = R / 1200;
		double pay = ((P * r) / (1 - (Math.pow((1 + r), (-n)))));
		System.out.printf("Monthly Payment: ", pay);
		return pay;
	}

}
