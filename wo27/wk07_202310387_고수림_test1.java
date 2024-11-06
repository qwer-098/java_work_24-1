import java.text.DecimalFormat;

abstract class Car{
	String name;
	public abstract void carDisp();
}
class Chh extends Car{
	public void carDisp() {
		DecimalFormat df= new DecimalFormat("#,###");
		super.name="Sonata";
		String str="Hyundai";
		int c=50000000;
		int b=2500;
		System.out.println("자동차 모델: "+name);
		System.out.println("제조사: "+str);
		System.out.println("차량가격: "+df.format(c));
		System.out.println("배기량: "+df.format(b)+"cc");
	}
}

public class wk07_202310387_고수림_test1 {
	public static void main(String[] args) {
		Chh cc=new Chh();
		cc.carDisp();
	}
}
