package org.example.Corejava.Polymorphism;
//Runtime Polymorphism in Java is also known as dynamic method dispatch. It occurs when a method call is resolved at runtime, and it is achieved using method overriding.

// Runtime Polymorphism in Java is also known as dynamic method dispatch. It occurs when a method call is resolved at runtime, and it is achieved using method overriding.

class M_overriding{
    void draw(){
        System.out.println("this draw method from the M_overriding class");
    }
}

class C_overriding extends M_overriding{
    void draw(){
        System.out.println("this draw method from the C_overdinfg clas");
    }
}
class D_overriding extends M_overriding{
    void draw(){
        System.out.println("this draw method from the D_overriding class");
    }
}




public class Runtime_overriding {
    public static void main(String[] args){
    D_overriding d = new D_overriding();
    d.draw();

    C_overriding c = new C_overriding();
    c.draw();

    M_overriding m = new M_overriding();
    m.draw();



    }
}
