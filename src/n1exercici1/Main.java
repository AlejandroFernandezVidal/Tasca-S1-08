package n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listado = new ArrayList<>();
		listado.add("Pepe");
		listado.add("Adios");
		listado.add("Hola");
		listado.add("Dia");
		listado.add("Tarde");
		listado.add("Noche");
		
		List<String> listadoO = listado.stream().filter(a->a.contains("o")).collect(Collectors.toList());listadoO.forEach(a -> System.out.println(a));
	}
}