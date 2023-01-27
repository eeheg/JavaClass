package Ch04;

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
    }
}
