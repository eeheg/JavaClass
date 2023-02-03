package Ch06;

public class _02_HelloJava {
    public void go () {
        Hello hello1 = new Hello();
        System.out.println(hello1.getMessage());

        Hello hello2 = new Hello("My Hello Java");
        hello2.setMessage("안녕하세요"); //setter 로 private 접근
        System.out.println(hello2.getMessage());;

        Hello hello3 = new Hello("Hello",2);
        System.out.println(hello3.getMessage());
    }

    public static void main(String[] args) {
        _02_HelloJava hello = new _02_HelloJava();
        hello.go();
    }
}
