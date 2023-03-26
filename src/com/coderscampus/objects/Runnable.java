package com.coderscampus.objects;

import java.util.Scanner;

public class Runnable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String number = scanner.nextLine();
		
	
		scanner.close();
	}

}
