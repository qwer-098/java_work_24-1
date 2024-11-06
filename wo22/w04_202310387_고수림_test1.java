import java.text.DecimalFormat;

class Employee {
	String name;
	int basicFare;
	String title;
	
	public Employee() {}
	
	public Employee(String name, int basicFare, String title) {
		this.name=name;
		this.basicFare=basicFare;
		this.title=title;
	}
	
	public void printEm() {
		DecimalFormat df=new DecimalFormat(",###");
		System.out.print(this.name+"의 사원의 기본급은 "+df.format(this.basicFare)+"이며, 직급은 "+this.title+"입니다.");
	}
	
}

public class w04_202310387_고수림_test1 {
	public static void main(String[] args) {
		Employee em=new Employee("홍길동", 2000000, "대리");
		em.printEm();
	}				
}