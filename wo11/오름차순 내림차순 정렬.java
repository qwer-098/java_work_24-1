import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Wk11_202310387_test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr= {"페리카나", "굽네", "교촌치킨", "노랑통닭", "네네치킨"};
		
		System.out.println("정렬 전: "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("오름차순: "+Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.print("내림차순: "+Arrays.toString(arr));
		
		sc.close();
	}
}

