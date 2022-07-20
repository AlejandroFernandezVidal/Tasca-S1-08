package n2exercici4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listado = new ArrayList<>();
		listado.add("Restaurante");
		listado.add("8");
		listado.add("Resultado");
		listado.add("Playa");
		listado.add("21");
		listado.add("Verano");
		listado.add("Hotel");
		listado.add("Primavera");
		//obtener lista ordenada por el primer caracter hay dos modos
		listado.stream().sorted(Comparator.comparing(a->a.charAt(0))).forEach(System.out::println);
		listado.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		//obtener primero las que contienen la E y luego el resto
		listado.stream().filter(a->a.contains("e")).sorted(Comparator.naturalOrder()).forEach(System.out::println);
		listado.stream().filter(a->!a.contains("e")).sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		//modoficar todos los elemntos que contienen A, comentado aparace el filter por si solo queremos los elemntos con A
		listado.stream()./*filter(a->a.contains("a")).*/map(a->a.replace("a","4")).sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		//obtener numeros de cadena String
		listado.stream().filter(a->a.matches(".*[0-9].*")).forEach(System.out::println);
	}
}