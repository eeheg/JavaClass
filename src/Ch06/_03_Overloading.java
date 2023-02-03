package Ch06;

class MethodOverloading {
    int getSum(int i, int j) {
        return i+j;
    }
    int getSum(int i, int j, int k) {
        return i+j+k;
    }
    double getSum(double num1, double num2) {
        return num1+num2;
    }
}

public class _03_Overloading {
    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();
        System.out.println(overloading.getSum(1,2));
        System.out.println(overloading.getSum(1,2,3));
        System.out.println(overloading.getSum(1.5,2.5));

    }
}
