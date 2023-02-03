package Ch06;

public class MobilePhone {
    private String model;
    private String color;
    private int capacity;

    public MobilePhone(String model, String color, int capacity) {
        this.model = model;
        this.color = color;
        this.capacity = capacity;
    }

    public MobilePhone(String color, int capacity) {
        this("Galaxy S22",color,capacity);
//        this.model = "Galaxy S22";
//        this.color = color;
//        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}