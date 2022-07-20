package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listado = new ArrayList<>();
		listado.add("Antonio");
		listado.add("Adios");
		listado.add("Hola");
		listado.add("Dia");
		listado.add("Tarde");
		listado.add("Noches");
		
		List<String> listadoO = listado.stream().filter(a->a.contains("o") && a.length()>5).collect(Collectors.toList());listadoO.forEach(a->System.out.println(a));
	}
}