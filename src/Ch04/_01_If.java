package Ch04;

public class _01_If {
    public static void main(String[] args) {
        int temperature = -5;
        if (temperature < 0) {
            System.out.println("현재 영하입니다.");
            System.out.println("오늘은 매우 추운 날씨네요!");
        }
        System.out.printf("현재 기온은 %d도 입니다.\n", temperature);

        int hour = 8;
        if(hour < 9) {
            System.out.println("샌드위치 증정");
        }
        if(hour <= 10) {
            System.out.println("아메리카노 1+1");
            System.out.println("아메리카노 샷추가");
        }
        System.out.println("커피주문완료");
    }
}