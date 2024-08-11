import java.util.LinkedList;
import java.util.Queue;



public class queue {
    public static void main(String[] args) {
       Queue <Integer> q = new LinkedList<>();
       q.add(12);
       q.add(13);
       q.add(14);
       q.add(15);
       q.add(16);

       Queue <Integer> n = new LinkedList<>();

        System.out.println();
       while(q.size()>=1) {
           System.out.println(q.remove());
       }




    }
}
