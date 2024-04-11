import java.util.Scanner;

public class woex {
	public static void test1() {
		Scanner sc= new Scanner(System.in);
		System.out.print("팩토리얼 입력: ");
		int num=sc.nextInt();
		int sum=1;
		for(int i=1; i<=num; i++) {
			sum*=i;
		}
		System.out.printf("%d!=%d", num, sum);
		
		sc.close();
	}
	
	public static void test2() {
		Scanner sc= new Scanner(System.in);
		System.out.print("원하는 구구단: ");
		int num=sc.nextInt();
		for(int i=1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		sc.close();
	}
	
	public static void challenge1() {
		int add=0;
		int ever=0;
		for(int i=1; i<=100; i+=2) {
			add+=i;
		}
		for(int i=0; i<=100; i+=2) {
			ever+=i;
		}System.out.printf("%d %d", add, ever);
		
	}

	public static void test3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 숫자: ");
		int num=sc.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.printf("1-%d까지 합계=%d", num, sum);
		sc.close();
	}
	
	public static void test4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("좋아하는 과일: ");
		String name=sc.nextLine();
		
		int count=1;
		while(!name.equals("복숭아")) {
			System.out.print("좋아하는 과일: ");
			name=sc.next();
			count++;
		}System.out.printf("%d", count);
		
		sc.close();
	} 
	
	public static void test5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 5개: ");
		
		int i =1, sum=0;
		int num=sc.nextInt();
		do {
			if(num>0) sum+=num;
			num=sc.nextInt();
			i++;
		}while(i<=4);
		System.out.printf("%d",sum);
		sc.close();
	}
	
	public static void test6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("** 번호 선택 **\r\n"
				+ "1.알파벳 대문자 출력\r\n"
				+ "2.알파벳 소문자 출력\r\n"
				+ "번호 선택 : ");
		int num=sc.nextInt();
		
		/** toUpperCase()
		 * 	toLowerCase()
		 * **/
		
		if(num==1) {
			char ch = 'A';
			do {
				System.out.print(ch);
				ch = (char) (ch + 1);
			}while(ch<='Z');
		}else {
			char ch = 'a';
			do {
				System.out.print(ch);
				ch = (char) (ch + 1);
			}while(ch<='z');
		}
			
		
		sc.close();
	}
	
	public static void challenge2() {
		
	}

	public static void main(String[] args) {
//		test1();
//		test2();
//		challenge1();
//		test3();
//		test4();
//		test5();
//		test6();
//		challenge2();
	}

}
