package Ch02;

import java.util.Scanner;

public class _04_DataInput {
    public static void main(String[] args) {
        //run하여 콘솔에 값을 직접 입력해보자.
        Scanner sc1 = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int myNum1 = sc1.nextInt();
        System.out.println("입력한 정수는 "+ myNum1 + "입니다.");

        Scanner sc2 = new Scanner(System.in);
        System.out.print("실수를 입력하세요 : ");
        double myNum2 = sc2.nextDouble();
        System.out.println("입력한 실수는 "+ myNum2 + "입니다.");

        Scanner sc3 = new Scanner(System.in);
        System.out.print("문장을 입력하세요 : ");
        String str = sc3.next();
        System.out.println("입력한 문장은 ("+str + ") 입니다.");

        Scanner sc4 = new Scanner(System.in);
        System.out.print("알파벳 한 글자를 입력하세요 : ");
        char ch = sc4.next().charAt(0);
        System.out.println("입력한 첫 글자는 ("+ ch + ") 입니다.");

        System.out.println("이름,도시,나이,체중,독신여부(true,false)를 공백으로 분리하여 입력하세요.");
        Scanner sc5 = new Scanner(System.in);
        String userName = sc5.next();
        System.out.println("이름은 "+userName+"입니다.");
        String cityName = sc5.next();
        System.out.println("사는 도시는 "+cityName+"입니다.");
        int userAge = sc5.nextInt();
        System.out.println("나이는 "+userAge+"입니다.");
        double userWeight = sc5.nextDouble();
        System.out.println("몸무게는 "+userWeight+"kg입니다.");
        boolean isSingle = sc5.nextBoolean();
        System.out.println("독신여부는 "+isSingle+"입니다.");

        sc5.close();
    }
}
