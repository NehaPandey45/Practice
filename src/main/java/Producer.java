package com.aexp.specs;

import java.util.List;

public class Producer implements Runnable{
    private List<Integer> list;

    public Producer(List<Integer> list){
        this.list = list;
    }

    public void run(){
        for(int i=1; i<=5; i++){
            synchronized (list){
                while(list.size() > 1){
                    System.out.println("Producer is waiting as list is full");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Producer is producing data "+i);
                list.add(i);
                list.notifyAll();
            }
        }
    }
}
