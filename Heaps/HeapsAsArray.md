## Heaps as Arrays
* We can put binary heaps as arrays
* We put the root at array[0]
* We then traverse each level from left to right, and so the left child of the root would go into array[1], its right child would go into array[2],etc.
#
               0    1    2    3    4   5    6   7
     Array-> | 22 | 19 | 18 | 15 | 3 | 14 | 4 | 12 |
     Left to right slot filling
                            22
                           /  \
                         19    18
                        / \    / \
                      15   3  14  4
                     /
                   12

##### For the node at array[i]:
* left child: 2*i + 1
* right child: 2*i + 2
* parent = floor((i-1)/2)

### Insert into Heap:
* Always add new items to the end of the array
* Then we have to fix the heap(heapify)
* We compare the new item against its parent
* If the item is greater than its parent, we swap it with its parent
* We then rinse and repeat