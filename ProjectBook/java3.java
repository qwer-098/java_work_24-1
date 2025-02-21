import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class book {
	public static void main(String[] args) {
    	HashMap<String, Object[]> book = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        Object[] bookInfo;
        String isbn, title, publisher, ans;
        int price;
        

        while(true) {
            System.out.println("\n===== 메인 메뉴 =====");
            System.out.println("1. 도서정도 입력");
            System.out.println("2. 조회");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 출력");
            System.out.println("6. 종료\n");
            System.out.print("메뉴를 선택하세요: ");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1: // 도서 입력
                	System.out.println();
                    while (true) {
                        System.out.print("ISBN 입력하시오: ");
                        isbn = sc.nextLine();
                        if (book.containsKey(isbn)) {
                            System.out.println("이미 존재하는 ISBN입니다.");
                        } else {
                            System.out.print("도서 제목 입력: ");
                            title = sc.nextLine();
                            System.out.print("출판사: ");
                            publisher = sc.nextLine();
                            while (true) {
                                System.out.print("정가: ");
                                try {
                                    price = sc.nextInt();
                                    sc.nextLine();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("잘못된 입력입니다. 정수로 입력해주세요.");
                                    sc.nextLine();
                                }
                            }
                            book.put(isbn, new Object[]{title, publisher, price});
                        }
                        
                        while(true) {
	                        System.out.print("\n계속 추가하시겠습니까? (Y/N): ");
	                        ans = sc.nextLine();
	                        if (ans.equals("N") || ans.equals("Y")) {
	                            break;
	                        }else	
	                        	System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                        }
                        if (ans.equals("N")) break;
                    }
                    break;

                case 2: // 조회
                    while (true) {
                        System.out.print("\n조회할 ISBN 입력: ");
                        isbn = sc.nextLine();
                        bookInfo = book.get(isbn);
                        if (bookInfo != null) {
                            System.out.println("\n도서 제목: " + bookInfo[0]);
                            System.out.println("출판사: " + bookInfo[1]);
                            System.out.println("정가: " + bookInfo[2]);
                        } else {
                            System.out.println("해당 ISBN의 도서를 찾을 수 없습니다.");
                        }

                        while(true) {
	                        System.out.print("\n계속 조회하시겠습니까? (Y/N): ");
	                        ans = sc.nextLine();
	                        if (ans.equals("N") || ans.equals("Y")) {
	                            break;
	                        }else	System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                        }
                        if (ans.equals("N")) break;
                    }
                    break;

                case 3: // 수정
                    while (true) {
                        System.out.print("\n수정할 ISBN 입력: ");
                        isbn = sc.nextLine();
                        bookInfo = book.get(isbn);
                        if (bookInfo != null) {
                            int newPrice;
                            while (true) {
                                try {
                                	System.out.print("정가: ");
                                	newPrice = sc.nextInt();
                                    sc.nextLine();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("잘못된 입력입니다. 정수로 입력해주세요.");
                                    sc.nextLine();
                                }
                            }
                            sc.nextLine();
                            bookInfo[2] = newPrice;
                            System.out.println("가격이 수정되었습니다.");
                        } else {
                            System.out.println("해당 ISBN의 도서를 찾을 수 없습니다.");
                        }

                        while(true) {
	                        System.out.print("계속 수정을 진행하시겠습니까? (Y/N): ");
	                        ans = sc.nextLine();
	                        if (ans.equals("N") || ans.equals("Y")) {
	                            break;
	                        }else	System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                        }
                        if (ans.equals("N")) break;
                    }
                    break;

                case 4: // 삭제
                    while (true) {
                        System.out.print("삭제할 ISBN 입력: ");
                        isbn =sc.nextLine();
                        if (book.remove(isbn)!= null)
                            System.out.println("\n해당 데이터가 삭제되었습니다.");
                        else 
                            System.out.println("해당 ISBN의 도서를 찾을 수 없습니다.");
                        
                        while(true) {
	                        System.out.print("계속 삭제를 진행하시겠습니까? (Y/N): ");
	                        ans = sc.nextLine();
	                        if (ans.equals("N") || ans.equals("Y")) {
	                            break;
	                        }else	System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                        }
                        if (ans.equals("N")) break;
                    }
                    break;

                case 5: // 도서정보 출력
                    System.out.println("\n===== 도서정보 출력 =====");
                    for (String key : book.keySet()) {
                        bookInfo = book.get(key);
                        System.out.println("ISBN 번호: " + key);
                        System.out.println("도서 제목: " + bookInfo[0]);
                        System.out.println("출판사: " + bookInfo[1]);
                        System.out.println("정가: " + bookInfo[2]);
                        System.out.println();
                    }
                    break;

                case 6: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
