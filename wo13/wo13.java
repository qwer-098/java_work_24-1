class Profile{
	int hakbun;
	int age;
	String name;
	public void disp(){
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}
class OTT{
	String title, actor, original;
}
class Apple{
	String name, col, made;
	int pri;
}
class Grade{
	String studentName;
	int kor;
	int eng;
	int math;
	public Grade() {};//생성자
	public void mark() {
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		System.out.println("마동석 성적");
		System.out.println("국어: "+kor+"점");
		System.out.println("영어: "+eng+"점");
		System.out.println("수학: "+math+"점");
		System.out.println("총점: "+sum);
		System.out.printf("평균: %.2f", avg);
	}
}

public class wo13 {
	public static void challenge2() {
		Grade g=new Grade();
		g.kor=80;
		g.eng=95;
		g.math=70;
		
		g.mark();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void test1() {
		Profile a=new Profile();
		a.hakbun=20241234;
		a.name="홍길동";
		a.age=20;
		
		a.disp();
	}


	public static void test2() {
		OTT a=new OTT();
		OTT b=new OTT();
		OTT c=new OTT();
		
		a.title="오징어게임";
		a.actor="이정재";
		a.original="넷플릭스";
		
		b.title="파친코";
		b.actor="이민호";
		b.original="애플TV";

		c.title="무빙";
		c.actor="한효주";
		c.original="디지니플러스";
		
		System.out.println(a.title+"의 "+a.actor+" "+a.original);
		System.out.println(b.title+"의 "+b.actor+" "+b.original);
		System.out.println(c.title+"의 "+c.actor+" "+c.original);
	}
	
	
	
	public static void challenge1() {
		Apple a=new Apple();
		
		a.name="Apple 맥북프로 15";
		a.col="스페이스 그레이";
		a.pri=3500000;
		a.made="Apple";
		System.out.println("제품명: "+a.name);
		System.out.println("색상: "+a.col);
		System.out.println("가격: "+a.pri);
		System.out.println("제조사: "+a.made);
	}
	
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
//		challenge1();
		challenge2();
	}

}
