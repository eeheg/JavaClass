package Ch08;

class OuterClass {
    int a = 3;
    static int b = 4;
    class Inner {
        int c = 5;
        public void innerMethod() {
            System.out.println("<Inner>");
        }
    }
    static class StaticInner {
        int d = 6;
        static int stat = 10;
        public static void staticMethod() {
            System.out.println("<Static Inner>");
        }
    }
}

public class _06_InnerClassEx {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println("======Outer Class Field값 접근 방법======");
        System.out.println("Outer Class a :"+outer.a);
        System.out.println("Outer Class b #1 :"+outer.b);
        System.out.println("Outer Class b #2 :"+OuterClass.b);

        System.out.println("======Inner Class 접근 방법======");
        OuterClass outer2 = new OuterClass();
        OuterClass.Inner inner = outer2.new Inner();
        System.out.println("Inner class c : "+inner.c);
        System.out.print("Inner Method :");
        inner.innerMethod();

        System.out.println("======Inner Static Class 접근 방법======");
        OuterClass.StaticInner static_Inner = new OuterClass.StaticInner();
        System.out.println("Static Inner Class d : "+ static_Inner.d);
        System.out.println("Static InnerClass stat #1 : "+static_Inner.stat);
        System.out.println("Static InnerClass stat #2 : "+OuterClass.StaticInner.stat);
        static_Inner.staticMethod();
        OuterClass.StaticInner.staticMethod();
    }
}
