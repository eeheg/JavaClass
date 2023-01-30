package Ch04;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        //메뉴 <1>아메리카노, <2>카페라떼, <3>그만시킬래요
        //주문하시겠습니까?
        //<1>: 아메리카노를 준비하겠습니다.
        //<2>: 카페라떼를 준비하겠습니다.
        //<3>: 주문하신 메뉴 준비하겠습니다.

        int menu;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("메뉴 <1>아메리카노, <2>카페라떼, <3>그만시킬래요");
            System.out.println("주문하시겠습니까?");
            menu = scanner.nextInt();
        } while(menu==1 || menu==2);
        System.out.println("주문하신 메뉴 준비하겠습니다.");

        int laneDistance = 25;
        int move=0;
        int height = 2;
        do{
            System.out.println("발차기를 계속 하세요.");
            System.out.println("현재이동거리 : "+move);
            move += 2;
        } while (move+height<laneDistance);
        System.out.println("25m 도착");
    }
}
