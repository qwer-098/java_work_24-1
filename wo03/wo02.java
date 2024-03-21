
public class wo02 {

	public static void test1() {
		System.out.println("자바프로그래밍과 Eclipse");
		System.out.printf("C언어와 Visual Studio Code");
	}

	public static void test2() {
		System.out.printf("%d / %d = %.2f\n", 3275, 30, 109.17);

		System.out.printf("%d / %d = %.2f\n", 3275, 30, (double) 3275 / 30);
		System.out.printf("%d / %d = %.2f\n", 3275, 30, (float) 3275 / 30);

	}
	
	public static void test3() {
	int num1=100,num2=50;
		
		//System.out.printf("%d+%d=%d\n", num1,num2, num1+num2);
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		
		String str1 ="qwer";// ""
		char str2 ='q'; 	// ''  
		System.out.print(str1+str2);
	}
	public static void test4() {
		String aa="아메리카노";
		int unit=4500,b=3, c=unit*b,d=c/100*7,f=c+d;
		
		System.out.printf("품명 : %s\n", aa);
		System.out.printf("단가 : %d\n",unit);
		System.out.printf("주문 수량 : %d\n",b);
		System.out.printf("커피 대금 : %d\n",c);
		System.out.printf("세금 : %d\n",d);
		System.out.printf("결제 금액 : %d",f);
	}
	public static void Challenge_01() {
		System.out.printf("%d + %d = %d", 300, 500, 300+500);
	}
	public static void Challenge_02() {
		String name="Java Programming", day="금요일";
		char goal='A';
		System.out.printf("과목명: %s\n수업 요일: %s\n학점 목표: %c\n", name, day, goal);
	}
	public static void main(String[] args) {

	}
}
