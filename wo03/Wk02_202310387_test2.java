
public class Wk02_202310387_test2 {

	public static void main(String[] args) {
		int a = 90, b = 80, c = 100;
		int sum = a + b + c;
		double avg = (double)sum / 3;

		System.out.println("국어=" + a);
		System.out.println("영어=" + b);
		System.out.println("수학=" + c);
		System.out.println("총점=" + sum);
		System.out.printf("평균=%.2f", avg);
	}
}

