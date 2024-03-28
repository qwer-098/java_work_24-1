import java.util.Scanner;

public class wo04 {
	public static void test2_1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num = scanner.nextInt();
		if (num > 100) {
			System.out.println("네, 100보다 큽니다.");
		} else
			System.out.println("네, 100보다 작습니다.");

		scanner.close();
	}

	public static void test2_2() {
//		String name="홍길동";
//		String name1=new String ("홍길동");

		Scanner scanner = new Scanner(System.in);
		System.out.print("과일이름 입력?");
		String name = scanner.nextLine();

		if (name.equals("banana")) {
			System.out.println("맞습니다!");
		} else
			System.out.println("틀립니다!");
		System.out.printf("입력받은 과일은 %s입니다.", name);

		scanner.close();
	}

	public static void challenge1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 입력?");
		String id = scanner.nextLine();
		System.out.print("비밀번호 입력:");
		String pw = scanner.nextLine();

		if (id.equals("hong1234") && pw.equals("apple1234")) {
			System.out.println("Welcome to Hankook University!");
		} else
			System.out.println("입력하신 정보가 올바르지 않습니다!");

		scanner.close();
	}

	public static void test3_1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num = scanner.nextInt();

		if (num > 100) {
			if (num < 1000) {
				System.out.println("100보다 크고 1000보다 작습니다");
			} else {
				System.out.println("1000보다 큽니다.");
			}
		} else {
			System.out.println("100보다 작습니다.");
		}

		scanner.close();
	}

	public static void test3_2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월(month) 입력:");
		int m = scanner.nextInt();

		if (m >= 3 && m <= 5)
			System.out.println("봄");
		else if (m >= 6 && m <= 8)
			System.out.println("여름");
		else if (m >= 9 && m <= 11)
			System.out.println("가을");
		else if (m == 12 || m == 2 || m == 1)
			System.out.println("겨울");
		else
			System.out.println("error");

		scanner.close();
	}

	public static void challenge2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("TV채널번호 입력:");
		int m = scanner.nextInt();

		if (m == 5)
			System.out.println("SBS");
		else if (m == 7)
			System.out.println("KBS2");
		else if (m == 9)
			System.out.println("KBS");
		else if (m == 11)
			System.out.println("MBC");
		else if (m == 19)
			System.out.println("TV조선");
		else
			System.out.println("채널이 없습니다.");

		scanner.close();
	}

	public static void main(String[] args) {
//		test2_1();
//		test2_2();
//		challenge1();

//		test3_1();
//		test3_2();
		challenge2();
	}

}
