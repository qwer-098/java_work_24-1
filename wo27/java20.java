interface Marble{
	public final String MOVIE="아이언맨";
	String ACTOR="로버트다우니주니어";

	public void ironmanMovie();
}
interface DC{
	public static final String MOVIE="베트맨";
	public static final String ACTOR="크리스찬베일";
	public static final String MOVIE2="베트맨";
	public static final String ACTOR2="크리스찬베일";

	public void batmanMovie();
	public void aquaMovie();
}

class Disney implements Marble{
	public void ironmanMovie() {
		System.out.println("마블 영웅 영화입니다.");
		System.out.println("영화제목 : "+MOVIE);
		System.out.println("주연 :"+ACTOR);
	}
}
class WarnerBrothers implements DC{
	public void printff() { 
		System.out.println("---------------");
		System.out.println("DC 영웅 영화입니다.");
		batmanMovie();
		System.out.println();
		aquaMovie();
	}
	public void batmanMovie() {
		System.out.println("영화제목 : "+MOVIE);
		System.out.println("주연 :"+ACTOR);
	}
	public void aquaMovie() {        
		System.out.println("영화제목 : "+MOVIE2);
		System.out.println("주연 :"+ACTOR2);
	}
}

public class java20 {
	public static void main(String[] args) {
		Disney dd=new Disney();
		WarnerBrothers ww =new WarnerBrothers();
		dd.ironmanMovie();
		ww.printff();
	}
}
