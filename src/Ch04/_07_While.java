package Ch04;

public class _07_While {
    public static void main(String[] args) {
        int i=1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }

        //1~100 홀수를 모두 출력
        int num=1;
        while(num <= 100) {
            System.out.println(num+" ");
            num += 2;
        }

        int laneDistance = 25; //수영장 레인길이 25m
        int move=0; //현재 이동거리 0m
        int height = 2; //신장 2m
        while(move+height < laneDistance) { //현재 이동거리가 레인길이보다 작으면
            System.out.println("발차기를 계속 하세요.");
            System.out.println("현재 이동거리: " + move);
            move += 2; //수영장에서 발차기를 하면 2m이동
        }
        System.out.println("25m 도착");


        //비교: do-while 문 (_08_DoWhile)
        laneDistance = 25;
        move=0;
        height = 2;
        do{
            System.out.println("발차기를 계속 하세요.");
            System.out.println("현재이동거리 : "+move);
            move += 2;
        } while (move+height<laneDistance);
        System.out.println("25m 도착");
    }
}
