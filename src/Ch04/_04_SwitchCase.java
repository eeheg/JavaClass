package Ch04;
import java.util.Scanner;

public class _04_SwitchCase {
    public static void main(String[] args) {
        String score = "A+";
        if(score.equals("A+")) {
            System.out.println("전액 장학금");
        }
        else if(score.equals("A0") || score.equals("B+")) {
            System.out.println("반액 장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 지급 완료");

        switch (score) {
            case "A+":
                System.out.println("전액장학금 A+");
                //break;
            case "A0":
                System.out.println("반액장학금 A0");
                //break;
            case "B+":
                System.out.println("반액장학금 B+");
                //break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 지급 완료");


        System.out.println("한달이 며칠인지 확인하는 프로그램입니다.");
        System.out.print("알고싶은 달은?");
        Scanner sc = new Scanner (System.in);
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일"); break;
            case 2:
                System.out.println("28일"); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일"); break;
            default:
                System.out.println("1~12를 입력하세요.");
        }
    }
}
