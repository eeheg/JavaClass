package Ch06;

public class _05_Method {
    public static void main(String[] args) {
        System.out.println(smallest(1.0, 3.0, 15.3));
    };
    public static double smallest(double num1, double num2, double num3) {
         return Math.min(Math.min(num1,num2),num3);
    }
};
