
public class Wk12_202310387_test1 {

	public static void main(String[] args) {
		int jumsu[][]= {{90,90,80},
				{80,95,80},
				{80,80,90},
				{90,70,95},
				{60,65,70}};
		
		int sum=0;
		System.out.println("     ** 성적표 **     ");
		for(int i=0; i<5; i++) {
			for(int j=0;j<3; j++) {
				
				System.out.printf("%d ", jumsu[i][j]);
				sum+=jumsu[i][j];
			} System.out.printf("%d %.2f\n", sum, (float)sum/3);
			sum=0;
	}
}
}

