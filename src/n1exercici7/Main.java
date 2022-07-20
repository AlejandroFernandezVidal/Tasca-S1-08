package n1exercici7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listado = new ArrayList<>();
		listado.add("Pepe");
		listado.add("Antonio");
		listado.add("Pepa");
		listado.add("8");
		listado.add("21");
		listado.add("Restaurante");
		
		listado.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
	}
}