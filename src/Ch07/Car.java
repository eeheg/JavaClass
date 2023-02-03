package Ch07;

public class Car {
    String color;
    int speed;

    public Car(){
        this.color = "빨강";
        this.speed = 0;
    }
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void upSpeed(int value){
        speed += value;
    }

    void downSpeed(int value){
        if(speed-value < 0)
            speed = 0;
        else
            speed -= value;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }
}