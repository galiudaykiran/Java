package org.example.Corejava.Inheritance;
class Parent_hie{
    void p(){
        System.out.println("This is from the parent class");
    }
}
class Child_1_hie extends Parent_hie{
    void c1(){
        System.out.println("This is from the child 1 class");
    }

}


class Child_2_hie extends Parent_hie{
    void c2(){
        System.out.println("This is from the child 2 class");
    }
}

class Child_3_hie extends Parent_hie{
    void c3(){
        System.out.println("this is from the child 3 class");
    }
}



public class Hierarchial_inheritance {
    public static void main(String[] args){

        Child_1_hie  c1 = new Child_1_hie();
        c1.c1();
        c1.p();

        Child_2_hie c2 = new Child_2_hie();
        c2.c2();
        c2.p();

        Child_3_hie c3 = new Child_3_hie();
        c3.c3();
        c3.p();

    }
}

