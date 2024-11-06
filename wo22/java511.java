/**
 * static 변수
 * 	class에서 static 붙은 변수
 * 	class가 메모리에 로드 될때, static 메로리 영역에 생성됨
 * 	얘는 모든 인스턴스가 하나의 저장공간을 공유(굉장히 특별한가바
 *  클래스당 하나만 생성, class 멤버라고도 함
 * 메소드: 클래스 내의 객체의 동적인 특징, 행위를 정의한 부분
 * static 메소드
 * 	객체 생성 없이 호출 가능
 *  클래스 이름을 통해서 접근 가능
 *  메소드 내에서는 ststic 변수가 아닌 객체 변수는 접근x
 *  
 * static 변수, 메소드
 *  주로 클래스들이 할당
 *  garbage Collector 관여x
 *  모든 객체가 메모리를 공유
 *  
 */

public class java511 {
	static String title;
	static int price;
	
	public static void menu() {
		System.out.println(title+price);
	}
	
	public static void main(String[] args) {
		title="페퍼로니";
		java511.menu();
	}				
}