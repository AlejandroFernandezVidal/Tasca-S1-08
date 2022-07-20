package n2exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(13);
		numeros.add(64);
		numeros.add(33);

		System.out.println(cadenaNumeros(numeros));
		
	}
	
	public static String cadenaNumeros(List<Integer> numeros) {

		return numeros.stream().map(a -> a % 2 == 0?  "e" + a : "o" + a).collect(Collectors.joining(","));
	}
}