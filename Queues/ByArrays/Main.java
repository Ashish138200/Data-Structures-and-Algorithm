package Queues.ByArrays;
import Stacks.Employee;
//(✷‿✷)
public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue(janeJones);
        queue.enqueue(johnDoe);
        queue.enqueue(marySmith);
        queue.enqueue(mikeWilson);
        queue.enqueue(billEnd);
        //queue.printQueue();
        //System.out.println();
        queue.dequeue();
        queue.dequeue();
        //queue.printQueue();
        //System.out.println();
        //System.out.println(queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        //queue.remove();
        //System.out.println();
        queue.enqueue(mikeWilson);


        queue.printQueue();

    }
}
