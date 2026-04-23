package org.example.Corejava.Inheritance;

interface Mother{
    void mother();
}

interface Father{
    void father();
}

class Child_inter implements Mother, Father{

    @Override
    public void father() {
        System.out.println(" this is from the father interface");
    }

    @Override
    public void mother() {
        System.out.println(" this is from the Mother interface ");

    }

    void child(){
        System.out.println(" this is from the child class");
    }
}



public class Multiple_interface_inher {
    public static void main(String[] args){


        Child_inter c = new Child_inter();
        c.mother();
        c.father();
        c.child();
    }
}
