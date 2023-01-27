package Ch02;

public class MyVariable {
    public static void main(String[] args) {
        String name = "유태경";
        int hour = 15;
        //유태경님, 배송물품을 15시에 방문전달할 예정입니다.
        //유태경님, 배송이 완료되었습니다.
        System.out.println(name + "님, 배송물품을 " + hour + "시에 방문전달할 예정입니다.");
        System.out.printf("%s님, 배송물품을 %d에 방문전달할 예정입니다.\n", name, hour);
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 97.3;
        String grade = "A+";
        name = "강한나";
        System.out.println(name+"님의 평균점수는 "+score+"점 입니다.");
        System.out.println(name+"님의 학점은 "+grade+"입니다.");

        boolean pass = true;
        System.out.println("시험합격여부: "+pass);

        double d = 3.141234567890123456789;
        float f = 3.14123456789f;
        System.out.println(d); //소숫점아래 17번째자리에서 끊음 double (16개)
        System.out.println(f); //소숫점아래 8번째자리에서 끊음 float (7개)

        int myNum1 = 1234567890; //-2^31 ~ 2^31(약21억) int
        long myNum2 = 123456789012L; //2^31 초과한 숫자 long, 끝에L
    }

}
