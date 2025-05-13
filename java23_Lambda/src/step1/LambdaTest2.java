package step1;

//Annotation 을 붙이면 컴파일시에 추상메소드가 1개 인지를 확인

@FunctionalInterface
interface Workable{
	String monthPayment(String ename, double weekSal);
}
class Employee{
	String ename;
	double weekSal;
	public Employee(String ename, double weekSal) {
		super();
		this.ename = ename;
		this.weekSal = weekSal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getWeekSal() {
		return weekSal;
	}
	public void setWeekSal(double weekSal) {
		this.weekSal = weekSal;
	}
	
	//work()함수와 Workable Has a 관계로 연결
	public void work(Workable w) {
		String result=w.monthPayment(ename, weekSal);
		System.out.println("Result=>"+result);
	}
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", weekSal=" + weekSal + "]";
	}
	
}
public class LambdaTest2 {
	public static void main(String[] args) {
		Employee e = new Employee("James",500.0);
		//익명클래스로 구현...월급계산(주급 * 4 +100.0)
		e.work(new Workable() {
			
			@Override
			public String monthPayment(String ename, double weekSal) {
				double mSal = weekSal*4+100.0;
				return ename+" 님의 4주 급여는 "+mSal;
			}
		});
		//람다식.. 구현부가 2줄 이상일때는 { }, return 도 생략할 수 없다.
		e.work((a,b)->{
			double mSal = b*4+100.0;
			return a+" 님의 4주 급여는 " +mSal;
			});
	}//main
}//class
