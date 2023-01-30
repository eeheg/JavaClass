package Ch04;

public class _10_Continue {
    public static void main(String[] args) {
        //Continue: 반복문의 아래쪽은 실행하지 않고 반복문의 처음으로 이동
        int staff = 3;
        int max = staff * 5;
        int noGuest1 = 10, noGuest2=13;
        int processGuest = 0;

        for(int i=1; i<=25; i++) {
            System.out.println(i+"번 손님 창구로 오십시오.");
            if(i==noGuest1 || i==noGuest2){
                System.out.println(i+"번 손님 부재중으로 " +(i+1)+"번 손님으로 넘어갑니다.");
                continue; //for문의 처음으로 이동하여 진행.
            }
            processGuest++; // 손님 업무처리 완료
            if(processGuest==max) {
                System.out.println("금일 업무가 마감되었습니다.");
                break;
            }
        }
        System.out.println("업무를 종료합니다.");
    }
}
