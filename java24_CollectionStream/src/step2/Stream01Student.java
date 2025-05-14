package step2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
}
public class Stream01Student {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
									new Student("Scott",90),
									new Student("Blake",80),
									new Student("King",95)
									);
		Stream<Student> studentStream=students.stream();
		
		IntStream scoreStream=studentStream.mapToInt(student->student.getScore());
		double avg=scoreStream.average().getAsDouble();
		System.out.println("학생들 평균점은 "+(int)avg);
		
		//Method Chaining
		students.stream().mapToInt(student->student.getScore())
				.peek(e->System.out.println(e)); //중간연산자까지만 실행해서 출력되지 않는다.
		
		System.out.println("\n -------------------중간연산자 peek------------------");
		//중간연산자 peek 는 최종연산자 실행 후 중간에 확인하고 싶은 부분의 중간연산부분을 확인할 수 있다.
		double avg1=students.stream().mapToInt(student->student.getScore())
				.peek(e->System.out.println(e)).average().getAsDouble();
		System.out.println("학생들 평균점은 "+(int)avg1);
		
		
		System.out.println("\n -------------------중간연산자 map------------------");
		long count=students.stream().map(s->s.getName()).count();
		System.out.println("학생수는 "+count+"명입니다.");
		System.out.println("\n---중간연산자(filter,map) | 최종연산자(anyMatch)---");
		
		boolean find=students.stream().anyMatch(i->i.getName().equals("King"));
		System.out.println("King 이름의 학생이 존재합니까?"+find);
		
		/*
			중간연산자
			map, filter, mapToInt
			peek
			distinct
			limit
			
			최종연산자
			anyMatch
			count
			average
			forEach
			collect
		 */
	}//main
}//class
