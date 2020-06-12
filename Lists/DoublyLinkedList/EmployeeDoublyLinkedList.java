package Lists.DoublyLinkedList;
//(✷‿✷)
// Never forget to increment/decrement the size after adding/removing the element
public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        // we don't have to worry about the new node previous field because it's initialized to null
        if (head == null) { //for checking if the list is empty
            tail = node;
        }
        else {
            head.setPrevious(node); //head node pointing to new node
            node.setNext(head); //new node pointing to head node
        }

        head = node; //assigning head to the new node
        size++;
    }

    public void addToEnd(Employee employee) {
        // we don't have to worry about the new node next field because it's initialized to null
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) { //for checking if the list is empty
            head = node;
        }
        else {
            tail.setNext(node); //tail node pointing to new node
            node.setPrevious(tail); //new node pointing to tail node
        }

        tail = node; //assigning tail to the new node
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        //head->A<->B<->C->null
        EmployeeNode removedNode = head; // assigning the head(A) to a variable

        if (head.getNext() == null) { //if removing the only element from the list
            tail = null;
        }

        else {
            head.getNext().setPrevious(null); //assigning the B's previous field to null
        }

        head = head.getNext(); //pointing head to B
        size--;
        removedNode.setNext(null); // A pointing to null
        return removedNode; // A
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        //head->A<->B<->C->null
        EmployeeNode removedNode = tail; // assigning the tail(C) to a variable

        if (tail.getPrevious() == null) { //if removing the only element from the list
            head = null;
        }
        else {
            tail.getPrevious().setNext(null); //assigning the B's next field to null
        }

        tail = tail.getPrevious(); //pointing tail to B
        size--;
        removedNode.setPrevious(null); // C pointing to null
        return removedNode; // C
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }


}
