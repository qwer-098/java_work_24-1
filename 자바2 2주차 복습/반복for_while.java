import java.util.Scanner;

public class 반복for_while {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	int n1, cnt=0;
    	System.out.print("숫자? ");
		n1=sc.nextInt();
		for(int i=0; i<=n1; i++) {
			if(i%2!=0) {
				continue;
			}
			cnt+=i;
			System.out.print(i+" ");
		}
		System.out.print("\n"
				+ "1~"+n1+"까지 짝수 합= "+cnt);
    	
		int n2, n3;
    	String a;
    	while(true) {
    		System.out.print("퀴즈를 시작하시겠습니까?");
    		a=sc.next();
    		if(a.equals("y")) {
    			System.out.print("정수 1입력?");
    			n1=sc.nextInt();
    			System.out.print("정수 2입력?");
    			n2=sc.nextInt();
    			System.out.print(n1+"와 "+n2+"의 정답 입력은?");
    			n3=sc.nextInt();
    			if(n3==n1+n2) {
    				System.out.println("정답, 보너스 1점 획득");
    				cnt++;
    			}
    			else System.out.println("오답");

    		}else {
    			System.out.println("당신은 보너스 "+cnt+"점을 획득했습니다.\n퀴즈 종료!");
    			break;
    		}
    	}
    	
    	System.out.print("시작 구구단? ");
		n1=sc.nextInt();
		System.out.print("끝나는 구구단? ");
		n2=sc.nextInt();
		for(int j=1; j<=9; j++) {
			for(int i=n1; i<=n2; i++) {

				System.out.print(i+"*"+j+"="+String.format("%2d", i*j)+"    ");
			}System.out.println();
		}
    		
    	sc.close();
    	
    	
    	
    }

}