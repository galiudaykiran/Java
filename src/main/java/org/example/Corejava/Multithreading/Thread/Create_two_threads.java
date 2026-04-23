package org.example.Corejava.Multithreading.Thread;


class task implements Runnable{

    @Override
    public void run() {
        System.out.println(" Task Running " +Thread.currentThread().getName());
    }
}


public class Create_two_threads {
    public static void main(String[] args){

        Thread t1 = new Thread(new task(),"Thread 1");
        t1.start();
        Thread t2 = new Thread(new task(),"Thread  2");
        t2.start();

    }
}
