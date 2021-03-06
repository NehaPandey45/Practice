import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueProdCons {

    public static void main(String args[]){
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(5);
        new Thread(() -> {
               for(int i=0; i < 5; i++){
                   try{
                       blockingQueue.put(i);
                       System.out.println("added to queue "+i);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
        }).start();

        new Thread(() -> {
            for(int i =0; i<5; i++){
                try{
                    System.out.println("Consumer retrieved- " + blockingQueue.take());
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
