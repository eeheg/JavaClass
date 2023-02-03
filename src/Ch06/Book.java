package Ch06;

public class Book {
    String title; // 책 제목
    String author; // 책 저자
    String publisher; // 출판사
    int price; // 가격

    //Alt + Insert -> Constructor -> 전부 선택시 아래 생성자 자동작성됨
    public Book(String ti, String au, String pu, int pr) {
        title = ti;
        author = au;
        publisher = pu;
        price = pr;
    }
    public Book(String ti) { //성경
        title = ti;
        author = "작가미상";
        publisher = "출판사모름";
        price = 0;
    }

    public void printBook() {
        System.out.printf("title: %s  author: %s  publisher: %s  price: %d\n",title,author,publisher,price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
