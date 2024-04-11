import java.util.Scanner;

public class Wk06_202310387_test1 {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 숫자");
		int num=sc.nextInt();
		
		for(int i=2; i <num; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
			
		}
		if(flag==false)System.out.print(num+"은 소수가 아닙니다.");
		else System.out.print(num+"은 소수입니다.");
		sc.close();
	}
}
