// this 레퍼런스
/**
 * 객체 자신에 대한 레퍼런스
 * 컴파일러에 의해 자동 관리, 개발자는 사용하기만 하면 됨
 * this.멤버 형태로 멤버 사용
 * 
 * this 예약어는 메시지를 전달받은 객체를 의미 // 인스턴스 a, b 같은 의민가봄
 * 객체의 멤버 변수와 메소드 변수의 이름이 같은 경우
 * 다른 메소드 호출 시 객체 자신의 레퍼런스를 전달할 때
 * 메소드가 객체 자신의 레퍼런스를 반환할 때 // a, b의 내용 반환 그건가?
 * 매개변수 이름이 객체 변수의 이름과 같은 경우 객체 변수 이름 앞에 this를 사용해서 둘을 구별
 */

import java.text.DecimalFormat;

/** DecimalFormat : import java.text.DecimalFormat
 * 
 */
class Car{
	String model, color;
	int price, qty;
	
	public Car() {}
	public Car(String model, String color, int price, int qty) {
		this.model=model;
		this.color=color;
		this.price=price;
		this.qty=qty;
	}
	
	public void carSaleDisp() {
		DecimalFormat df=new DecimalFormat(",###");
		int sale=this.price*this.qty;
		System.out.println(this.model+" "+this.color+" ");
		System.out.println(df.format(sale));
	}
}

public class java430_DecimalFormat {
	public static void main(String[] args) {
		Car cr=new Car("차", "무지개색", 600000,3);
		cr.carSaleDisp();
		
	}				
}