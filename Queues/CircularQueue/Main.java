package Queues.CircularQueue;
import Stacks.Employee;

//(✷‿✷)
public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayCircularQueue1 queue = new ArrayCircularQueue1(5);
        queue.enqueue(janeJones);
        queue.enqueue(johnDoe);
        queue.dequeue();
        queue.enqueue(marySmith);
        queue.dequeue();
        queue.enqueue(mikeWilson);
        queue.dequeue();
        queue.enqueue(billEnd);
        queue.dequeue();
        queue.enqueue(janeJones);
        queue.printQueue();
    }
}
