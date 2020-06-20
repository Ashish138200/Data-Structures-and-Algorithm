package Queues.CircularQueue;
import java.util.NoSuchElementException;
import Stacks.Employee;
//(✷‿✷)
public class ArrayCircularQueue1 {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayCircularQueue1(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        /*
        * 0 jane
        * 1 john
        * 2 - -back(it cannot be incremented further because then it will clash with front)
        * 3 - mike - front
        * 4 bill
        * UPDATION
        *
        * 0 mike -front
        * 1 bill
        * 2 jane
        * 3 john
        * 4  - back
        *
        * */
        if (size() == queue.length - 1) {
            int numItemes = size();
            Employee[] newArr = new Employee[2 * queue.length];
            //Wrapping queue
            System.arraycopy(queue, front, newArr, 0, queue.length - front);
            System.arraycopy(queue,0,newArr,queue.length-front,back); //redundant copy
            queue = newArr;
            front = 0;
            back = numItemes;
        }
        queue[back] = employee;
        if (back< queue.length-1) {
            back++;
        }
        else {
            back = 0;
        }
    }
    public Employee remove(){
        if (size() == 0){
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size()==0){
            front=0;
            back = 0;
        }
        else if (front == queue.length){
            front = 0;
        }
        return employee;
    }

    public Employee peek(){
        if (size()==0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }
    public int size() {
        if (front <= back) {
            return back - front;
        }
        else {
            return back-front+queue.length;
        }
    }
    public void printQueue() {
        if (front<=back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back ; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
