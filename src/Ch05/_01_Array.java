package Ch05;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class _01_Array {
    public static void main(String[] args) {
        int intArray[] = new int[5]; //배열이 new 연산자를 통해 생성됨
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        System.out.println("1번째 배열값 : "+ intArray[0]);
        System.out.println("2번째 배열값 : "+ intArray[1]);
        System.out.println("3번째 배열값 : "+ intArray[2]);
        System.out.println("4번째 배열값 : "+ intArray[3]);
        System.out.println("5번째 배열값 : "+ intArray[4]);
        System.out.println("-----------------------------");

        String tom = "Banana";
        String jane = "Mango";
        String daniel = "Apple";
        String michael = "Orange";
        String sara = "Kiwi";
        System.out.println(tom + "+1");
        System.out.println(jane + "+1");
        System.out.println(daniel + "+1");
        System.out.println(michael + "+1");
        System.out.println(sara + "+1");
        System.out.println("-----------------------------");

        System.out.println("[for 문 사용]");
        //for문
        String favFruites[] = {"Banana", "Mango", "Apple", "Orange", "Kiwi"};
        for (int i = 0; i < favFruites.length; i++) {
            System.out.println(favFruites[i] + " +1");
        }
        System.out.println("-----------------------------");

        System.out.println("[forEach 문 사용]");
        //forEach문
        for (String fruit:favFruites) {
            System.out.println(fruit + " +1");
        }
        System.out.println("-----------------------------");

        int intArray2[] = new int[5]; //배열을 생성하면 자동으로 0으로 초기화됨
        intArray2[0] = 20;
        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]+" "); //20 0 0 0 0
        }
        System.out.println("-----------------------------");

        int myNums[] = {10,20,30,40,50};
        System.out.println("배열의 개수는 " + myNums.length);
        System.out.println("이 배열은 " + (myNums.length * Integer.BYTES) + "byte의 메모리 크기를 가집니다.");
        //Wrapper Class: int,char 등을 클래스형태로 바꿔줌
        //int -> Integer / double -> Double / float -> Float / char -> Character
        //String -> String: 클래스형태는 가지나 BYTES는 없음
        System.out.println(Character.BYTES); //2
        System.out.println(Double.BYTES); //8
        System.out.println(Float.BYTES); //4
        System.out.println("-----------------------------");

        int testArray[] = {30,20,10,90,40,70,50};
        int min = testArray[0];
        Arrays.sort(testArray); // Arrays.sort(배열명): 오름차순으로 배열을 정리
        for (int i = 0; i < testArray.length; i++) {
            if(testArray[i] < min)
                min = testArray[i];
        }
        System.out.println("최소값은 "+min+"입니다.");
        System.out.println("-----------------------------");

        //정수를 5개 입력받아서 정수의 합과 평균을 구하는 프로그램 작성
        // 예) 1,2,3,4,5 배열을 사용하여 구해보기
        Scanner scanner = new Scanner(System.in);
        int intArray3[] = new int[5];
        int sum = 0;
        System.out.println("정수를 공백으로 구분하여 5개 입력하세요. 예) 1 2 3 4 5");
        for (int i = 0; i < intArray3.length; i++) {
            intArray3[i] = scanner.nextInt();
            sum += intArray3[i];
        }
        System.out.println("입력한 정수의 합은 "+sum+"이고 평균은 "+(double)sum/intArray3.length+"입니다.");
        scanner.close();
        System.out.println("-----------------------------");
    }
}
