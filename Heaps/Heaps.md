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