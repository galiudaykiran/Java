package org.example.Corejava.Exceptions;

public class Manual_throw_exception {
    public static void main(String[] args){
        int age = 15;
        if(age<18){
            throw new RuntimeException(" not eligible for vote");
        }
        System.out.println("Eligible for vote");


    }
}
