package Ch02;

public class _03_Constants {
    public static void main(String[] args) {
        //final로 변수선언시 대문자로 변수명지정
        final String DATE_OF_BIRTH = "1996-09-18";
        final String KR_COUNTRY_CODE = "+82";
        final String BUSAN_AREA_CODE = "051";
        System.out.println("KOREA Country Code : "+ KR_COUNTRY_CODE);

        final double PI = 3.141592;
        int radius = 3;
        System.out.println("반지름이 "+radius+"인 원의 면적은 "+radius*radius*PI+"입니다.");
    }
}
