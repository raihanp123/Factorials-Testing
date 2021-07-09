package com.qa;

public class Factorial {

	public String factorial(int num) {
		int count = 1;
		int returnNum=num;
		float floatNum = (float)num;

		while (floatNum >1) {
			floatNum = floatNum/count;
			
			if (floatNum==1) {
				return "" + returnNum + " = " + count + "!"; 
			}
			count++;
		}
		return "" + returnNum + " NONE";
			
	}
				
}
