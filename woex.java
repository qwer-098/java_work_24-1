import java.util.Scanner;

public class woex {
	public static void ex1() {
//		str.length(); //문자열 길이
//		str.charAt(); //index입력, char로 한 글자만 받음
//		str.substirng(,); //시작, 종료 인덱스
		String str = "한국대학교";

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
	}

	public static void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과일이름?");
		char ch = sc.next().charAt(0); //char로 입력받는 법

		switch (ch) {
		case 'a':
			System.out.println("apple");
			break;
		case 'b':
			System.out.println("banana");
			break;
		case 'c':
			System.out.println("cherry");
			break;
		case 'd':
			System.out.println("durian");
			break;
		default:
			System.out.println("apple");

		}
		sc.close();
	}

	public static void ex2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("무슨 커피 드릴까요?");
		String menu=sc.next();
		int price=0;
		switch(menu) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price=3500;
			break;
		case "아메리카노":
		price=2000;
		break;
		default:
			System.out.println("메뉴에 없습니다");
		}
		if(price !=0) {
			System.out.print(menu+"는"+price+"원입니다.");
		}
		sc.close();
	}
	
	public static void test2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("특정 월 입력: ");
		int mon=sc.nextInt();
		int day=0;
		switch(mon) {
		case 1,3,5,7,8,10,12:
			day=31;
			break;

		case 4,6,9,11:
			day=30;
			break;
		case 2:
			day=28;
		}
		System.out.printf("입력하신 %d월은 %d일입니다.", mon,day);
		sc.close();
	}

	public static void test3() {
		System.out.print("등급입력: ");
		Scanner sc=new Scanner(System.in);
		char rank=sc.next().charAt(0);
		String pea=null; //String도 변수로 사용하고 싶을 때
		switch(rank) {
		case 'P','p':
			pea="프리미어 등급";
			break;
		case 'A','a':
			pea="에이스 등급";
			break;
		
		case 'C','c', 'D','d':
			pea="새싹 등급";
			break;
		
		default:
			pea="손님";
		}
		System.out.printf("%s입니다.", pea);
		sc.close();
	}
	
	public static void test4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("요일 입력: ");
		String day=sc.next();
		int text=day.length();
		System.out.printf("입력하신 요일 %s는 %d글자 이다.", day,text);
		
		System.out.print("입력하신 요일 "+day+"는 "+day.length()+"글자 이다.");
		
		
		sc.close();
	}	
		
	public static void test5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("영어 알파벳을 입력하시오: ");
		String ar=sc.next();
		
		switch(ar) {
		case "a", "e","i", "o","u":
			System.out.print("모음");
			break;
		default:System.out.print("자음");
		}
		
		/*
		 * equalsIgnoreCase():대소문자 상관없이 같으면 true 리턴
		 * 
		 * compareTolgnoreCase(): - 상관없이 같으면 0, 아니면 음/양수 반환
		 * 
		 * toUppsetCase(): 다 대문자로 변환 후
		 * toLowerCase():다 소문자로 변환 후 비교
		 */
		sc.close();
	}

	public static void main(String[] args) {
//		test1();
//		challenge1();
//		test2();
//		test3();
//		test4();
//		challenge2();
	}

}
