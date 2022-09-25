class MyCircularQueue {
    private int[] cqueue;
    private int front, rear;

    public MyCircularQueue(int k) {
        cqueue = new int[k];
        rear = front = -1;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        else {
            if (isEmpty())
                front = 0;
            rear = (rear < cqueue.length - 1) ? (rear + 1) : 0;
            cqueue[rear] = value;
            return true;
        }
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        else {
            if (front == rear)
                rear = front = -1;
            else
                front = (front < cqueue.length - 1) ? (front + 1) : 0;
            return true;
        }
    }

    public int Front() {
        if (isEmpty())
            return -1;
        else
            return cqueue[front];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        else
            return cqueue[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == cqueue.length - 1) || (front == rear + 1);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
