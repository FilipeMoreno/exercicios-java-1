package com.db1.db1start;

public class Inteiro {

	public static Integer Soma(Integer soma1, Integer soma2) {
		if ((soma1 != null) || (soma2 != null)) {
			Integer result = soma1 + soma2;
			return result;
		}
		return 0;
		
	}
	
	public static Integer Subtracao(Integer sub1, Integer sub2) {
		if ((sub1 != null) || (sub2 != null)) {
			if (sub1 > sub2) {
				Integer result = sub1 - sub2;
				return result;
			}
			Integer result = sub2 - sub1;
			return result;
		}
		return 0;
		
	}
}
