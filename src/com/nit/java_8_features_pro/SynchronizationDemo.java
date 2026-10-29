package com.nit.java_8_features_pro;

class BankAccount 
{
    int balance = 1000;
    synchronized void withdraw(int amount) 
    {
      if (balance >= amount) 
        {
            System.out.println(
                Thread.currentThread().getName()
                + " is withdrawing " + amount
            );

            balance = balance - amount;
            System.out.println("Remaining balance: " + balance);
        } 
        else 
        {
            System.out.println(
                Thread.currentThread().getName()
                + " : Insufficient balance"
            );}}}
public class SynchronizationDemo{
public static void main(String[] args) {
   BankAccount account = new BankAccount();
        Thread t1 = new Thread(() -> account.withdraw(900), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(789), "Thread-2");

        t1.start();
        t2.start();
    }
}
