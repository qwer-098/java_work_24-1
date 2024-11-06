class ParentKim{
	String name="김수로";
	int age=70;
	String jokbo;
	
	public ParentKim (String jokbo) {
		this.jokbo=jokbo;
	}
}

class Child extends ParentKim {
	String s;
	public Child(String s) {
		super("김삼식");
		this.s=s;
		System.out.println("부모 이름은 "+name+"이고 "+jokbo);
	}
}

public class jjava630 {
	public static void main(String[] args) {
		Child objChild= new Child("경주김씨 28대손");
	}
}
