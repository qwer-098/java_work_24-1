class Parentt{
	String name;
	int age;
	
	public Parentt() {};
}
class Chiild extends Parentt{
	String na;
	
	public void printt() {
		System.out.print(name+"\n"+age+"\n"+na);
	}
}

public class java610 {
	public static void main(String[] args) {
		Chiild aa=new Chiild();
		aa.name="홍길동";
		aa.age=62;
		aa.na="강원도 춘천";
		aa.printt();
		
	}
	}