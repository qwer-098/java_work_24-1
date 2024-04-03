import java.util.Scanner;

public class Wk05_202310387_test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수식을 입력 하시오?");
		int n1 = sc.nextInt();
		String s = sc.next();
		int n2 = sc.nextInt();

		switch (s) {
		case "+":
			System.out.printf("%d %s %d = %d", n1, s, n2, n1 + n2);
			break;
		case "-":
			System.out.printf("%d %s %d = %d", n1, s, n2, n1 - n2);
			break;
		case "*":
			System.out.printf("%d %s %d = %d", n1, s, n2, n1 * n2);
			break;
		case "/":
			System.out.printf("%d %s %d = %d ... %d", n1, s, n2, n1 / n2, n1 % n2);
		}
		sc.close();
	}
}
