public class lab2_exam{
        private int[] numbers; 
        private int front; 
        private int rear; 
        private int nItems; 
        private int maxSize; 
        public void CircularQueue( int maxSize) { 
           this.maxSize = maxSize; 
           numbers = new int[maxSize]; 
           front = 0; 
           rear = -1; 
        nItems = 0; 
        } 
        public boolean isEmpty() { 
        return nItems == 0; 
        } 
        public boolean isFull() { 
        return nItems == maxSize; 
        } 
        public void enqueue(int value) { 
        if (isFull()) { 
        throw new IllegalStateException("Queue is full. Cannot enqueue element " + value); 
        } 
        if (rear == maxSize - 1) { 
        rear = -1; // Wrap around 
        } 
        numbers[++rear] = value; 
        nItems++; 
        } 
        public int dequeue() { 
        if (isEmpty()) { 
        throw new IllegalStateException("Queue is empty. Cannot  dequeue."); 
        } 
        int frontValue = numbers[front++]; 
        if (front == maxSize) { 
        front = 0; // Wrap around 
        } 
        nItems--; 
        return frontValue; 
        } 
        public static void main(String[] args) { 
        CircularQueue numQueue = new CircularQueue(3); 
        numQueue.enqueue(1); 
        numQueue.enqueue(2); 
        numQueue.enqueue(3); 
        numQueue.dequeue(); 
        numQueue.enqueue(4);
        numQueue.front();
        numQueue.rear(); 
        System.out.println("Front element: " + numQueue.peek()); 
        System.out.println("Size of the queue: " + numQueue.nItems); 
        // Printing all elements in the queue 
        while (!numQueue.isEmpty()) { 
        System.out.println(numQueue.dequeue()); 
        } 
        } 
        
}