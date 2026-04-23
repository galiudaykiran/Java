package org.example.Corejava.Inheritance;

class Parent {
    void par1(){
        System.out.println("this is parent class");
    }
}

 class Child extends Parent {
    void chlid1(){

      super.par1();
        System.out.println("this form child class ");
    }
}


public  class SingleInheritance{
    public static void main(String[] args){
        Child c = new Child();
        c.chlid1();



//        c.par1();
    }
}