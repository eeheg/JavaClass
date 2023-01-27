package Ch01;

public class MyVariable {
    public static void main(String[] args) {
        System.out.println("Hello!!");
        System.out.println("Hello!!" + "안녕하세요"); //문자열

        System.out.println("3+4 = " + (3+4));
        System.out.println(74+"+"+36+" = "+(74+36));

        System.out.print("Hello!");
        System.out.print("Java입니다."); //줄바꿈X

        System.out.print("\n"+3.14);
        System.out.print("\n"+3.14);

        System.out.printf("\n%d\n",3);
        System.out.printf("%c",3);
        System.out.printf("%d %d", 100, 200);

        System.out.print("\n");
        System.out.println(+100+"/"+200+"="+(100/200));
        System.out.printf("%d/%d=%d\n",100,200,100/200);
        System.out.printf("%d/%d=%f\n",100,200,(double)100/200);
    }
}
