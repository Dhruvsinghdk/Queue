
class Que{
    int[] n = new int[4];
    int f = 0;
    int r = 0;
    int size = 0;
    void add(int x){
        if(f == -1 && r == -1){
            f = 0;
            r = 0;

        }
        else{
            n[r] = x;
            r++;
        }
        size++;
    }

    void display(){
        for(int i = f; i<=r-1; i++){
            System.out.print(n[i]+" ");
        }
    }

    void remove(){
            System.out.print(n[f]+" ");
            f++;
            size--;

    }
    void peek(){
        System.out.println(n[f]);
    }
    void empty(){
        if(size <=1){
            System.out.println("empty");
        }
        else {
            System.out.println("full");
        }
    }
}



