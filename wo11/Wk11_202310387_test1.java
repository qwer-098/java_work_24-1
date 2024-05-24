import java.util.Scanner;

public class Wk11_202310387_test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] score=new int[5];
		int sum=0;
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d]=",i);
			score[i]=sc.nextInt();
			sum+=score[i];
		}
		System.out.printf("총점=%d\n평균=%.2f", sum, (float) sum/5);
		sc.close();
	}
}

