package org.example.Corejava.Polymorphism;
//Compile-Time Polymorphism in Java is also known as static polymorphism and also known as method overloading. This happens when multiple methods in the same class have the same name but different parameters.

//Method overloading means defining multiple methods with the same name but different parameter lists. The method call is resolved at compile time based on the arguments passed.


class  method_over_loading{
   static   int mul(int a, int b){
        return a*b;
    }
    static int mul(int a,int b, int c){
        return a*b*c;
    }

}
public class Compile_overloading {
    public static  void main(String[] args){
        method_over_loading  m = new method_over_loading();
        System.out.println("method over loading using three para "+m.mul(2,3,4));
        System.out.println("method over loading using two para : "+m.mul(2,3) );


    }
}
