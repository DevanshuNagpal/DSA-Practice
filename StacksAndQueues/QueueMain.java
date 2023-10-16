public class QueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(45);
        queue.insert(34);
        queue.insert(23);
        queue.insert(54);

        System.out.print(queue.remove());
        queue.display();
    }
}
