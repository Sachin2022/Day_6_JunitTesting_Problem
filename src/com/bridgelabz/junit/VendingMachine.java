package com.bridgelabz.junit;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int note = 0;
		int i = 7;
		int[] mach = { 1, 2, 5, 10, 50, 100, 500, 1000 };
		System.out.print("Enter The Amount: ");
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		sc.close();
		while (amt > 0) {
			note = 0;
			while (amt >= mach[i]) {
				amt = amt - mach[i];
				note++;
			}
			if (note > 0) {
				System.out.printf("%-3dx  Rs %d", note, mach[i]);
				System.out.println(" ");
			}
			i--;
		}

	}
}
