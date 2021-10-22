package day17.inter;

public interface Pet {

    //인터페이스에는 상수피드만 선언가능
    ///public static final int abc = 100;
    ///객체 생성 불가능함
    int ABC = 100;

    //인터페이스는 기본적으로 추상메서드만 선언할 수 있음.
    //public void play();

    //사료를 먹다
    void feeding();

}//end class
