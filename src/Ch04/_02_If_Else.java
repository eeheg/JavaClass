package Ch04;

import java.util.Scanner;

public class _02_If_Else {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.printf("입력한 숫자는 %d이고 ", number);
        if(number > 0) {
            System.out.println("양수입니다.");
        }
        else {
            System.out.println("음수입니다.");
        }

//        int hour = 10;
//        boolean morningCoffee = true; //모닝커피 마시지 않음
//        //오후3시 이후이거나 아침에 커피를 마신 경우: 아이스 아메리카노(디카페인)
//
//        //#방법1
//        if(hour < 15) {
//            if (morningCoffee == true) {
//                System.out.println("아이스 아메리카노(디카페인) +1");
//            } else {
//                System.out.println("아이스 아메리카노 +1");
//            }
//        }
//        else {
//            System.out.println("아이스 아메리카노(디카페인) +1");
//        }
//        System.out.println("커피주문완료");
//
//        //#방법2
//        if(hour > 15 || morningCoffee==true) {
//            System.out.println("아이스 아메리카노(디카페인) +1");
//        }
//        else {
//            System.out.println("아이스 아메리카노 +1");
//        }
//        System.out.println("커피주문완료");

        System.out.println("현재시간(01~24)? 모닝커피 마셨는지(true/false)?");
        System.out.println("예) 11 true");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        boolean morningCoffee = scanner.nextBoolean();
        if(hour > 15 || morningCoffee) {
            System.out.println("아이스 아메리카노(디카페인) +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피주문완료");
    }
}
