package org.example.Corejava.Exceptions;

class InvalidAgeException extends RuntimeException{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class Custom_Exception {
    public static void main(String[] args){
        int age = 16;

        if(age< 18){
            throw new InvalidAgeException(" Age must be >=18");
        }
    }
}
