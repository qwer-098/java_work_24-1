import java.util.Scanner;

public class wo10 {
	static String method1(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		String res="a="+a+", b="+b;
		
		return res;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		if(false) { //실습 1
			System.out.print("변수 a,b 입력: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.printf("\nmethod1()에서 교환 전 출력=>a=%d, b=%d", a,b);
		
		System.out.printf("\nmethod1()에서 교환 후 출력=>%s", method1(a,b));
		}
		
		sc.close();
	}

}
