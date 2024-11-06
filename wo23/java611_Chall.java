// chall
class A{
	int x;
}

class B extends A{
	String x;
}

public class java611_Chall {
	public static void main(String[] args) {
		A A1= new A();
		A1.x=1000;
		B A2= new B();
		A2.x="Seoul";
		
		System.out.print( A1.x + A2.x );
	}
}
