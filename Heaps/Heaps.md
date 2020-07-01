# Heaps
   * A complete binary tree
   * Must satisfy the heap property
   * **Max heap**: _Every parent is greater than or equal to its children_
   * **Min heap**: _Every parent is less than or equal to its children_
## Heaps Properties
* A binary heap must be a complete tree
* Children are added at each level from left to right 
* Usually implemented as array
* The max and min value will always be at the root of the tree - the advantage of using a heap
* **Heapify** : _process of converting a binary tree into a heap - this often has to be done after an insertion or deletion_
* No required ordering between siblings

###### Heap Example(Max heap):
                            22
                           /  \
                         19    18
                        / \    / \
                      15   3  14  4
                     /
                   12
##### Time Complexity of a heap:
* Insertion: adding item is O(1) but heapifying makes it O(log n)
* Deletion: Searching the item is O(n) and then heapifying makes it O(log n). <br/>
If you want to delete some random item and you don't have the index then it is O(n log n).
