abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract double avg(int[] arr);
}
class GoodCalc extends Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public double avg(int[] arr) {
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		double avg=sum/arr.length;
		return avg;
	}
}

public class jj11 {
	public static void main(String[] args) {
		GoodCalc gg=new GoodCalc();
		System.out.println(gg.add(2, 3));
		System.out.println(gg.sub(2,3));
		System.out.println(gg.avg(new int[] {2,3,4}));		
	}
}
