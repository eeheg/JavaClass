package Ch03;

import java.util.Scanner;

public class _01_Operator {
    public static void main(String[] args) {
        System.out.println(1/2);; //0.5 -> 0
        System.out.println(5*2);
        System.out.println(5/2); //2.5 -> 2 (정수연산시 값도 정수가 나옴)
        System.out.println(9/10);
        System.out.println(5%2); //몫2 나머지1
        System.out.println(4%2);

        //연산자 우선순위
        System.out.println(2 + 2 * 2); //6
        System.out.println((2+2)*2); //8

        int num1 = 5;
        int num2 = 2;
        int result;
        result = num1+num2;
        System.out.println("합: "+result);
        result = num1-num2;
        System.out.println("차: "+result);
        result = num1*num2;
        System.out.println("곱: "+result);
        float result2 = num1 / (float)num2; // ※중요
        System.out.println("나누기: "+result2);
        result = num1%num2;
        System.out.println("나머지: "+result);

        System.out.print("초(sec)를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int inputSecond = scanner.nextInt();
        int hour = inputSecond / 3600; //정수값(몫)
        int restSecond = inputSecond % 3600; //나머지
        int minute = restSecond / 60; //정수값(몫)
        int second = restSecond % 60; //나머지
        System.out.println(inputSecond+"초는 "+hour+"시간 "+minute+"분 "+second+"초 입니다.");
    }
}
