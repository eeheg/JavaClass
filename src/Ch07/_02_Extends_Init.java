package Ch07;

class BigCar {
    String name;
    public BigCar(){
        this.name = "버스";
        System.out.println("BigCar(버스)생성자입니다.");
    }
    public BigCar(String name) {
        this.name = name;
        System.out.println("BigCar("+name+") 생성자입니다.");
    }
}

class BigBus extends BigCar {
    public BigBus() {
        //super();
        System.out.println("Bus의 기본생성자입니다.");
    }

    public BigBus(String name) {
        super(name);
        System.out.println("Bus의 매개변수 사용 생성자입니다.");
    }
}

public class _02_Extends_Init {
    public static void main(String args[]) {
        BigBus bus = new BigBus();
        BigBus bus2 = new BigBus("전기버스");
    }
}
