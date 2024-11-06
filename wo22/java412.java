// 4주차 1차시 실습 test1
// 나중에 지우삼
class Salary{
	int kibon, sudang;
	
	public Salary() {} // 기본 생성자
	
	public void staffpay() { // 메소드
		System.out.println(this.kibon +this.sudang);
}}

public class java412 {
	public static void main(String[] args) {
		Salary sl=new Salary(); // 객체 생성
		sl.kibon=2000000;
		sl.sudang=500000;
		sl.staffpay();
}}