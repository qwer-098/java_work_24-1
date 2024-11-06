class Programming {
	String prg="자바프로그래밍";
	public void prgDisp() {
		System.out.println("교재명: "+prg);
	}
}
class Child extends Programming{
	String publisher;
	String author;
	int price;
	
	public Child(String pu, String au, int pr) { // 생성자
		publisher=pu;
		author=au;
		price=pr;
	}
	
	public void prgDisp() {
		super.prgDisp(); // 부모클래스 메소드 call
		System.out.println("출판사: "+publisher);
	}
}

public class java532 {
	public static void main(String[] args) {
		Programming pr=new Child("한국출판사", "홍길동", 35000);
		pr.prgDisp();
	}				
}