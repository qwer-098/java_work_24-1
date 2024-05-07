import java.util.Scanner;

public class Wk10_202310387_test1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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

