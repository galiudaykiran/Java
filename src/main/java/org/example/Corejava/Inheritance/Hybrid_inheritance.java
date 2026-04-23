package org.example.Corejava.Inheritance;
class Parent_hy{
    void p(){
        System.out.println("this is from the parent class ");
    }
}

interface Child_1_hy {
    void c1();

}

interface Child_2_hy {
    void c2();
}


class  Small_child extends Parent_hy implements Child_1_hy,Child_2_hy{

    @Override
    public void c1() {
        System.out.println(" this is from the child 1 interface");
    }

    @Override
    public void c2() {
        System.out.println("This is from the child 2 interface");

    }

    void small_child(){
        System.out.println("This is from the small child class ");
    }
}





public class Hybrid_inheritance {
    public static void main(String[] args){

        Small_child sm = new Small_child();
        sm.p();
        sm.c1();
        sm.c2();
        sm.small_child();

    }
}
