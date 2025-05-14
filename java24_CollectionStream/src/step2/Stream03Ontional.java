package step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Stream03Ontional {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>(5);
		//list안에 데이터 없이 중간처리연산자를 가동시키면 NoSuchElementException 발생
		//이런 경우에 Optional이 필요하다.
//		Stream<Integer> stream=list.stream();
//		double avg=stream.mapToInt(Integer :: intValue).average().getAsDouble();
//		System.out.println(avg);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//방법 1.
		OptionalDouble optional=list.stream()
				.mapToInt(Integer::intValue)
				.average();
		if(optional.isPresent()) 
			System.out.println("AVG1 : "+optional.getAsDouble());
		else
			System.out.println("AVG1 : "+0.0);
		
		System.out.println("\n--------------------------------------");
		
		//방법 2.
		double avg2=list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("AVG2 : "+avg2);
		
		System.out.println("\n--------------------------------------");
		
		//방법 3.
		list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
		
	}

}
