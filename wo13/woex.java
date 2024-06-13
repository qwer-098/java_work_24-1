import java.text.DecimalFormat;

class Area{
	int width;
	int height;
}

class Staff {
	String employeeName;
	int hourlyRate; // 시급
	int workHour;	// 근무시간
	
	public int salary(){

		hourlyRate=9850;
		workHour=27;
		return hourlyRate*workHour;
	}
	
	public void disp2() {
		DecimalFormat df=new DecimalFormat("#,###");
		int pay=hourlyRate*workHour;
		System.out.println(employeeName+df.format(pay));
	}
}

public class woex {
	public static void test1() {
		Profile a=new Profile(); // 객체 생성 //class 객체 맴버변수 일반변수
		
		a.name="홍";
		
	}
	public static void test2() {
		Area a=new Area();
		
		a.width=4;
		a.height=5;
		System.out.print("사각형의 넓이: "+ a.width*a.height);
	}
	public static void test3() {
		Staff s=new Staff();
		s.employeeName="신윤복";
		
		int pay=s.salary();
		System.out.print(" ");
				
		
	}
	public static void challenge1() {
		
	}

	
	public static void challenge2() {
		
	}

	public static void main(String[] args) {
//		test1();
//		challenge1();
		test2();
//		challenge2();
	}

}
