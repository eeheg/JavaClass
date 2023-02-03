package Ch06;

public class Hello {
    private String message;

    public Hello() { //매개변수 없는 생성자
        this.message = "Hello Java";
    }

    public Hello(String message) { //매개변수 1개 사용
        this.message = message;
    }

    public Hello(String message, int option) { //매개변수 2개 사용
        if(option == 1)
            this.message = message;
        else if(option == 2)
            this.message = message + "안녕하세요";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
