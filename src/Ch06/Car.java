package Ch06;

public class Car {
    public String color; //자동차색
    public String model;//자동차모델
    public int speed;//자동차속도
    public boolean wiperOn;
    public boolean powerOn;
    public void upSpeed(int value) { //속도증가
        speed += value;
    }
    public void downSpeed(int value) {//속도감소
        speed -= value;
    };
    public void power() {
        powerOn = true;
    }
    public void wiper() {
        wiperOn = true;
    }
}
