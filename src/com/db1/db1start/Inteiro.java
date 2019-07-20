package com.db1.db1start;

public class Inteiro {

	public static Integer Soma(Integer soma1, Integer soma2) {
		if ((soma1 != null) || (soma2 != null)) {
			return soma1 + soma2;
		}
		return 0;
		
	}
	
	public static Integer Subtracao(Integer sub1, Integer sub2) {
		if ((sub1 != null) || (sub2 != null)) {
			if (sub1 > sub2) {
				return  sub1 - sub2;
			}
			return sub2 - sub1;
		}
		return 0;
		
	}
}
