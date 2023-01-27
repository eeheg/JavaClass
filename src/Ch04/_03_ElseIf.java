package Ch04;

public class _03_ElseIf {
    public static void main(String[] args) {
        int score = 40;
//        if(score >= 90) {
//            System.out.println("A");
//        }
//        else {
//            if(score >= 80) {
//                System.out.println("B");
//            } else {
//                if(score >= 70) {
//                    System.out.println("C");
//                }
//                else {
//                    if(score >= 60) {
//                        System.out.println("D");
//                    } else {
//                        System.out.println("F");
//                    }
//                }
//            }
//        };

        if(score >= 90) {
            System.out.println("A");
        }
        else if(score >= 80) {
            System.out.println("B");
        }
        else if(score >= 70) {
            System.out.println("C");
        }
        else if(score >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        };

        // grapefruitAde: 자몽에이드
        // cafeLatte: 카페라떼
        // IceAmericano: (default)아이스아메리카노
        boolean grapefruitAde = true;
        boolean cafeLatte = true;
        if(grapefruitAde) {
            System.out.println("자몽에이드 +1");
        } else if(cafeLatte) {
            System.out.println("카페라떼 +1");
        } else {
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("메뉴주문완료");

        grapefruitAde = false;
        if(grapefruitAde) {
            System.out.println("자몽에이드 +1");
        } else if(cafeLatte) {
            System.out.println("카페라떼 +1");
        } else {
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("메뉴주문완료");

        cafeLatte = false;
        if(grapefruitAde) {
            System.out.println("자몽에이드 +1");
        } else if(cafeLatte) {
            System.out.println("카페라떼 +1");
        } else {
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("메뉴주문완료");
    }
}
