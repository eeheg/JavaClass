package Ch06;

public class Circle { //Circle.java
    public int radius; // 반지름, 필드(field)값 / public: 누구나 접근 가능한 클래스
    public String name; //이름, 필드(field)값

    // 생성자(Constructor) //Alt + Insert
    // 생성자는 여러개 만들 수 있음(생성자 중복) : 매서드 오버로딩을 통해서
    // 생성자는 리턴 타입이 없음
    // 생성자의 이름은 클래스 이름과 동일
    // 접근지정자(public)는 사용할 수 있음

    public Circle() {
        this.radius = 3;
        this.name = "빨강";
    }

    public double getArea () { // 함수, 메서드
        return radius*radius*3.141592; // 원의 넓이
    }
}
