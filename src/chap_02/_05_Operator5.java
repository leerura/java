package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        //조건식 ? 참일 때 : 거짓일 때
        System.out.println(5==5 ? "팩트" : "구라");
        int x = 5;
        int y = 3;
        System.out.println((x>y)? x : y);
        int min = (x>y)? y : x;
        System.out.println(min);
    }
}
