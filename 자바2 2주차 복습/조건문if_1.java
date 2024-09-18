import java.util.Scanner;

public class 조건문if_1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	int n1, n2, n3;
    	double sum, avg;
    	
    	System.out.print("면접점수1? ");
    	n1=sc.nextInt();
    	System.out.print("면접점수2? ");
    	n2=sc.nextInt();
    	System.out.print("면접점수3? ");
    	n3=sc.nextInt();
    	
    	sum=n1+n2+n3;
    	avg=sum/3;
    	System.out.printf("평균= %.2f\n", avg);
    	if(avg>=80) {
    		if(n1<60 || n2<60 || n3<60){
        		System.out.print("판정= 불합격");
        	}
    		else System.out.print("판정= 합격");
    	}
    	else System.out.print("판정= 불합격");
    	
    	String a,b;
    	double n333;
    	
    	System.out.print("이름? ");
    	a=sc.nextLine();
    	System.out.print("출연작품? ");
    	b=sc.nextLine();
    	System.out.print("평점? ");
    	n333=sc.nextDouble();
    	
    	System.out.print(a+"가 출연한 넷플릭스 "+b+" 작품 평점은 ");
    	if(n3<=5.0 && n333>=4.5) System.out.print("★★★★★");
    	else if(n333<=4.4 && n3>=4.0) System.out.print("★★★★");
    	else if(n333<=3.9 && n3>=3.0) System.out.print("★★★");
    	else if(n333<=2.9 && n3>=2.0) System.out.print("★★");
    	else if(n333<=1.9 && n3>=1.0) System.out.print("★");
    	System.out.print("이다.");
    		
    	sc.close();
    	
    }

}