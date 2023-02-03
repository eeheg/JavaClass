package Ch08;

interface PhoneInterface{      // 전화기의 인터페이스를 선언
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo(){
        System.out.println("***** PHONE *****");
    }
}

interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface{
    void play();
    void stop();
}

class PDA{
    public int calculate(int x, int y){
        return x+y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다. 뚜루루루루");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화왔어요");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자 보냅니다.");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자왔어요");
    }

    @Override
    public void play() {
        System.out.println("MP3 재생");
    }

    @Override
    public void stop() {
        System.out.println("MP3 정지");
    }

    public void schedule(){
        System.out.println("일정 관리");
    }

}

public class _05_InterfaceExample {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println("계산기 사용(1+2)="+phone.calculate(1,2));
        phone.schedule();
    }
}