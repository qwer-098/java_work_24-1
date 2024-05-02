import java.util.Scanner;

public class cha03 {
	static int factorial(int num) {
		int fact=1;
		for(int i=1; i<=5; i++) {
			fact*=i;
		}return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("팩토리얼 값 입력: ");
		int num=sc.nextInt();
		int fact= factorial(num);
		System.out.printf("%d!=%d",num, fact);
		sc.close();
	}
}
