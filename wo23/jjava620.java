class Gran{
	public void ggran() {
		System.out.println("할아버지");
	}
}
class Par extends Gran{
	String job,addr;
	public Par(String job, String addr) {
		this.job=job;
		this.addr=addr;
	}
	public void ggran() {
		System.out.println("아버지, 할아버지 상속");
		super.ggran();
	}
}
class Cha extends Par{
	public Cha() {
		super("교사", "춘천");
	}
	public void ggran() {
		System.out.println("아들, 아버지 상속");
		System.out.println("아버지는 "+super.job+" 아버지는 "+super.addr);
		super.ggran();
	}
}


public class jjava620 {

	public static void main(String[] args) {
		Cha cc=new Cha();
		cc.ggran();
	}
}
