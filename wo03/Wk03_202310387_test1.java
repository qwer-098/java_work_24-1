import java.util.Scanner;

public class Wk03_202310387_test1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int k,e,m;
		System.out.print("국어점수:");
		k=scanner.nextInt();
		System.out.print("영어점수:");
		e=scanner.nextInt();
		System.out.print("수학점수:");
		m=scanner.nextInt();
		System.out.printf("총점:%d\n", (k+e+m));
		System.out.printf("평균:%.2f",((double)(k+e+m))/3);
		
		
		scanner.close();
	}
}

