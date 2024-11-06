/** 메소드 오버라이딩: 슈퍼 클래스의 메소드를 서브 클래스에서 재정의
 *  하나의 인터페이스에 서로 다른 내용 구현
 * super 키워드 : 자식 클래스에서 슈퍼(부모) 클래스에 접근할 때 사용되는 참조 변수
 * 	부모의 모든 프로퍼티 사용가능
 * 	자식, 서브 클래스에서만 사용 가능
 * super 메소드: 자식 클래스에서 슈퍼 클래스 메소드 호출  
 */

class Vehicle{
	public void drive() {
		System.out.println("자동차가 달립니다.");	
	}
}

class Carr extends Vehicle {
	public void drive() {
		System.out.println("자동차가 고속도로를 달립니다.");	
	}
}
class Truck extends Vehicle {
	public void drive() {
		System.out.println("트럭이 공사현장을 달립니다.");	
	}
}


public class java531 {
	public static void main(String[] args) {
		Vehicle ve=new Vehicle();
		Vehicle cc=new Carr();
		Vehicle tt=new Truck();
		ve.drive();
		cc.drive();
		tt.drive();
	}				
}