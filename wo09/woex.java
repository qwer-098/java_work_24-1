import java.util.Scanner;

public class woex {
	
	static void gugudan() {
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 구구단: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=9; i++ )System.out.println(n+"*"+i+"="+n*i);
		
		sc.close();
	}

	static void personInfo(String a,int b,float c) {
		System.out.print(a+"님은, 나이 "+b+"세로, 입사성적 "+c+"점으로 입사");
	}
	
	static void calc(String a, int b, int c) {
		int re;
		switch(a){
			case "+":
				re=b+c;
			case "-":
				re=b-c;
		}
	}

	public static void main(String[] args) {
//		gugudan();
		Scanner sc=new Scanner(System.in);
		
		if(false) {
		System.out.print("이름: ");
		String name=sc.next();
		System.out.print("나이: ");
		int age=sc.nextInt();
		System.out.print("입사성적: ");
		float gra=sc.nextFloat();
		personInfo(name, age, gra);
		}
		
		System.out.print("계산 부호 입력: ");
		String a=sc.next();
		System.out.print("첫 번쨰 숫자 입력: ");
		int n1=sc.nextInt();
		System.out.print("두 번쨰 숫자 입력: ");
		int n2=sc.nextInt();
		calc(a,n1,n2);
	}

}
