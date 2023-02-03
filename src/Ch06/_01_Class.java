package Ch06;

public class _01_Class {
    // _ 또는 숫자 또는 영문자로 클래스 이름을 만들면 됨
    // 클래스 이름과 파일 이름은 동일 _01_Class.java

    public static void main(String[] args) {
        Circle pizza = new Circle();
        pizza.radius = 15; //Circle클래스의 radius에 접근
        pizza.name = "하와이안 피자"; //Circle클래스의 name에 접근
        System.out.println("피자의 면적은 "+pizza.getArea());

        Circle donut = new Circle();
        donut.radius = 5;
        donut.name = "크림도넛";
        double area = donut.getArea();
        System.out.println("도넛의 크기는 "+ area + "입니다.");

        Rectangle rect = new Rectangle();
        rect.width = 5;
        rect.height = 7;
        rect.color = "파란색";
        area = rect.getArea();
        System.out.println(rect.color+"사각형의 면적은 "+rect.getArea()+"입니다.");

        Car car1 = new Car();
        car1.speed = 0;
        car1.color = "White";
        car1.model = "Genesis G80";
        car1.upSpeed(60);
        System.out.println(car1.model+" "+car1.color+"색 자동차의 현재 속도는 "+car1.speed+"km/h 입니다.");

        Car car2 = new Car();
        car2.speed = 0;
        car2.color = "Black";
        car2.model = "Sonata";
        car2.upSpeed(120);
        System.out.println(car2.model+" "+car2.color+"색 자동차의 현재 속도는 "+car2.speed+"km/h 입니다.");

        System.out.println("-----------------------------");

        Car car3 = new Car();
        System.out.println("시동: "+ car3.powerOn);
        System.out.println("와이퍼: "+ car3.wiperOn);
        System.out.println("모델: "+ car3.model);
        System.out.println("색상: "+ car3.color);
        System.out.println("속력: "+ car3.speed);

        System.out.println("-----------------------------");

        car3.color="blue";
        car3.power();
        System.out.println("시동: "+ car3.powerOn);
        System.out.println("와이퍼: "+ car3.wiperOn);
        System.out.println("모델: "+ car3.model);
        System.out.println("색상: "+ car3.color);
        System.out.println("속력: "+ car3.speed);

        System.out.println("-----------------------------");

        Account chulSoo = new Account("철수", "123456", 10000);
        chulSoo.deposit(5000); //5000원 입금
        long returnMoney = 12000;
        chulSoo.withdraw(returnMoney); //12000원 출금
        System.out.println("===== 철수의 계좌 =====");
        System.out.println("이름: "+chulSoo.getAccountName());
        System.out.println("계좌: "+chulSoo.getAccountNo());
        System.out.println("잔고: "+chulSoo.getAccountBalance());
        System.out.println("=====================");

        Account minSoo = new Account("민수","654321",50000);
        minSoo.deposit(12000);
        minSoo.withdraw(30000);
        System.out.println("===== 민수의 계좌 =====");
        System.out.println("이름: "+minSoo.getAccountName());
        System.out.println("계좌: "+minSoo.getAccountNo());
        System.out.println("잔고: "+minSoo.getAccountBalance());
        System.out.println("=====================");

        System.out.println("-----------------------------");

        Book bible = new Book("성경");
        Book javabook = new Book("자바의 정석", "남궁성","도우출판",30000);
        bible.printBook();
        System.out.println(bible);
        System.out.println(javabook);

        System.out.println("-----------------------------");

        MobilePhone galaxy = new MobilePhone("Silver",256);
        MobilePhone iphone = new MobilePhone("iphone14","White",128);
        System.out.println(galaxy);
        System.out.printf("내가 구입한 스마트폰은 %s색 %s이고 용량은 %dGB 입니다.\n",galaxy.getColor(), galaxy.getModel(), galaxy.getCapacity());
        System.out.printf("내가 구입한 스마트폰은 %s색 %s이고 용량은 %dGB 입니다.\n",iphone.getColor(), iphone.getModel(), iphone.getCapacity());
        System.out.println(iphone);


    }
}
