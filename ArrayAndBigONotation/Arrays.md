* Contiguous block in memory.
* Static length.
* Every element occupies the same amt of space in memory.
* When you're working with objects(strings) whats stored in the variable is the object reference.
* Calculating the memory address of xth element in an array:
    * y = size of each element
    * i = index
    * Memory address = x+i*y
* Memory efficient if we know the index, TC: O(1)
* Searching an element in array if we dunno the index then the worst case for finding the element is nth position
  so, the TC: O(n)
* Add an element to a full array: O(n)
* Add an element to the end of an array(has spaces): O(1)
* Insert update an element at a specific index: O(1)
* Deleting an element by setting it to null: O(1)
* Deleting an element by shifting elements: O(n) [front of an array]
* if the code requires a loop = linear time
* if the code doesn't requires a loop = constant time
