package day12.protec.pac2;

import day12.protec.pac1.A;

public class D extends A {

    @Override
    protected void m1() {
        super.m1();
    }

    public D() {

        super.f1 = 1;
        //super.f2 = 2;
        //this.f1 = 1;
        //this.f2 = 2;

        super.m1();//부모의 원본을 부르는 것
        //super.m2();


        this.m1();//오버라이딩 한 것을 부르는 것!!!!
    }
}//end class
