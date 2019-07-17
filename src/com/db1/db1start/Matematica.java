package com.db1.db1start;

public class Matematica {
	
	public static float dois(float num1, float num2) {
		if (num1 > num2) {
			return num2;
		}
		return num1;
	}
	
	public static float tres(float num1, float num2, float num3) {
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
