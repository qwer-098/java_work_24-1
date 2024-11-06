abstract class Rabbit{ // 추상 클래스
	abstract public void sleeping(); // 추상 메소드
//	 public abstract도 상관x
}

class House extends Rabbit{
	public void sleeping() { // 오버라이딩
		System.out.println("집 토끼가 우리에서 잠자고 있습니다.");
	}
}
class Mountain extends Rabbit{
	public void sleeping() { // 오버라이딩
		System.out.println("산 토끼가 굴속에서 잠자고 있습니다.");
	}
}
public class java10ch {
	public static void main(String[] args) {
		House hh= new House();
		Mountain mm= new Mountain();
		hh.sleeping();
		mm.sleeping();
	}
}