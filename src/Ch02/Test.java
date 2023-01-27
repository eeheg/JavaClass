package Ch02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //practice1
        Scanner sc1 = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num1 = sc1.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int num2 = sc1.nextInt();
        System.out.println("합은 "+(num1+num2));

        //practice2
        Scanner sc2 = new Scanner(System.in);
        System.out.print("공백으로 구분하여 두 정수를 입력하세요 : ");
        int num001 = sc2.nextInt();
        int num002 = sc2.nextInt();
        System.out.println(num001+" + "+num002+" = "+(num001+num002));
        System.out.println(num001+" - "+num002+" = "+(num001-num002));

        //practice3
        Scanner sc3 = new Scanner(System.in);
        System.out.print("첫번째 실수를 입력하세요 : ");
        double num01 = sc3.nextDouble();
        System.out.print("두번째 실수를 입력하세요 : ");
        double num02 = sc3.nextDouble();
        System.out.printf("곱셈 : %.2f 나눗셈 : %.2f\n", num01*num02, num01/num02);

        //practice4
        Scanner sc4 = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String userName = sc4.next();
        System.out.print("나이를 입력하세요 : ");
        int userAge = sc4.nextInt();
        System.out.println("안녕하세요! "+userName+"님\n"+userName+"님은 "+userAge+"세 입니다.");

        //practice5
        Scanner sc5 = new Scanner(System.in);
        System.out.print("반지름을 입력하시오 : ");
        double radius = sc5.nextDouble();
        System.out.println("면적 : "+radius*radius*3.14);

        //practice6
        Scanner sc6 = new Scanner(System.in);
        System.out.println("사각형의 가로를 입력하시오 : ");
        double width = sc6.nextDouble();
        System.out.println("사각형의 세로를 입력하시오 : ");
        double height = sc6.nextDouble();
        System.out.printf("사각형의 넓이는 %d\n사각형의 둘레는 %d", width*height, 2*(width+height));
    }
}
