package org.example.Corejava.Exceptions;

class Run_time extends RuntimeException {
    public Run_time(String message) {
        super(message);
    }
}


public class Runtime_exception {
    public static void main(String[] args) {
        throw  new Run_time("this is from runtime exception");
    }
}
