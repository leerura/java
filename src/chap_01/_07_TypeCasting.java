package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println(score_f);
        System.out.println(score_d);
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        float new_score = (float) score + score_f;
        System.out.println(new_score);

        // int -> long -> float -> double

        // 숫자를 문자로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1 +" " + 123);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);


    }
}
