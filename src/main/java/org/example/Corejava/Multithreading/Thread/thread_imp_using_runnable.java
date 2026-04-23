package org.example.Corejava.Multithreading.Thread;

class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Task running: " + Thread.currentThread().getName());
    }
}



public class thread_imp_using_runnable {
    public static void main(String[] args){
        Thread t1 = new Thread(new MyTask());
        t1.start();

    }
}
