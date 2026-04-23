package org.example.Corejava.Abstraction;
// abstraction  can be implemented in two ways
// 1. using the abstract class
// 2. using the interface


//   use abstract and void
abstract class Shape{
    abstract void shape();
}


class Color extends Shape{

    @Override
    void shape() {
        System.out.println("this is from the extended abstract class");
    }
}


 public  class Abstraction_imp {
     public static void main(String[] args){
       Shape s = new Color();
       s.shape();

     }

}
