package Ch04;
import java.util.Random;
import java.util.Scanner;

public class _05_RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        //로또번호(1~45)추첨
        for(int i=0; i<6; i++) {
            System.out.print(random.nextInt(45)+1+" "); //0~44(45개)+1
        }

        System.out.println("\n");
        long randomLong = random.nextLong(); // (+-)2^31초과
        System.out.println(randomLong);
        float randomFloat = random.nextFloat();
        System.out.println(randomFloat); //0~1
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble); //0~1

        Random rand = new Random();
        int randValue = rand.nextInt(10)+1; //0~9(10개)+1
        System.out.print(randValue+" ");
        randValue = rand.nextInt(10)+1;
        System.out.print(randValue+" ");
        randValue = rand.nextInt(10)+1;
        System.out.print(randValue+" ");
        randValue = rand.nextInt(10)+1;
        System.out.print(randValue+" ");
        randValue = rand.nextInt(10)+1;
        System.out.print(randValue+" ");
        randValue = rand.nextInt(10)+1;
        System.out.println(randValue);

        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("가위(1),바위(2),보(3)게임\n 입력 : ");
        int comNum = rand.nextInt(3)+1; //1,2,3랜덤
        int myNum = scanner.nextInt();
        if(myNum==comNum) {
            System.out.println("Draw =>COM("+comNum+"):YOU("+myNum+")");
        }
        else if(myNum==3 && comNum==1) {
            System.out.println("Lose =>COM("+comNum+"):YOU("+myNum+")");
        }
        else if(myNum==1 && comNum==3) {
            System.out.println("Win =>COM("+comNum+"):YOU("+myNum+")");
        }
        else if(myNum < comNum) {
            System.out.println("Lose =>COM("+comNum+"):YOU("+myNum+")");
        }
    }
}
