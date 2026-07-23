package com.krakedev;

public class CalculadoraTest {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
        double r1;
        r1 = c1.multiplicar(10, 6);
        System.out.println("Multiplicación: " + r1);

        double r2;
        r2 = c1.dividir(81, 8);
        System.out.println("División: " + r2);

        double r3;
        r3 = c1.promediar(13, 28, 7);
        System.out.println("Promedio: " + r3);

        c1.mostrarResultado();
	}

}
