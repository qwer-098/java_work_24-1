import java.io.*;

public class Wk14_202310387_test1 {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader fin=null;
		try {
			fin = new BufferedReader(new FileReader("C:\\java_work\\data.txt"));
			String c;
			int sum=0;
			
			while ((c=fin.readLine())!= null) {
				int line=Integer.parseInt(c.trim());
				sum+=line;
				System.out.println(line);
			}
			System.out.println("합계: "+sum);
			System.out.printf("평균: %.2f",sum/5.0);
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}

