package self.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		List<String> coffes = Arrays.asList("Cappuccino",
									"Americano",
									"Espresso",
									"Caramel Macchiato",
									"Mocha",
									"Cappuccino",
									"Espresso",
									"Latte");
//		Stream<String> stream = coffes.stream();
//		stream.filter(e->e.endsWith("o")).sorted((o1, o2) -> o2.charAt(0)-o1.charAt(0)).distinct().forEach(System.out::println);
//		stream.filter(e->e.endsWith("o")).sorted((o1, o2) -> o2.compareTo(o1)).distinct().forEach(System.out::println);
		//Method Chaining기법
		List<String>endingCoffees=coffes.stream().filter(c->c.endsWith("o")).sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println(endingCoffees);
	}

}
