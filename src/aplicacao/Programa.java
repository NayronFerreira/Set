package aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class Programa {
	
	public static void main(String [] args) {
		
		Set <String> set = new TreeSet<>();
		
	//	Set <String> set = new HashSet<>();
		
//		Set <String> set = new LinkedHashSet<>();
		
		set.add("Ingrid");
		set.add("Nayron");
		set.add("Tataia");
		set.add("Ferreira");
		set.add("SanTana");
		set.add("Martin");
		set.add("Oliver");
		
		set.remove("Martin");
		
		set.removeIf(x->x.charAt(0) == 'T');
		System.out.println(set.contains("Oliver"));
		
		for (String x: set) {
			System.out.println(x);
		}
		
		
		
		
	}

}
