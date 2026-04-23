package org.example.Corejava.Inheritance;

public class extending_interface implements interface_example {

    public static void main(String[] args) {
        extending_interface e = new extending_interface();
        e.hello();
        e.bye();
    }

    @Override
    public void hello() {
     System.out.println("hello");
    }

    @Override
    public void bye() {
        System.out.println("bye");

    }

}
