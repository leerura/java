package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean soup = true;
        boolean egg = false;
        boolean protein = true;

        System.out.println(soup || egg || protein); //or 연산자
        System.out.println(soup && egg && protein); //and 연산자

        //부정 연산자 !
        System.out.println(!(3<5));
    }
}
