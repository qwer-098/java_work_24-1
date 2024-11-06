import java.text.DecimalFormat;

class car{
	String engine="Gasoline 3.5 Tuirbo Engine";
	String model;
	String company;
	public car(String model, String company) {
		this.model=model;
		this.company=model;
	}
}
class ChildCar extends car{
	String c;
	int g, p=50000000;
	public ChildCar(String mm, String cc, String c, int g) {
		super(mm,cc);
		this.c=c;
		this.g=g;
	}
	public void pii() {
		DecimalFormat df=new DecimalFormat("#,###");
		System.out.println("시스템 성능: "+engine);
		System.out.println("자동차 모델: "+model);
		System.out.println("제조 회사: "+company);
		System.out.println("색상: "+c);
		System.out.println("배기량: "+df.format(g));
		System.out.println("가격: "+df.format(p));
	}
}
public class wk06_202310387_고수림_test1 {
	public static void main(String[] args) {
		ChildCar aa= new ChildCar("Genesis", "HYUNDAI", "Black", 3497);
		aa.pii();
	}
}
