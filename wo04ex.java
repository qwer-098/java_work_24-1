import java.util.Scanner;

public class wo04 {

	public static void test1_1() {
		int x = 10, y = 20, z = 3;
		System.out.println("가장 큰 수:" + ((x > y ? x : y) > z ? y : z));
	}

	public static void test1_2() {
		short num1 = 0b00001101;
		short num2 = 0b00000100;

		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
	}

	public static void test1_3() {
		short num1 = (6 << 2);
		short num2 = (13 >> 2);
		System.out.println(num1 + "," + num2);
	}

	public static void test2_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 수?");
		int even = sc.nextInt();

		if ((even % 2) == 0)
			System.out.print("짝수입니다.");

		sc.close();
	}

	public static void test2_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 수?");
		int pos = sc.nextInt();

//		if(pos>0) 
//			System.out.print((pos<100)?"입력한 수 "+pos+"는 100보다 작습니다.":"입력한 수 "+pos+"는 100보다 큽니다.");
//		
		if (pos > 0)
			if (pos < 100)
				System.out.print("입력한 수 " + pos + "는 100보다 작습니다.");
//			else System.out.print("입력한 수 "+pos+"는 100보다 큽니다.");
//		else System.out.print(pos+"는 음수");

		sc.close();
	}

	public static void test2_3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과일이름 입력?");
		String name = sc.nextLine();

		if (name.equals("banana"))
			System.out.println("맞습니다.");
		else
			System.out.println("틀립니다.");
		System.out.printf("입력받은 과일은 %s 입니다.", name);

		sc.close();

		/***********************************
		 * 대소문자도 구분하여 비교 대소문자를 구분하지 않고 알파벳이 같은지만 보려면 equalsIgnoreCase()를 사용해야 합니다.
		 ************************************/
	}

	public static void test3_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력? ");
		int n = sc.nextInt();

		if (n > 100) {
			if (n < 1000) {
				System.out.print("100보다 크고 1000보다 작습니다.");
			} else
				System.out.print("1000보다 큽니다.");
		} else
			System.out.print("100보다 작습니다.");

		sc.close();
	}

	public static void test3_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월(month) 입력?");
		int m = sc.nextInt();
		String s = null;
//		if (m > 2 && m < 12) {
//			if (m < 6) {
//				System.out.printf("%d월은 봄(spring)입니다.", m);
//			} else if (m < 9) {
//				System.out.printf("%d월은 여름(summer)입니다.", m);
//			} else {
//				System.out.printf("%d월은 가을(autumn)입니다.", m);
//			}
//		} else if (m > 0 && m < 13) {
//			System.out.printf("%d월은 겨울(winter)입니다.", m);
//		} else {
//			System.out.print("월 입력이 잘못되었습니다.");
//		}
		if (m >= 3 && m <= 5) {
			s = "봄";
			System.out.printf("%d월은 봄(spring)입니다.", m);
		} else if (m >= 6 && m <= 8) {
			s = "여름";
			System.out.printf("%d월은 여름(summer)입니다.", m);
		} else if (m >= 9 && m <= 11)
			System.out.printf("%d월은 가을(autumn)입니다.", m);
		else if (m >= 1 && m <= 12)
			System.out.printf("%d월은 겨울(winter)입니다.", m);
		else
			System.out.print("월 입력이 잘못되었습니다.");
		System.out.printf("\n%d월은 %s입니다.", m, s);
		sc.close();

	}

	public static void main(String[] args) {
//		test1_1();
//		test1_2();
//		test1_3();
//		test2_1();
//		test2_2();
//		test2_3();
//		test3_1();
		test3_2();
	}

}
