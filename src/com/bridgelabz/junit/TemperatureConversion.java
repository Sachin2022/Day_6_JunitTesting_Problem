package com.bridgelabz.junit;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Select 1 to convert Celsius to Fahrenheit ");
		System.out.println(" Select 2 to convert Fahrenheit to Celsius ");
		int select = sc.nextInt();
		temperaturConversion(select);
		sc.close();

	}

	public static void temperaturConversion(int n) {
		Scanner s = new Scanner(System.in);
		float temp, newTemp;

		if (n == 1) {
			System.out.println("Enter Temperature in Celsius: ");
			temp = s.nextFloat();
			newTemp = ((temp * 9) / 5) + 32;
			System.out.println("Temperature in  is Fahreheit: " + newTemp);
		} else if (n == 2) {
			System.out.println("Enter Temperature in Fahreheit: ");
			temp = s.nextFloat();
			newTemp = ((temp - 32) * 5 / 9);
			System.out.println("Temperature in Celsius is: " + newTemp);
		} else {
			System.out.println("Invalid Entry!");
		}
		s.close();
	}

}
