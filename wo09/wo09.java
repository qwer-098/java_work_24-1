import java.util.Scanner;

public class wo09 {
	
	static void gugudan() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1; i<=9; i++) System.out.println(num+"*"+i+"="+num*i);
		
		sc.close();
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
		int kor=sc.nextInt();
		int eng=sc.nextInt();
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
