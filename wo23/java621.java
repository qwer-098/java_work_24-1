class Par{
	String mc="강";
	String crew;
	public void ppar() {
		System.out.println("mc: "+mc);
	}
}
class Cha extends Par{
	String judg, dnac;
	public Cha(String judg, String dnac) {
		this.judg=judg;
		this.dnac=dnac;
	}
	public void ppar() {
		crew="훅";
		super.ppar();
		System.out.println("심사위원: "+this.judg);
		System.out.println("crew: "+crew);
		System.out.println("심사위원: "+this.dnac);
	}
}
class Cha2 extends Par{
	String judg, dnac;
	public Cha2(String judg, String dnac) {
		this.judg=judg;
		this.dnac=dnac;
	}
	public void ppar() {
		crew="원밀리언";
		super.ppar();
		System.out.println("심사위원: "+this.judg);
		System.out.println("crew: "+crew);
		System.out.println("심사위원: "+this.dnac);
	}
}
public class java621 {

	public static void main(String[] args) {
		Cha c=new Cha("보아", "아이키");
		Cha2 cc=new Cha2("모니카", "리아킴");
		c.ppar();
		cc.ppar();
		
	}
}
