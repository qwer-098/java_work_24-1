// 4주차 2차시 실습 test2
class Stationery{
	String name;
	int num1, num2;
	public Stationery() {} // 기본 생성자
	public Stationery(String n, int n1, int n2) {
		name=n;
		num1=n1;
		num2=n2;
	}
	
	public String stationPrint() {
		int cnt=num1*num2;
		String rslt="";
		rslt=name+":"+cnt;
		
		return rslt;
	}
}

public class java422 {
	public static void main(String[] args) {
		Stationery st= new Stationery("공책", 2500, 8);
		String prt=st.stationPrint();
		System.out.print(prt);
	}				
}