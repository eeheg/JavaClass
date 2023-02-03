package Ch06;

public class Grade {
    private int math; //수학점수
    private int science; //과학점수
    private int english; //영어점수

    //생성자 만들기
    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    //average 라는 메서드를 만들어 평균을 리턴
    public double average() {
        return ((math+science+english)/3.0);
    }

    //getter
    public int getMath() {
        return math;
    }

    public int getScience() {
        return science;
    }

    public int getEnglish() {
        return english;
    }
}
