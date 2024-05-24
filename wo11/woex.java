import java.util.Scanner;

public class woex {
	public static void test1() {
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[5];
		int hab=0;
		for(int i=0; i<5; i++) {
			System.out.print("숫자 입력: ");
			arr[i]=sc.nextInt();
			hab+=arr[i];
		}
		for(int i=0; i<5; i++) {
			System.out.printf("numAry[%d] = %d\n", i, arr[i]);
		}System.out.print("배열의 합 = "+hab);
		sc.close();
	}
	
	public static void challenge1() {
		Scanner sc= new Scanner(System.in);
		char[] ch=new char[5];
		
		System.out.print("문자열 입력: ");
		String st=sc.next();
		for(int i=0; i<5;i++) {
			ch[i]=st.charAt(i);
			System.out.printf("%d번째 문자 %c\n",i,ch[i]);
		}
		sc.close();
		
	}
	
	public static void test2() {
		String fruits[]= {"apple", "durian", "kiwi", "persimmon", "strawberry"};
		
		for(int i=0; i<fruits.length;i++) {
			System.out.printf("%s", fruits[i]);
		}
	}

	public static void test3() {
		
	}
	
	public static void challenge2() {
		
	}

	public static void main(String[] args) {
		test1();
//		challenge1();
//		test2();
//		test3();
//		challenge2();
	}

}
