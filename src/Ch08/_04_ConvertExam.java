package Ch08;
import java.util.Scanner;
abstract class Converter{
    protected double ratio; //

    public Converter(double ratio) {
        this.ratio = ratio;
    }

    abstract protected String srcString();
    abstract protected String destString();
    abstract protected double convert(double src);

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(srcString()+"을 "+destString()+"로 바꿉니다.");
        System.out.print(srcString()+"을 입력하세요 >>");
        double src = scanner.nextDouble();
        double dst = convert(src);
        System.out.println("변환결과: "+
                String.format("%.3f",dst)+destString()+"입니다.");
        //변환결과: 1.789달러입니다
//        scanner.close();
    }

}
class Won2Yen extends Converter{
    public Won2Yen(double ratio) {
        super(ratio);
    }

    @Override
    protected String srcString() {
        return "원";
    }

    @Override
    protected String destString() {
        return "엔";
    }

    @Override
    protected double convert(double src) {
        return src/ratio;
    }

}


class Won2Dollar extends Converter{
    public Won2Dollar(double ratio) {
        super(ratio);
    }

    @Override
    protected String srcString() {
        return "원";
    }

    @Override
    protected String destString() {
        return "달러";
    }

    @Override
    protected double convert(double src) {
        return src/ratio;
    }
}

public class _04_ConvertExam {
    public static void main(String[] args) {
        Won2Dollar dollar = new Won2Dollar(1235);
        dollar.run();

        Won2Yen yen = new Won2Yen(9.9);
        yen.run();


    }
}