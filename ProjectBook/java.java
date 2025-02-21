import java.util.HashMap;
import java.util.Scanner;

public class javach5{
    private static HashMap<String, String[]> bookMap = new HashMap<>(); // ISBN과 배열로 도서 정보 저장

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // 전체 프로그램 반복
            System.out.println("\n===== 메인 메뉴 =====");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 조회");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 전체 도서 출력");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1: // 도서 추가
                    while (true) {
                        System.out.print("ISBN 입력: ");
                        String isbn = scanner.nextLine();
                        if (bookMap.containsKey(isbn)) {
                            System.out.println("이미 존재하는 ISBN입니다.");
                        } else {
                            System.out.print("도서 제목 입력: ");
                            String title = scanner.nextLine();
                            System.out.print("출판사 입력: ");
                            String publisher = scanner.nextLine();
                            System.out.print("정가 입력: ");
                            String price = scanner.nextLine();

                            bookMap.put(isbn, new String[]{title, publisher, price});
                            System.out.println("도서가 추가되었습니다.");
                        }

                        System.out.print("계속 추가하시겠습니까? (Y/N): ");
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("N")) {
                            break; // 추가 루프 종료
                        }
                    }
                    break;

                case 2: // 도서 조회
                    while (true) {
                        System.out.print("조회할 ISBN 입력: ");
                        String isbn = scanner.nextLine();
                        String[] bookInfo = bookMap.get(isbn);
                        if (bookInfo != null) {
                            System.out.println("제목: " + bookInfo[0] + ", 출판사: " + bookInfo[1] + ", 가격: " + bookInfo[2]);
                        } else {
                            System.out.println("해당 ISBN의 도서를 찾을 수 없습니다.");
                        }

                        System.out.print("계속 조회하시겠습니까? (Y/N): ");
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("N")) {
                            break; // 조회 루프 종료
                        }
                    }
                    break;

                case 3: // 도서 수정
                    while (true) {
                        System.out.print("수정할 ISBN 입력: ");
                        String isbn = scanner.nextLine();
                        String[] bookInfo = bookMap.get(isbn);
                        if (bookInfo != null) {
                            System.out.print("새로운 가격 입력: ");
                            String newPrice = scanner.nextLine();
                            bookInfo[2] = newPrice; // 가격 수정
                            System.out.println("가격이 수정되었습니다.");
                        } else {
                            System.out.println("해당 ISBN의 도서를 찾을 수 없습니다.");
                        }

                        System.out.print("계속 수정하시겠습니까? (Y/N): ");
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("N")) {
                            break; // 수정 루프 종료
                        }
                    }
                    break;

                case 4: // 도서 삭제
                    while (true) {
                        System.out.print("삭제할 ISBN 입력: ");
                        String isbn = scanner.nextLine();
                        if (bookMap.remove(isbn) != null) {
                            System.out.println("도서가 삭제되었습니다.");
                        } else {
                            System.out.println("해당 ISBN의 도서를 찾을 수 없습니다.");
                        }

                        System.out.print("계속 삭제하시겠습니까? (Y/N): ");
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("N")) {
                            break; // 삭제 루프 종료
                        }
                    }
                    break;

                case 5: // 전체 도서 출력
                    System.out.println("\n===== 전체 도서 목록 =====");
                    for (String isbn : bookMap.keySet()) {
                        String[] bookInfo = bookMap.get(isbn);
                        System.out.println("ISBN: " + isbn + ", 제목: " + bookInfo[0] + ", 출판사: " + bookInfo[1] + ", 가격: " + bookInfo[2]);
                    }
                    break;

                case 6: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
            scanner.close();
        }
    }
}
