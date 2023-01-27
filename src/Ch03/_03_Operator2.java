package Ch03;

public class _03_Operator2 {
    public static void main(String[] args) {
        int a=1, b;
        b = a + 2;
        System.out.println(b); //3
        a += 4; //a=a+4; (대부분 연산자(/=, %=, ^=, >>= 등)에 사용가능)
        System.out.println(a); //5
        a++; //a=a+1
        System.out.println(a); //6
        b = a + 2;
        System.out.println(b); //8
        b = a++;
        System.out.println(a); //7
        System.out.println(b); //6 (a++의 연산은 증가 전의 값 6을 반환한다)
        b = ++a;
        System.out.println(a); //8
        System.out.println(b); //8 (++a 연산은 증가 후의 값 8을 반환한다)
    }
}
