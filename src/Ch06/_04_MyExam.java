package Ch06;
import java.util.Scanner;

public class _04_MyExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book[] = new Book[2];
        for (int i = 0; i < book.length; i++) {
            System.out.println((i+1)+"번째 도서정보를 입력하세요. 예) 제목 저자 출판사 가격(숫자만)");
            System.out.print("제목>>");
            String title = scanner.nextLine(); //nextLine: Enter 누를 때까지 입력받음.
            System.out.print("저자>>");
            String author = scanner.nextLine();
            System.out.print("출판사>>");
            String publisher = scanner.nextLine();
            System.out.print("가격(숫자만)>>");
            int price = Integer.parseInt(scanner.nextLine());
            book[i] = new Book(title,author,publisher,price);
        }
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }

        System.out.print("수학, 과학, 영어점수를 공백으로 구분하여 순서대로 입력하세요.");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade grade = new Grade(math,science,english);
        System.out.println("평균은 "+grade.average());
        scanner.close();
    }
}
