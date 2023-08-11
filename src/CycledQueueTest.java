public class CycledQueueTest {

    public static void run() {
        CycledQueue queue = new CycledQueue(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.pop();
        queue.push(7);
        queue.push(8);
        queue.push(9);

        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
    }

}
