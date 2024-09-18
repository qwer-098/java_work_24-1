import java.util.Scanner;
// Character.isAlphabetic(pw.charAt(i)) :문자인지 아닌지 bool 구별

public class wo10 {
	static String method1(int a, int b) { // 문자 출력 함수
		int temp=a; a=b; b=temp;
		String res="a="+a+", b="+b;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("? "); int a=sc.nextInt(); int b=sc.nextInt();
		System.out.printf("\nmethod1()에서 교환 후 출력=>%s", method1(a,b));

		
		String pw;
		boolean pass=false;
		
		while(!pass) {
			System.out.print("새로운 비밀번호 입력: ");
			pw=sc.next();
			
			if(pw.length()<8) {
				System.out.println("비밀번호 생성 규칙이 맞지 않습니다!\n");
				continue;
			}else {
				for(int i=0; i<=pw.length()-1; i++) {
					if(!Character.isAlphabetic(pw.charAt(i))) {
						pass=false;
						continue;
					}else pass=true;
				}
				if(!pass) {
					System.out.println("비밀번호 생성 규칙이 맞지 않습니다!\n");
					continue;
				}
			}
			System.out.print("비밀번호가 성공적으로 생성되었습니다.");
			break;
		}
		sc.close();
	}
}
