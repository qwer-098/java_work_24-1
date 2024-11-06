import java.util.Scanner;

/** 메소드 오버로딩: 이름이 같은 메소드 작성
 *   매개변수의 유형과 개수가 서로 다름
 *   리턴 타입만 다르면 그건 동일 메소드
 *  
 * 
 */

class test{
	int n1, n2, n3;
	
	public void test1(int n1, int n2) {
		int sum;
		double avg;
		this.n1=n1;
		this.n2=n2;
		sum=this.n1+this.n2;
		avg=sum/2.0;
		System.out.println("총점: "+sum);
		System.out.printf("%.2f", avg);
	}
	public void test1(int n1, int n2, int n3) {
		int sum;
		double avg;
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		sum=this.n1+this.n2+this.n3;
		avg=sum/3.0;
		System.out.println("총점: "+sum);
		System.out.printf("%.2f", avg);
	}
}

public class java521 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		test te=new test();
		int n1, n2, n3;
		
		System.out.print("점수:");
		n1=sc.nextInt();
		System.out.print("점수:");
		n2=sc.nextInt();
		System.out.print("점수:");
		n3=sc.nextInt();
		
		te.test1(n1, n2);
		te.test1(n1, n2, n3);
		
		
		sc.close();
		
		}				
}