import java.util.Scanner;
enum Sbuck {SMALL, TALL, GRANDE, VENTI}

public class wo12 {
	public static void challenge2() { 
		System.out.print("배열 소문자 출력: ");
		for(Sbuck s:Sbuck.values()) {
			System.out.print(String.valueOf(s).toLowerCase());
		}
	}

	public static void DouArr2() {
		int[][] num = new int[4][];
		num[0]=new int [4];
		num[1]=new int [2];
		num[2]=new int [3];
		num[3]=new int [1];
		int cnt=0;
		for(int i=0; i<num.length; i++) {
			for(int j=0;j<num[i].length; j++) {
				num[i][j]=++cnt;
				System.out.printf("%-3d", num[i][j]);
			}System.out.println();
		}	
	}
	
	public static void DouArr() {
		String arr[][]= {{"Korea", "Seoul", "Pusan"},
				{"Japan","Tokyo", "Osaka"},
				{"China","Beijing", "Shanghai"}};
		int sum=0;	
		System.out.println("arr 배열 행 길이: "+ arr.length);
		System.out.println("arr 배열 열 길이: "+ arr[0].length);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.printf("%-10s", arr[i][j]);
				sum+=arr[i][j].length();
			}System.out.println();
			
		}System.out.print("arr 배열 문자 기링 합계: "+sum);
	}
	
	
	public static void DouArr3() {
		char[][] arr= {{'a','b','c','d'},
				{'e','f'},{'g','h','i'}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {	// string으로 변환
				System.out.print(String.valueOf(arr[i][j]).toUpperCase()+"\t");
			}System.out.println(); 
		}
	}
	
	public static void main(String[] args) {
	}
}
