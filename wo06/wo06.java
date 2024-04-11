import java.util.Scanner;

public class wo06 {
	public static void ex1() {
		for(int i =1; i <=10; i++) {
			System.out.println(i);
		}
	}
	
	public static void test2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("원하는 구구단: ");
		int num=sc.nextInt();
		
		for(int i=1; i <=9; i++) {
			System.out.println(num+"*"+i+"="+num*i);
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		
		sc.close();
	}
	
	public static void challenge1() {
		int odd=0, even=0;
		for(int i=1; i <=100; i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		
		System.out.printf("1-100까지 홀수 합= %d\n"
				+ "1-100까지 짝수 합= %d", odd, even);
	}

	
	public static void test3() {
		System.out.print("원하는 숫자: ");
		Scanner sc=new Scanner(System.in);
		int num;
		int i =1, sum=0;
		num=sc.nextInt();
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.print("1-"+num+"까지 합계 = "+sum);
		
		sc.close();
	}
	
	public static void test4() {
		System.out.print("좋아하는 과일: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String answer="복숭아";
		int count=1;
		
		/**
		while(!name.equals(answer)) {
			System.out.print("좋아하는 과일: ");
			name=sc.nextLine();
			count++;
		}System.out.print(count+"회만에 정답을 맞추셨군요");
		**/
		
// 위 아래 while문 둘 중 하나는 주석처리하고 돌리기!
		
		while(true) {
			System.out.print("좋아하는 과일: ");
			name=sc.nextLine();
			count++;
			if(name.equals(answer)) break;
		}System.out.print(count+"회만에 정답을 맞추셨군요");
		
		sc.close();
	}
	
	public static void challenge2() {
		
		Scanner sc=new Scanner(System.in);
		String words;
		
		while(true) {
			System.out.print("단어 입력: ");
			words=sc.nextLine();
			
			if(words.equals("E")||words.equals("e")) break;
			System.out.println(words+"..."+words.length());
			
		}
		System.out.print("**end**");
		sc.close();
	}
	public static void test5() {
		char ch='a';
		
		do {
			System.out.print(ch);
			ch++;
		}while(ch<='z');
		
		int ch1=65;
		
		do {
			System.out.print((char)ch1);
			ch1++;
		}while(ch1<=90);
	}
	
	public static void test6() {
		
	}
	
	public static void challenge3() {
		Scanner sc=new Scanner(System.in);
		int num, even=0, odd=0;
		
		do {
			System.out.print("숫자 입력: ");
			num=sc.nextInt();
			if(num==0) break;
			if(num%2==0) even++;
			else odd++;
		}while(true);
		
		System.out.println("홀수 개수: "+ odd);
		System.out.println("짝수 개수: "+ even);
		sc.close();
	}
	
	public static void challenge4() {
		
	}


	public static void main(String[] args) {
//		ex1();
//		test2();
//		challenge1();
//		challenge2();
		challenge3();
//		test3();
//		test4();
//		test5();
//		test6();
	}

}
// 20 + 4(코딩) for