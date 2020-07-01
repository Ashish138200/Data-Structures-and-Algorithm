package Heaps.maxHeaps;

public class Heap {
    private int[] heap; //array
    private int size; // contains the next avail position

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    public int delete(int index){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        int parent = getParent(index); //get the parent of the deleted item
        int deletedValue = heap[index]; // deleted value
        heap[index] = heap[size-1]; // replacement value
        if (index == 0|| heap[index]<heap[parent]){
            fixHeapBelow(index,size-1);
        }
        else {
            fixHeapAbove(index);
        }
        size--;
        return deletedValue;
    }
    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;
        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) { // this node has a left child
                if (rightChild > lastHeapIndex) { // test whether this node has a right child or not
                    childToSwap = leftChild; // only has a left child
                } else {
                    // swap it with the child that has the largest value
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }
                if (heap[index] < heap[childToSwap]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                }
                else {
                    break;
                }
                index = childToSwap;
            }
            else {
                break;
            }
        }
    }
    // Heapify
    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }

        heap[index] = newValue;
    }
    public int peek(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        return heap[0];
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getChild(int index,boolean left){
        return 2*index + (left ? 1 :2);
    }

    public void printHeap(){
        for (int i = 0; i <size ; i++) {
            System.out.print(heap[i]+",");
        }
        System.out.println();
    }
}
