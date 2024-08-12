public class queuewitharray {
    public static class Queue{
        int[] cq = new int[5];
        int f = -1;
        int r = -1;
        int size = 0;
        void add(int x){
            if(size == cq.length){
                System.out.println("full");
            }
            else if (size == 0){
                f = 0;
                r = 0;
                cq[0] = x;
            }
            else if (r < cq.length-1) {
                cq[r] = x;
                r++;
            }
            else if (r == cq.length-1) {
                r = 0;
                cq[0] = x;
            }
            size++;
        }

        void remove(){
           if(size == 0){
               System.out.println("empty");
           }
           else{
               int val = cq[f];
               if(f == cq.length-1){
                   f = 0;
               }
               else{
                   f++;
                   System.out.print(val+" ");
               }
           }
           size--;
        }
        void display(){
            for (int i = f; i < r; i++) {
                System.out.print(cq[i]+" ");
            }
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println();
        q.remove();
        q.add(12);
        q.remove();
        q.add(13);
        q.remove();
        q.add(14);
        q.remove();
        q.add(15);
        q.remove();
        q.add(16);
        System.out.println();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();


    }




}