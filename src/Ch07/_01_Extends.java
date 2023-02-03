package Ch07;

public class _01_Extends {
    public static void main(String[] args) {
        System.out.println("======== Example 01 ========");
        Sedan sedan = new Sedan();
        sedan.upSpeed(150);
        Truck truck = new Truck();
        truck.upSpeed(100);
        sedan.setSeatNum(5);
        truck.setCapacity(10);
        System.out.println(sedan);
        System.out.println(truck);
        System.out.println("승용차의 속도는 "+sedan.getSpeed() + "km, 좌석수는 "+
                sedan.getSeatNum()+"개 입니다.");
        System.out.println("트럭의 속도는 "+truck.getSpeed() + "km, 적재량은 "+
                truck.getCapacity()+"ton 입니다.");
        System.out.println("======== Example 02 ========");
        Manager manager = new Manager("철수","부산시 해운대구 어딘가",
                10000000, 12345678, 3000000);
        System.out.println(manager); // toString
        manager.test();

        System.out.println("======== Example 03 ========");
        Circle circle = new Circle();
        Ball ball = new Ball("빨간색");
        Circle blueBall = new Ball("Blue");

        System.out.println("원------->");
        circle.findRadius();  //반지름 정보
        circle.findArea();    //원의 면적정보

        System.out.println("공------->");
        ball.findColor();
        ball.findRadius(); // 상속받은 내용이기 때문에 circle의 정보 출력
        ball.findArea();   // 오버라이딩되었으므로 ball의 findArea메소드가 호출됨
        ball.findVolume();

        System.out.println("blueBall------->");
        blueBall.findArea();    // blueBall의 클래스 타입은 부모클래스고 객체는 자식 클래스로
        // 선언되었을때 어떤 메소드가 호출되는지 확인
        // overriding된 메소드의 동적 바인딩 확인


        Bus bus = new Bus("빨강", 100, 1250);
        if(!bus.color.equals("빨강"))
            System.out.println("버스의 색깔이 다릅니다.");
        else if (bus.speed != 100)
            System.out.println("버스의 속도가 다릅니다.");
        else if(bus.fee != 1250)
            System.out.println("버스 요금이 다릅니다.");
        else
            System.out.println("정답입니다.");

    }
}