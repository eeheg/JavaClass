package Ch04;

public class _09_Break {
    public static void main(String[] args) {
        //번호표 100명까지 출력
        int staff =4;
        int max = staff*20;
        for(int i=1; i<=100; i++) {
            System.out.println(i+"번 손님 창구로 오십시오.");
            if(i == max) {
                System.out.println("금일 업무가 마감되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.\n");
        System.out.println("------------------------------\n");

        staff =3;
        max = staff*20;
        int guestNum = 1;
        while(guestNum<=100) {
            System.out.println(guestNum+"번 손님 창구로 오십시오.");
            if(guestNum==max) {
                System.out.println("금일 업무가 마감되었습니다.");
                break;
            }
            guestNum++;
        }
        System.out.println("영업을 종료합니다.\n");
        System.out.println("------------------------------\n");

        staff = 2;
        max = 5*staff;
        for(int date=1; date<=3; date++) {
            System.out.println("오늘은 " + date +"일 입니다.");
            for(int i=1; i<15; i++) {
                System.out.println(i+"번 손님 창구로 오십시오.");
                if(i==max) {
                    System.out.println("금일 업무가 마감되었습니다.");
                    break;
                }
            }
            System.out.println("업무를 종료합니다\n");
            System.out.println("------------------------------\n");
        }
    }
}
