package Ch07;

public class Circle {
    private void secret(){
        System.out.println("비밀");
    }
    protected void findRadius(){
        System.out.println("반지름 : 10cm");
    }
    public void findArea(){
        System.out.println("면적 : PI*r*r = 3.14*10*10 = 314");
    }
}