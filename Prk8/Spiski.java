package Prk8;
import java.lang.*;
public class Spiski {
    public static void main(String[] args) {
            WaitList<Integer> w1 = new WaitList<>();
             BoundedWaitList<Integer> w2 = new BoundedWaitList<>(5);
              UnfairWaitList<Integer> w3 = new UnfairWaitList<>();
             System.out.println(w1);
            System.out.println(w2);
             System.out.println(w3);
            for (int i = 0; i < 10; i++) {
                w1.add(i);
                 w2.add(i);
                  w3.add(i); }
            System.out.println(w1);
             System.out.println(w2);
              System.out.println(w3);
            w3.moveToBack(3);
             System.out.println(w3);
            emptyWaitList(w1);
             emptyWaitList(w2);
              emptyWaitList(w3);
            System.out.println(w1);
             System.out.println(w2);
              System.out.println(w3); }
        public static <E> void emptyWaitList(IWaitList<E> w) {
            while (! w.isEmpty()) {
                w.remove(); } }
    }
