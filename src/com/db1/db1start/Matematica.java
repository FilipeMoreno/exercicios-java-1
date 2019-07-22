package com.db1.db1start;

public class Matematica {
	
	private double numero1;
	private double numero2;
	private double numero3;
	
	public Matematica(double numero1, double numero2, double numero3) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
	}
	
	public double menorDois() {
		if (numero1 > numero2) {
			return numero2;
		}
		return numero1;
	}
	
	public double menorTres() {
		if ((numero1 > numero2) && (numero1 > numero3) && (numero2 > numero3)) {
			return numero3;
		}
		else if ((numero1 > numero2) && (numero1 > numero3) && (numero3 > numero2)){
			return numero2;
			}
		else if ((numero2 > numero1) && (numero2 > numero3) && (numero3 > numero1)) {
			return numero1;
		}
		else if ((numero2 > numero1) && (numero2 > numero3) && (numero1 > numero3)) {
			return numero3;
		}
		else if ((numero3 > numero1) && (numero3 > numero2) && (numero2 > numero1)) {
			return numero1;
		}
		return numero2;
		
	}
	
	public double mediaTresNumeros() {
		return (numero1 + numero2 + numero3) / 3;
	}
	
	public double areaTriangulo(double base, double altura) {
		double area;
		area = (base * altura) / 2;
		return area;
	}


}