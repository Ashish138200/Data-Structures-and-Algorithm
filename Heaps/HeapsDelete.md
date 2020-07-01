## Heaps - Delete
* Must choose a replacement value.
* Will take the rightmost value, so that the tree remains complete.
* Then we must heapify the heap.
* When replacement value is greater than parent, fix heap above. Otherwise, fix heap below.
* **Fix heap above** - same as insert. Swap replacement value with parent.
* **Fix heap below** - swap the replacement value with the larger of its two children.
* Rinse and repeat in both cases until the replacement value is in its correct position.
* Will only need to fix up or down, not both
#
                    80
                   /  \
                 75    60
                /  \  /  \
              68  55  40  52
              /
             67
    Delete(75) : Replacement value is 67 
                   
                        80
                       /  \
                     67    60
                    /  \  /  \
                  68  55  40  52
                     
                     Heapify

                        80
                       /  \
                     68    60
                    /  \  /  \
                  67  55  40  52                 
     