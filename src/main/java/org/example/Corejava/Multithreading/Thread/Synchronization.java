package org.example.Corejava.Multithreading.Thread;

//Synchronization ensures that only one thread accesses a shared resource at a time,
// preventing data inconsistency and errors.

//👉 Synchronization = one thread at a time access


class Bank{
    int balance = 1000;

    synchronized void withdraw(int amount){
        balance = balance-amount;
        System.out.println("Remaining balance is : "+balance);
    }
}
// without synchronized
//o/p  :
//Remaining balance is : 500
//Remaining balance is : 500

public class Synchronization {
    static void main() {


        Bank bank = new Bank();


        Thread t1 = new Thread(() -> bank.withdraw(200));
        Thread t2 = new Thread(() -> bank.withdraw(300));

        t1.start();
        t2.start();
    }

}
