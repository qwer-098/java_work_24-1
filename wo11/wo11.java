import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class wo11 {
	public static void numArr01() {
		Scanner sc= new Scanner(System.in);
		int num1, num2, num3, num4;
		int sum=0;
		
		System.out.print("숫자 데이터 1 입력: ");
		num1=sc.nextInt();
		System.out.print("숫자 데이터 2 입력: ");
		num2=sc.nextInt();
		System.out.print("숫자 데이터 3 입력: ");
		num3=sc.nextInt();
		System.out.print("숫자 데이터 4 입력: ");
		num4=sc.nextInt();
		
		sum=num1+num2+num3+num4;
		System.out.print("합: "+ sum);
		sc.close();
		
	} 
	
	public static void numArr02() {
		Scanner sc= new Scanner(System.in);
		int[] num=new int[4];
		// int num[] = new int[4];
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
	
	public static void challenge1() { // 사진 참고
		Scanner sc= new Scanner(System.in);
		char[] ch=new char[5];
		String st=sc.next();
		
		System.out.print("문자열 입력: ");

		for(int i=0; i<5;i++) {
			ch[i]=st.charAt(i);
			System.out.printf("%d번째 문자 %c\n",i,ch[i]);
		}
		sc.close();
		
	}
	
	public static void sis() {
		String fruits[]= {"apple", "durian", "kiwi", "persimmon", "strawberry"};
		
		for(int i=0; i<fruits.length; i++) {
			System.out.printf("%-20s  %2d\n", fruits[i], fruits[i].length()); 
		} // - 왼쪽 정렬 
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
	
	public static void test3() {
		Scanner sc=new Scanner(System.in);
		int[] grade= {95,73,85,100,88};
		
		Arrays.sort(grade);
		for(int i=0; i<grade.length; i++)
		System.out.print(grade[i]+ " ");
		
		// 배열에 대한 리스트 자료형 출력 : Arrays.toString(배열명)
		System.out.print(Arrays.toString(grade));
		
		
		Integer [] grade1= {95,73,85,100,88};
		Arrays.sort(grade1, Collections.reverseOrder());
		sc.close();
	} // import java.util.*;
	
	
	public static void si(){
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		Character[] ch=new Character[st.length()];
		
		for(int i=0; i<st.length(); i++) {
			ch[i]=st.charAt(i);
		}
		Arrays.sort(ch);
		System.out.println("오름차순: "+Arrays.toString(ch));
		
		Arrays.sort(ch, Collections.reverseOrder());
		System.out.print("내림차순: "+Arrays.toString(ch));
		
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void challenge3() { 
		Scanner sc=new Scanner(System.in);
		String[] arr= {"페리카나", "굽네", "교촌치킨", "노랑통닭", "네네치킨"};
		
		System.out.println("정렬 전: "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("오름차순: "+Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.print("내림차순: "+Arrays.toString(arr));
		
		sc.close();
	}

	public static void main(String[] args) {
//		numArr02();     	
//		test2();
//		test3();
//		si();
//		challenge2();
		challenge3();
	}
}
