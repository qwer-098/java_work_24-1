import java.util.Scanner;


public class 잡동사니 {
	public static void a1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("?");
		int n1=sc.nextInt();
		int sum=0;
		String s=sc.next();
		
		switch(s) {
		case "+":
			break;
			
		}
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		while(n1<=sum) {
			sum+=n1;
		}
		if(s.equals(s)) sum=n1;
//		do {
//			System.out.print("o");
//		}while(true);
		boolean flag=true;
		int num=2;
		for(int i=2; i <num; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
			
		}
		if(flag==false)System.out.print(num+"은 소수가 아닙니다.");
		
		
		sc.close();
	}
	
	
//static String fruits (String name) {
//		
//		return name.toUpperCase();
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("\n과일이름: ");
//			String name=sc.next();
//			if(name.equals("end")||name.equals("END")) {
//				System.out.print("**프로그램 종료**");
//				break;
//			}
//			System.out.printf("%s.....%d",fruits(name), name.length());
//		}
//		sc.close();
//	}
	public static void a2() {
		
	}
	
    public static void main(String[] args) {
    	a1();
    	
    }

}