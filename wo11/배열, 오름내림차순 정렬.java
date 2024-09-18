import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//import java.util.*;

public class wo11 {
	public static void numArr02() {
		Scanner sc= new Scanner(System.in);
		int[] num=new int[4];
		// int num[] = new int[4];
		char[] ch=new char[5];
		
		int sum=0;
		for(int i=0;i<4;i++) {
			System.out.print("숫자 입력: ");
			num[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			sum+=num[i];
		}
		
		System.out.println("합계: "+sum);
		
		sc.close();
	}
	
	public static void challenge2() {

		Scanner sc= new Scanner(System.in);
		String[] st=new String[5];
		for(int i=0; i<5; i++) {
			System.out.print("문자열 입력: ");
			st[i]=sc.nextLine();
		}
		for(int i=0; i<5; i++) {
			System.out.printf("%d번째 문자열 : %s\n", i, st[i]);
		}
		
		sc.close();
	}
	 
	public static void si(){  // 오름차순 내림차순 정렬
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		Character[] ch=new Character[st.length()];
		String[] arr= {"페리카나", "굽네", "교촌치킨", "노랑통닭", "네네치킨"};
		int[] grade= {95,73,85,100,88};
		
		for(int i=0; i<st.length(); i++) {
			ch[i]=st.charAt(i);
		}
		Arrays.sort(ch);
		// 배열에 대한 리스트 자료형 출력 : Arrays.toString(배열명)
		System.out.println("오름차순: "+Arrays.toString(ch));
		
		Arrays.sort(ch, Collections.reverseOrder());
		System.out.print("내림차순: "+Arrays.toString(ch));
		
		Integer [] grade1= {95,73,85,100,88};
		Arrays.sort(grade1, Collections.reverseOrder());
		
		sc.close();
	}

	public static void main(String[] args) {
//		numArr02();     	
//		test2();
//		test3();
//		si();
//		challenge2();
	}
}
