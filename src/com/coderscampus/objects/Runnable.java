package com.coderscampus.objects;

import java.util.Scanner;

public class Runnable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String number = scanner.nextLine();
		
		NumberService newNumber = new NumberService();
		newNumber.setNumber(number);
		
		System.out.println("The number you typed was: " + newNumber.getNumber());
	
		scanner.close();
	}
}
