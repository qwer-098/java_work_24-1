public class Wk02_Test1_피라미드출력 {
    public static void main(String[] args) {
    	for(int i=1; i<=5; i++) {
    		for(int k=1; k<i; k++) {
    			System.out.print(" ");
    		}
    		for(int j=i; j<=5; j++) {
    			System.out.print(j);
    			
    		}System.out.println();
    	}
    	for(char i='E'; i>='A'; i--) {
    		for(char j=i; j>='A'; j--) {
    			System.out.print(j);
    		}System.out.println();
    	}
    }

}