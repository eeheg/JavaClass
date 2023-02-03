package Ch08;

abstract class Car{
    int speed;
    String color;

    public Car(String color) {
        this.speed = 0;
        this.color = color;
    }

    void upSpeed(int speed){
        this.speed += speed;
    }

    abstract void work();
}

class Sedan extends Car{
    public Sedan(String color) {
        super(color);
    }

    @Override
    void work() {
        System.out.println(color+"색 세단이 사람을 태웁니다.");
    }
}

class Truck extends Car{
    public Truck(String color) {
        super(color);
    }

    @Override
    void work() {
        System.out.println(color+"색 트럭이 짐을 싣고 다닙니다.");
    }
}

public class _02_AbstractExample {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Sedan("티타늄 그레이");
        cars[1] = new Truck("골든 브라운");

        for (Car car: cars) {
            car.work();
        }

    }
}