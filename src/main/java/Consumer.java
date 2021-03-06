package com.aexp.specs;

import java.util.List;

public class Consumer implements Runnable{
    private List<Integer> list;

    public Consumer(List<Integer> list){
        this.list = list;
    }

    public void run(){
        for (int i=1; i<=5; i++){
            synchronized (list){
                while(list.size() < 1){
                    try {
                        System.out.println("Consumer is waiting as there is no data");
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Consumer got the data "+list.remove(0));
                list.notifyAll();
            }
        }
    }

}
