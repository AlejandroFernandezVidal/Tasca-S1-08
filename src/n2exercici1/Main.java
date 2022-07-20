package n2exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nombresPropios = new ArrayList<>();
		nombresPropios.add("Antonio");
		nombresPropios.add("Pepe");
		nombresPropios.add("Ale");
		nombresPropios.add("Leonor");
		nombresPropios.add("Asu");
		
		nombresPropios.stream().filter(a -> (a.charAt(0) == 'A') && (a.length()== 3)).forEach(System.out::println);
	}
}