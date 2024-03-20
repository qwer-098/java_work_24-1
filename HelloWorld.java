import java.util.Scanner;

public class HelloWorld {

	public static void ex1() {
		final double PI = 3.14;
		double radius = 10.0;
		double circleArea = radius * radius * PI;

		System.out.println("원의 면적 = " + circleArea);
	}

	public static void test1() {
		double j = 3.5 * 3, m = 4 * 2, e = 4.5;
		double sum = j + m + e;
		double result = sum / 6;

		System.out.printf("평균 학점 : %.1f", result);
	}
	public static void Scanner() {
		Scanner scanner = new Scanner(System.in);
		String addr, name;

		System.out.print("이름을 입력하세요:");
		name = scanner.nextLine();

		System.out.print("주소를 입력하세요.");
		addr = scanner.nextLine();

		System.out.println("이름:" + name);
		System.out.println("주소:" + addr);

		scanner.close();
		// Scanner sc= new Scanner(System.in);
		// String name=sc.next();
	}

	public static void Test2() {
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		int cost = sc.nextInt();
		int count = sc.nextInt();
		int price=cost*count;
		int tax=price/10;
		
		System.out.printf("주문한 초코파이는 %d원으로 세금 포함 %d원입니다.", price, (price+tax));
	}

	public static void main(String[] args) {
		// ex1();
		// test1();
		// ex2();
		// Scanner();
		//Test2();
	}

}
