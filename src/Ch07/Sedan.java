package Ch07;

public class Sedan extends Car{
    int seatNum;

    public Sedan() {
        this.seatNum = 5;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "seatNum=" + seatNum +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}