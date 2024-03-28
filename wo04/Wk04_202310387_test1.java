import java.util.Scanner;

public class Wk04_202310387_test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("성별(남/여):");
		String gender = scanner.nextLine();
		System.out.print("나이:");
		int age = scanner.nextInt();

		if (gender.equals("남자")) {
			if (age >= 8 && age <= 13) {
				System.out.print("초등학교 남학생");
			} else if (age >= 14 && age <= 16) {
				System.out.print("중학교 남학생");
			} else if (age >= 17 && age <= 19) {
				System.out.print("고등학교 남학생");
			} else
				System.out.print("학생신분x");
		} else {
			if (age >= 8 && age <= 13) {
				System.out.print("초등학교 여학생");
			} else if (age >= 14 && age <= 16) {
				System.out.print("중학교 여학생");
			} else if (age >= 17 && age <= 19) {
				System.out.print("고등학교 여학생");
			} else
				System.out.print("학생신분x");
		}
		scanner.close();
	}
}
