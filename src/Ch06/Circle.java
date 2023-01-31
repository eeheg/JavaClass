package Ch06;

public class Circle { //Circle.java
    public int radius; // 반지름, 필드(field)값 / public: 누구나 접근 가능한 클래스
    public String name; //이름, 필드(field)값
    public double getArea () { // 함수, 메서드
        return radius*radius*3.1415952; // 원의 넓이
    }


}
