
// -, -, -, -, 5

public class CycledQueue {
    private int count;  // 这个队列的大小
    private Integer head;   // 这是队列的头部

    private Integer tail;  // 这里是队列的尾部 + 1

    private int[] numbers;

    public  CycledQueue(int count) {
        assert(count > 0);
        this.count = count;
        this.numbers = new int[count];
        tail = 0;
    }

    private int nextIndex(int index) {
        return (index + 1) % count;
    }

    public boolean push(Integer element) {
        if (this.isFull()) {
            return false;
        }
        this.numbers[tail] = element;
        if (head == null) {
            head = 0;
        }
        tail = nextIndex(tail);
        return true;
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        int value = this.numbers[head];
        head = nextIndex(head);
        if (head == tail) {
            head = null;
            tail = 0;
        }
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return head == tail;
    }
}


