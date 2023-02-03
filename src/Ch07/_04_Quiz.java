package Ch07;

class Gimbap{
    String name;
    public Gimbap() {
        this.name = "김밥";
    }
    public Gimbap(String name) {
        this.name = name;
    }
    public void cook(){
        System.out.println(this.name +"을 만듭니다.");
        System.out.println("김밥의 재료는 ?");
        System.out.println("+ 김");
        System.out.println("+ 밥");
        System.out.println("+ 단무지");
    }
}
class CheeseGimbap extends Gimbap{
    public CheeseGimbap() {
        super("치즈김밥");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class TunaGimbap extends Gimbap{
    public TunaGimbap() {
        super("참치김밥");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 참치");
    }
}

class SpicyGimbap extends Gimbap{
    public SpicyGimbap() {
        super("땡초김밥");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 땡초");
    }
}

public class _04_Quiz {
    public static void main(String[] args) {
        Gimbap[] gimbaps = new Gimbap[4];
        gimbaps[0] = new Gimbap();
        gimbaps[1] = new CheeseGimbap();
        gimbaps[2] = new TunaGimbap();
        gimbaps[3] = new SpicyGimbap();

        System.out.println("주문한 김밥을 만듭니다.");
        for (int i = 0; i <gimbaps.length; i++) {
            System.out.println("--------------------");
            gimbaps[i].cook();
            System.out.println("--------------------");
        }
        System.out.println("메뉴가 나왔습니다.");
    }
}