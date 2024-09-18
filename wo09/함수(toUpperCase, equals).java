import java.util.Scanner;

public class Wk09_202310387_test1 {
	static String fruits (String name) {
		
		return name.toUpperCase();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("\n과일이름: ");
			String name=sc.next();
			if(name.equals("end")||name.equals("END")) {
				System.out.print("**프로그램 종료**");
				break;
			}
			System.out.printf("%s.....%d",fruits(name), name.length());
		}
		sc.close();
	}
}

