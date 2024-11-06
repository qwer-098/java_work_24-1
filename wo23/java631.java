class Par{
	String name="김수로";
	int age=70;
	String jokbo;
	
	public Par(String jokbo) {
		this.jokbo=jokbo;
	}
}

class Cha extends Par{
	String name;
	public Cha(String jokbo) {
		super(jokbo);
	}
	public void ccha() {
		System.out.println("부모 이름은 "+super.name+" 연세 "+super.age);
		System.out.println("집안은 "+ super.jokbo);
		System.out.println("종손 "+ this.name);
	}
}
public class java631 {
	public static void main(String[] args) {
		Cha cc=new Cha("경주김씨 28대손");
		cc.name="김삼식";
		cc.ccha();
	}
}