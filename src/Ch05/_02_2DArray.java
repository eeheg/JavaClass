package Ch05;

import java.util.Arrays;

public class _02_2DArray {
    public static void main(String[] args) {
        String line1[] = {"A1","A2","A3","A4","A5"};
        String line2[] = {"B1","B2","B3","B4","B5"};
        String line3[] = {"C1","C2","C3","C4","C5"};
        String seats[][] = { //[행(몇번째배열?)],[열(해당배열내몇번째원소?)]
                {"A1","A2","A3","A4","A5"},{"B1","B2","B3","B4","B5"},{"C1","C2","C3","C4","C5"}
        };
        System.out.println(seats[0][0]); //[1행][1열]A1
        System.out.println("C4좌석: "+seats[2][3]);
        System.out.println("-----------------------------");

        double score[][] = {
                {3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}
        };
        double sum = 0.0;
        for (int year = 0; year < score.length; year++) { //year: 학년
            for (int term = 0; term < score[year].length; term++) { //term: 학기
                sum += score[year][term];
            }
        }
        int totalTerm = score.length * score[0].length;
        System.out.println("4년 평균 학점은: "+sum/(double)totalTerm);
        System.out.println("-----------------------------");

        int array_v1[] = {10,20,30,40,50};
        int array_v2[] = new int[4];
        System.arraycopy(array_v1,2,array_v2,1,3);
        //array_v1[2~]를 array_v2[1~]에 3개길이만큼 복사함
        System.out.println(Arrays.toString(array_v2));
    }
}
