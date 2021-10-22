package day17.api.lang.wrapper;

public class Wrapper {

    ///둘 다 정수
    static int x; ///기본데이터
    static Integer y;//기본값 null

    public static void main(String[] args) {

        x = 10; y = 20;

        y = x;
        x = y;

        //문자열 -- > 기본타입 변환
        String s1 = "90";
        String s2 = "5.5";
        System.out.println(s1 + s2);

        System.out.println(Integer.parseInt(s1) + Double.parseDouble(s2)) ;

    }
}//end class
