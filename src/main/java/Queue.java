public class Queue {
    private int[] arr;
    private int front, rear, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        arr[++rear] = x;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int dequeued = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return dequeued;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}
