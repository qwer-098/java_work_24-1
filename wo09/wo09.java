import java.util.Scanner;

public class wo09 {
	
	static void gugudan() {
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 구구단:");
		int num=sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		sc.close();
	}
	
	//challenge!
	static void powerNum() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num=sc.nextInt();
		int p=1, sum=0;
		for(int i=1;i<=num;i++) {
			p=i*i;
			System.out.println(i+"의 거듭제곱="+p);
			sum+=p; //sum+=(i*i)
		}System.out.printf("1-%d까지 거듭제곱 합= %d",p,sum);
		sc.close();
	}
	//challenge02
	static void coffeOrder(String menu, int num) {
		int pra=0;
		switch(menu) {
			case"아메리카노":
				pra=4000;
				break;
			case"아이스아메리카노":
				pra=4500;
				break;
			case"카페라떼":
				pra=5000;
				break;
			case"카페모카":
				pra=5500;
				break;
		}
		System.out.printf("%s 커피 대금은 %d원 입니다.", menu,(pra*num));
		
	}
	
	static String score (int k, int e, int m) {
		String str="";
		int sum=(k+e+m);
		double avg=sum/3.0;
		str+="총점"+ sum+ "점.평균은"+String.format("%.2f", avg)+"점이다.";
		
		
		
		return str;
		//return (k+e+m);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 점수: ");
		int kor=sc.nextInt();
		System.out.print("영어 점수: ");
		int eng=sc.nextInt();
		System.out.print("수학 점수: ");
		int mat=sc.nextInt();
		String sum=score(kor, eng, mat);
		double avg=(double)sum/3.0;
		System.out.printf("총점은 %d점,  평균은 %d점 이다.", sum, avg);
		System.out.print(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		gugudan();
//		powerNum();
//		if(false) { //challenge02
//			Scanner sc=new Scanner(System.in);
//		System.out.print("주문 커피 메뉴:");
//		String menu= sc.next();
//		System.out.print("주문 수량:");
//		int num=sc.nextInt();
//		coffeOrder(menu, num);
//		}
	
	}

}
