package com.company.thread;

public class ThreadRunner {

    public static void main(String[] args) throws InterruptedException {

//        System.out.println(Thread.activeCount());
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("whatup");
//        System.out.println("new name");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(4);
//        System.out.println("new priority");
//        System.out.println(Thread.currentThread().getPriority());

//        System.out.println(Thread.currentThread().isAlive());

//        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//
//        System.out.println("done");

        MyThread myThread = new MyThread();
//
//        System.out.println(myThread.isAlive());

        myThread.start();
//
//        System.out.println(myThread.getName());
//        myThread.setName("MyThread");
//        System.out.println(myThread.getName());

//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(myThread.getPriority());

        System.out.println(myThread.isDaemon());
        myThread.sleep(10000);
        myThread.setDaemon(true);
        System.out.println(myThread.isDaemon());


    }

}
