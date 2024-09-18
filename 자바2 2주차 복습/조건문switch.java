import java.util.Scanner;

public class 조건문switch {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String a;
    	double n3;
    	System.out.print("order menu?");
    	a=sc.next();
    	
    	switch(a) {
    		case "디아볼라":
    			System.out.print(a+" 가격은 20,000원 입니다.");
    			break;
    		case "피렌체":
    			System.out.print(a+" 가격은 22,000원 입니다.");
    			break;
    		case "고르곤졸라":
    			System.out.print(a+" 가격은 17,000원 입니다.");
    			break;
    		case "슈프림":
    			System.out.print(a+" 가격은 17,000원 입니다.");
    			break;
    		default: 
    			System.out.print("해당 메뉴 없음!");
    			break;
    	}
    	
    	int n1,n2;
    	
    	System.out.print("숫자 데이터 입력?");
    	n1=sc.nextInt();
    	System.out.print("진법 입력?");
    	n2=sc.nextInt();
    	
    	switch(n2) {
    		case 2:
    			System.out.print(n1+"는 "+n2+"진법으로 "+Integer.toBinaryString(n1));
    			break;
    		case 8:
    			System.out.print(n1+"는 "+n2+"진법으로 "+Integer.toOctalString(n1));
    			break;
    		case 16:
    			System.out.print(n1+"는 "+n2+"진법으로 "+Integer.toHexString(n1));
    			break;
    		
    		
    	}
    		
    	sc.close();
    	
    	
    	
    }

}