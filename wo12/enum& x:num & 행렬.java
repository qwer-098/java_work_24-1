import java.util.Scanner;

enum Flowers {COSMOS, SUMFLOWER, ROSE, TULIP}
public class woex {
	public static void Foreach2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 상수 값을 선택해주세요: ");
		String flower=sc.next();
		
		Flowers f= Flowers.valueOf(flower);
		
		switch(f) {
		case COSMOS:
			System.out.println("코스모스");
			break;
		case SUMFLOWER:
			System.out.println("해바라기");
			break;
		case ROSE:
			System.out.println("장미");
			break;
		case TULIP:
			System.out.println("튜율립");
			break;
		}
		sc.close();
	}
	
	public static void Foreach1() {
		int[] num= {10,20,30,40,50};
		int sum=0;
		for(int k:num) { 
			System.out.println(k);
			sum+=k;
		}
		System.out.print("합= "+sum);
	}
	
	public static void DouArr() {
		double score[][]= { {3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}};
		double sum=0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<2; j++) {
				sum+=score[i][j];
			}
		}
		System.out.print("4학년 전체 평점 평균은 "+sum/8);
	}
		
	public static void DouArr2() {
		int num[][]= {{80,90,70},
				{90,85,80}};
		int sum=0;
		System.out.println("num 배열의 행 길이: "+num.length);
		System.out.println("num 배열의 행 길이: "+num[0].length);
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[0].length; j++) {
				System.out.printf("num[%d][%d] = %d\n",i, j, num[i][j]);
				sum+=num[i][j];
			}
		}
		System.out.printf("num 배열 합계: ", sum);
	}

	public static void main(String[] args) {
//		Foreach1();
//		Foreach2();
//		DouArr();
//		DouArr2();
//		DouArr3();
//		DouArr4();
	}
}
