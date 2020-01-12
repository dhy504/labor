package com.dhy.lab.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    /**
     * true-公平锁 false-非公平锁
     */
    private ReentrantLock lock = new ReentrantLock(false);

    public void fairLock(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "正在持有锁");

        } finally {
            System.out.println(Thread.currentThread().getName() + "释放了锁");
            lock.unlock();

        }
    }


    public static void main(String[] args) {
        ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
        Runnable runnable = () ->{
            System.out.println(Thread.currentThread().getName() + "启动");
            reentrantLockTest.fairLock();
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);

        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();

        }
    }


}
