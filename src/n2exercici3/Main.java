package n2exercici3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x = 10;
		float y = 5;
		FunctionalInterface1 suma = (a,b)-> a+b;
		FunctionalInterface1 resta = (a,b)->a-b;
		FunctionalInterface1 multiplicacion = (a,b)->a*b;
		FunctionalInterface1 division = (a,b)->a/b;
		
		System.out.println(suma.operacio(x, y));
		System.out.println(resta.operacio(x, y));
		System.out.println(multiplicacion.operacio(x, y));
		System.out.println(division.operacio(x, y));
	}
}