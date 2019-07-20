package com.db1.db1start;

public class Matematica {
	
	public static double dois(double num1, double num2) {
		if (num1 > num2) {
			return num2;
		}
		return num1;
	}
	
	public static double tres(double num1, double num2, double num3) {
		if ((num1 > num2) && (num1 > num3) && (num2 > num3)) {
			return num3;
		}
		else if ((num1 > num2) && (num1 > num3) && (num3 > num2)){
			return num2;
			}
		else if ((num2 > num1) && (num2 > num3) && (num3 > num1)) {
			return num1;
		}
		else if ((num2 > num1) && (num2 > num3) && (num1 > num3)) {
			return num3;
		}
		else if ((num3 > num1) && (num3 > num2) && (num2 > num1)) {
			return num1;
		}
		return num2;
		
	}


}