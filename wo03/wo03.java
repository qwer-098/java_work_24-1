import java.util.Scanner;

public class wo03 {

	public static void ex1() {
		final double PI = 3.14; //상수
	}

	public static void test1() {
		int java = 3, mobile = 2, excel = 1;
		double j = 3.5, m = 4.0, e = 4.5;
		double result = ((java * j) + (mobile * m) + (excel * e)) / 6;
		System.out.printf("%.1f", result);
	}

	public static void challenge1() {
		String name = new String("홍길동");
		String hobby = "게임개발", number = "010-1234-5678";
		char blo = 'O';
		int age = 23;

		System.out.printf("이름:%s\n취미:%s\n연락처:%s\n나이:%d\n혈액형:%c", name, hobby, number, age, blo);
	}

	public static void Scanner() {
		Scanner scanner = new Scanner(System.in);
		// String name=sc.next();
		String addr, name;

		System.out.print("이름을 입력하세요:");
		name = scanner.nextLine();

		System.out.print("주소를 입력하세요.");
		addr = scanner.nextLine();

		System.out.println("이름:" + name);
		System.out.println("주소:" + addr);

		scanner.close();

	}

	public static void Test2() {
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		int cost = sc.nextInt();
		int count = sc.nextInt();
		int price = cost * count;
		int tax = price / 10;
		System.out.printf("%d", name);
		System.out.printf("주문한 초코파이는 %d원으로 세금 포함 %d원입니다.", price, (price + tax));
	}

	public static void challenge2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력1:");
		int i1 = sc.nextInt();
		System.out.print("정수 입력2:");
		int i2 = sc.nextInt();
		int sum = i1 + i2;

		System.out.printf("%d + %d = %d", i1, i2, sum);
		
		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		int sum = 0;
//		System.out.print("정수 입력1:");
//		num1 = sc.nextInt();
//		System.out.print("정수 입력2:");
//		num2 = sc.nextInt();
//		sum = num1 + num2;
//		System.out.printf("%d+%d=%d", num1, num2, sum);
//		System.out.println(num1 + "+" + num2 + "+" + sum);
//		sc.close();
	}

	public static void main(String[] args) {
		// ex1();
		// test1();
		// ex2();
		// Scanner();
		//Test2();
		// challenge1();
//		challenge2();
		
//		Scanner sc=new Scanner(System.in);
//		int num1, num2;
//		int sum=0;
//		System.out.print("정수 입력1:");
//		num1=sc.nextInt();
//		System.out.print("정수 입력2:");
//		num2=sc.nextInt();
//		sum=num1+num2;
//		System.out.printf("%d+%d=%d", num1, num2,sum);
//		System.out.println(num1+"+"+num2+"+"+sum);
//		sc.close();
		
		
		Scanner scanner=new Scanner(System.in);
		int n1, n2, n3, n4;
		boolean result;
		
		System.out.print("숫자1:");
		n1=scanner.nextInt();
		System.out.print("숫자2:");
		n2=scanner.nextInt();
		System.out.print("숫자3:");
		n3=scanner.nextInt();
		System.out.print("숫자4:");
		n4=scanner.nextInt();
//		System.out.printf("(%d+%d)>(%d+%d)=",n1,n2,n3,n4);
		result=(n1+n2)>(n3+n4);
		System.out.print("(n1+n2)>(n3+n4)="+result);
		
		scanner.close();
	}

}
