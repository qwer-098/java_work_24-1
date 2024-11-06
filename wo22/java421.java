// 4주차 2차시
/**
 * 생성자 선언: 객체가 생성될 때 초기화를 위해 실행되는 메소드로, 매개변수를 전달받아 인스턴스 변수를 초기화하는 생성자.
 */
class Employee1{
	String name;
	int age;
	
	public Employee1() {} // 기본 생성자
	public Employee1(String n) { 	   // 이름을 초기화하는 생성자
		name=n;
	}
	public Employee1(String n, int a) { // 이름과 나이를 초기화하는 생성자
		name=n; age=a;
	}
}

public class java421 {
	public static void main(String[] args) {
		Employee1 im= new Employee1("임시환");
		im.age=35; // 이름만 초기화해서 age는 따로 넣어주기 
		
		Employee1 ep=new Employee1("조인성", 44);
		
		System.out.print(ep.name+" "+ep.age);
	}				
}