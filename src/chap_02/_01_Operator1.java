package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        //산술 연산자

        //일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); // 2가 나옴 정수 => 정수
        System.out.println(5.0 /  2.0); // 2.5 실수 => 실수
        System.out.println(5 % 2); //나머지 구하기

        //우선 순위 연산 => 괄호 , 곱하기...

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c = a+b;

        System.out.println(c);

        //증감 연산 ++, --
        int val;
        val = 10;
        int d = 0;
        d = ++val;
        System.out.println(val);
        System.out.println(d);

        //은행 대기번호 표
        int waiting = 0;
        System.out.println(waiting++);

    }
}
