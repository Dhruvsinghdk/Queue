public class Main {
    public static void main(String[] args) {
        Que q = new Que();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        System.out.println();
        q.remove();
        System.out.println();
        q.display();

    }
}
