package n1exercici8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterface1 obtenido = palabra -> {

			StringBuilder reves = new StringBuilder(palabra);
			String palabraReves = reves.reverse().toString();
			return palabraReves;
		};
		System.out.println(obtenido.reverse("hola"));
	}
}