import java.util.Scanner;

public class java512 {
	public static String test1(int n1, int n2, int n3) {
		int sum=n1+n2+n3;
		double avg=(float)sum/3;
		String rslt="총점은 "+sum+"점, 평균은 "+String.format("%.2f", avg)+"점 입니다.";
		
		return rslt;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("점수:");
		n1=sc.nextInt();
		System.out.print("점수:");
		n2=sc.nextInt();
		System.out.print("점수:");
		n3=sc.nextInt();
		
		String rslt=java512.test1(n1, n2, n3);
		System.out.print(rslt);
		
		sc.close();
		}				
}