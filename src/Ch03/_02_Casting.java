package Ch03;

public class _02_Casting {
    public static void main(String[] args) {
        int num1=2, num2=3, num3=4;
        double result;
        result = num1 * num2 / num3;
        System.out.println(result); //1.0 (정수연산시 정수값이 산출됨)
        result = (double)num1 * num2 / num3;
        System.out.println(result); //1.5 (연산식에 실수가 한개라도 있어야 실수값이 나옴)

        double num4 = 1.4, num5 = 2.9;
        System.out.println((int)num4); //1 (int:소수점 무조건 버림)
        System.out.println((int)num5); //2
        System.out.println((int)(num4+0.5)); //2 (반올림할 경우 0.5를 더해서 정수로 변경)
        System.out.println((int)(num5+0.5)); //3
    }
}
