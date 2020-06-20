package Queues.ByArrays;
import java.util.NoSuchElementException;
import Stacks.Employee;
//(✷‿✷)
public class ArrayQueue {

    private Employee[] queue;
    private int front; //Initially be zero
    private int back; //Initially be zero

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void enqueue(Employee employee) {
        if (back == queue.length) { //If the queue if full
            // the we need to resize the queue
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = employee; // adding newEmployee to the back of the queue
        back++;
    }

    public Employee dequeue() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        // If the queue has only one element and we removed it then we've to change the values of front and back
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return employee; // removed item
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        // back is always +1
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
