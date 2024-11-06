// abstract - sub에서 오버라이딩 하도록.
abstract class Parent{ // 추상 클래스
	protected String name;
	public abstract void callme(); // 추상 메소드
	public void aa() {
		System.out.println();
	}
}
class Child extends Parent{
	int age;
	String school;
	
	public void callme() {
		name="홍길동"; // protected 라서 조작가능
		age=21;
		System.out.println(name+" "+age);
	}
}
public class jj10 {
	public static void main(String[] args) {
		Child boy=new Child();
		boy.callme();
	}
}
