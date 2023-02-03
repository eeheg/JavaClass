package Ch07;

public class Ball extends Circle{
    private String color;

    public Ball(String color) {
        this.color = color;
    }
    public void findColor(){
        System.out.println("공의 색깔: "+color);
    }

    //Ctrl + O : 오버라이딩 단축키

    @Override
    public void findArea() {
        System.out.println("공의 면적: 4* PI * r * r");
    }

    public void findVolume(){
        System.out.println("공의 부피는 4/3* PI * r*r*r");
    }

}