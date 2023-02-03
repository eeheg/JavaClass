package Ch07;

public class Truck extends Car{
    int capacity; // 용량

    public Truck() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacity=" + capacity +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}