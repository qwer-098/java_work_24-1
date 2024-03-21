import java.util.Scanner;

public class Wk03_202310387_test2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String name,h;
		float num;
		System.out.print("이름:");
		name=scanner.next();
		System.out.print("학부:");
		h=scanner.next();
		System.out.print("학점:");
		num=scanner.nextFloat();
		
		
		System.out.printf("%s 학우 소속은 %s이며 학점은 %.1f점 입니다.", name, h, num);
		scanner.close();
	}
}

