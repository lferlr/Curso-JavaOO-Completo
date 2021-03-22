package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Lucas");
		list.add("Andr�");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");

		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		System.out.println("Index of Lucas: " + list.indexOf("Lucas"));
		
		if (list.indexOf("Bob") == -1) {
			System.out.println("Index of Bob: N�o encontrado!");
		} else {
			System.out.println("Index of Bob: " + list.indexOf("Bob"));
		}
		
		System.out.println("------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());	
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
		
	}

}
