package Ch07;

import java.util.Random;
import java.util.Scanner;

public class _03_TestSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("로또 구입 금액을 입력하세요: ");
        int money = scan.nextInt();
        int count = money / 1000;
        int[] lotto = new int[count * 6];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 6; j++) {
                int num = random.nextInt(45) + 1;
                lotto[i * 6 + j] = num;
                for (int k = 0; k < j; k++) {
                    if (lotto[i * 6 + j] == lotto[i * 6 + k]) {
                        j--;
                        break;
                    }
                }
            }
            System.out.print("구입한 로또 " + (i + 1) + "번째: ");
            for (int j = 0; j < 6; j++) {
                System.out.print(lotto[i * 6 + j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
