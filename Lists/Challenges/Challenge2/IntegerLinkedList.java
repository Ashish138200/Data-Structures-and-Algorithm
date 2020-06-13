package Lists.Challenges.Challenge2;

import java.util.List;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
        //head->3->2->1->4->null
        //assumption: the list is sorted
        if (head == null || head.getValue() >= value){
            addToFront(value);
            return;
        }
        //find the insertion point
        IntegerNode current =head.getNext(); //used for traversing the list
        IntegerNode previous = head; //previous = current -1
        while (current!=null && current.getValue()<value){
            previous = current;
            current = current.getNext();
        }
        // adding a new Node
        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current); //inserting the new node before the current node
        previous.setNext(newNode); // current's previous field will point to the new node
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
