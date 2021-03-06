import com.aexp.specs.Consumer;
import com.aexp.specs.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

    private static List<Integer> list = new ArrayList(5);
    public static void main(String args[]){
        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);

        Thread t1 = new Thread(producer, "Producer");
        Thread t2 = new Thread(consumer, "Consumer");

        t1.start();
        t2.start();

    }
}
