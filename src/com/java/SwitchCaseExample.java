package com.java;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number (1-7) representing the day of the week: ");
		int dayNumber = scanner.nextInt();

		System.out.print("Using switch case: ");
		printDayUsingSwitch(dayNumber);

		scanner.close();
	}

	// Method to print the day using switch case
	private static void printDayUsingSwitch(int dayNumber) {
		switch (dayNumber) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day number");
		}
	}
}
