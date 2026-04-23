package org.example.Corejava.Inheritance;


class Parent_mul{
    void p(){
        System.out.println("this is from the parent class");
    }
}
class Child_1 extends Parent_mul{
    void c1(){
        System.out.println("this is from the child 1");
    }
}

class Child_2 extends Child_1{
    void c2(){
        System.out.println(" this is from the child 2");
    }
}



public class Multilevel_inheritance {

    public static void main(String[] args){
        Child_2 c = new Child_2();
        c.p();
        c.c1();
        c.c2();

    }
}
