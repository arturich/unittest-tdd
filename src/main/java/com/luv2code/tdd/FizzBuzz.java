package com.luv2code.tdd;

public class FizzBuzz {

	// If number is divisible by 3, print Fizz
	public static String compute(int num) {
		
		if(num % 3 == 0 && num % 5 == 0)
			return "FizzBuzz";
		else
		if(num % 3 == 0)
			return "Fizz";
		else
		if(num % 5 == 0)
			return "Buzz";
		
		return Integer.toString(num);
	}

	
}
