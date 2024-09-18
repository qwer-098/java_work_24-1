import java.text.DecimalFormat;

class Coffee{
	String menu;
	int unitPrice;
	int qty;
	
	public Coffee() {};
	
	public void coffeePrice(){
		DecimalFormat df=new DecimalFormat("\u00A4 #,###");
		int pay=unitPrice*qty;
		System.out.printf("주문한 메뉴 %s 커피 대금은 %s원 입니다.", menu, df.format(pay) );
	}
}

public class Wk13_202310387_test1 {

	public static void main(String[] args) {
		Coffee c=new Coffee();
		c.menu="카페모카";
		c.unitPrice=4000;
		c.qty=3;
		
		c.coffeePrice();
	}
}

