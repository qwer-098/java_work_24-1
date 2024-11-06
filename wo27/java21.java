interface Flly{
	public void fly();
}
interface Wallk{
	public void walk();
}
class Chiiken implements Flly, Wallk{
	public void fly() {
		System.out.println("닭은 날 수 있습니다.");
		walk();
	}
	public void walk() {
		System.out.println("닭은 두 발로 걷습니다.");
	}
}
class Bbi implements Flly{
	public void fly() {
		System.out.println("새는 날 수 있습니다.");
	}
}
public class java21 {
	public static void main(String[] args) {
		Chiiken cc=new Chiiken();
		Bbi bb=new Bbi();
		cc.fly();
		bb.fly();
	}
}
