class Person{
	String name;
	public Person(String name) {
		this.name=name;
	}
	public void disp() {
		System.out.println("이름: "+this.name);
	}
}

class Chi extends Person {
	String ha;
	public Chi(String ha) {
		super("홍길동");
		this.ha=ha;
	}
	public void disp() {
		super.disp();
		System.out.println("소속 학부: "+this.ha);
	}
}

public class wk05_202310387_고수림_test2 {
	public static void main(String[] args) {
		Person ps= new Chi("자율전공학부");
		ps.disp();
	}				
}