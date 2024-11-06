class test3{
	int n1, n2, n3;
	
	public void sugnjuk(String n, int n1, int n2) {
		int sum;
		this.n1=n1;
		this.n2=n2;
		sum=this.n1+this.n2;
		System.out.println(n+" 성적 총점: "+sum);
	}
	public void sugnjuk(String n, int n1, int n2, int n3) {
		int sum;
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		sum=this.n1+this.n2+this.n3;
		System.out.println(n+" 성적 총점: "+sum);
	}
}

public class wk05_202310387_고수림_test1 {
	public static void main(String[] args) {
		test3 te=new test3();
		
		te.sugnjuk("김연경", 90, 80);
		te.sugnjuk("강동원", 100, 90, 100);
		}				
}