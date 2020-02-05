package aplicacao;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Pragrama2 {

	public static void main(String[] args) {

		Set <Integer> a = new TreeSet<>(Arrays.asList(1,2,3,4,5,20,30));
		
		Set <Integer> b = new TreeSet<>(Arrays.asList(6,7,8,9,10,20,30));
		
		//uni�o
		
		Set <Integer> c = new TreeSet<Integer>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersec��o
		
		Set <Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// diferen�a
		
		Set <Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b);
		System.out.println(e);
		
		
		
		
	}

}
