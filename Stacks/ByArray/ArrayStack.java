package Stacks.ByArray;
import Stacks.Employee;
import java.util.EmptyStackException;
//(✷‿✷)
public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            //if the stack is full then we need to resize the backing array
            Employee[] newArray = new Employee[2 * stack.length]; // the length is twice because we've to copy every
            // element in this newArray
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
            //O(n)
        }

        stack[top++] = employee; //O(1)
    }

    public Employee pop() { //O(1)
        // if resizing the array O(n). Risk: If we wanna push items later then we'll have to resize the array again
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        /*top always contains the index of next available position in the array so, there is nothing at top.
        The top item on the stack is actually stored at top-1
        */
        Employee employee = stack[--top];
        stack[top] = null; //assign removed element position to null
        return employee; // return the removed element
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
