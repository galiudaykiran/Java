package org.example.Corejava.Multithreading.Thread;
//Multithreading = running multiple threads concurrently within the same process to improve performance and responsiveness.


// two ways for creating the threads
// 1 . Extend Thread Class
// 2. Implement   Runnable( good way)


//🔹 Thread Lifecycle (Interview Diagram in Words)
//
//NEW → RUNNABLE → RUNNING → WAITING/BLOCKED → TERMINATED
//
//start() → thread enters runnable state
//
//sleep(), wait() → waiting
//
//completes run() → terminated

class Mythread  extends Thread{
    public  void run(){
        System.out.println("thread is ruuning : "+Thread.currentThread().getName());
    }
}

public class thread_creation_using_thread_class {
    public static void main(String[] args){
    Mythread t1 = new Mythread();
    t1.start();
    }
}
