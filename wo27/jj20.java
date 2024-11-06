interface Fly{
	public void fly();
}
interface Walk{
	public void walk();
}
interface Walk2{
	public void walk();
}
class Chiken implements Fly,Walk, Walk2{
	public void fly() {
		System.out.println("닭은 날 수 ");
		System.out.println("닭은 두 발로");
	}
	public void walk() {
		System.out.println("새는 날 수");		
	}
	public void walk2() {
		System.out.println("새는 날 수");		
	}
}
public class jj20 {
	public static void main(String[] args) {
		Chiken cc=new Chiken();
		cc.fly();
		cc.walk();
	}
}
