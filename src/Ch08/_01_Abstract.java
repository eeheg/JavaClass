package Ch08;

abstract class Shape {
    public Shape() { }
    public void paint(){ }
    abstract public void draw();  // 추상 메소드 : 반드시 상속받아서 오버라이딩 해야함
}

class Line extends Shape{

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return "Line{}";
    }
}


public class _01_Abstract {
    public static void main(String[] args) {
        Shape line  = new Line();
        line.draw();
    }
}