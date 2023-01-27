package Ch02;

public class _02_VariableName {
    //변수이름작성법 (카멜식변수명명법: myNum, yourGrade, myName, totalSum, variableName)
    //1. 변수이름으로 a,b,c,d,e 이런식으로 작성 금지
    //2. 변수로 언더바(_), 문자(abc), 숫자(1,2,3)사용가능, 공백 불가
    //3. 밑줄 또는 문자로 시작 (숫자가 처음에 올 수 없음)
    //4. 한 단어 또는 2개 이상의 단어
    //5. 변수는 소문자로 작성, but 2개이상의 단어시 : 두번째 단어의 첫번째 글자 대문자
    //6. 예약어 사용불가(public, static, void, int, float ...)

    String nationality = "KOREA";
    String firstName = "Jeonghee";
    String FamilyName = "Song";
    String purposeOfVisit = "Tour";
    String passportNo = "NW123456";
    String flightNo = "A654321";

    final String CODE = "KR"; //final 변수값을 변경할 수 없음, 변수명 대문자
}
