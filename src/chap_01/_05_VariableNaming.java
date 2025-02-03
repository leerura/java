package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어는 제외)
        // 6. 예약어는 사용 불가( ex public, static, void ...)

        // 다른 나라 입국 신고서
        String firstName = "Seok Won" ;
        String lastName = "Lee";
        int age = 21;
        String nationality = "대한민국";
        String _flightNo = "KE657";

        // 상수는 대문자로 적습니다 + final
        final String CODE = "KR";

    }
}
