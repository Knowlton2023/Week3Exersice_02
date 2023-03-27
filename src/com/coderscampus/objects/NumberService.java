package com.coderscampus.objects;

public class NumberService {
	String number;
	
	Integer getNumber() {
		Integer convertedNumber = Integer.parseInt(number);
		if (convertedNumber < 50 || convertedNumber > 300) {
			return null;
		} else {
			return convertedNumber;
		}
	}

	void setNumber(String number) {
		this.number = number;
	}
}
