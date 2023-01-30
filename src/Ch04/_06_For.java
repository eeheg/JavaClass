package Ch04;

public class _06_For {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            System.out.println("안녕하세요. for문을 공부중입니다.");
        }
        for(int i=0; i<5; i++) {
            System.out.println((i + 1) + "번째 for문을 출력합니다.");
        }

        int hap = 0;
        for(int i=1; i<=100; i++) {
            hap = hap + i;
        }
            System.out.println("1부터 100까지의 합은" + hap);

        //구구단
        for (int i=1; i<=9; i++) {
            System.out.printf("\n[%d단]\n", i);
            for (int k=1; k<=9; k++) {
                int num = i*k;
                System.out.printf("%d X %d = %d\n", i, k, num);
            }
        }


    }
}