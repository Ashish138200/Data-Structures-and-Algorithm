## Heaps-Sort
###### MaxHeap
* We know the root has the largest value
* Swap the root with last element in the array
* Heapify the tree, but exclude the last node
* After heapify, second largest element is at the root
* Rinse and repeat

#
      0    1    2    3    4    5    6    7
    | 80 | 75 | 60 | 68 | 55 | 40 | 52 | 67 | 
    
    lastHeapIndex = 7
    Swap heap[0] with [lastHeapIndex]
    
          0    1    2    3    4    5    6    7
        | 67 | 75 | 60 | 68 | 55 | 40 | 52 | 80 | 
        
                Now heapify by looking down the tree:
                0    1    2    3    4    5    6    7
             | 75 | 68 | 60 | 67 | 55 | 40 | 52 | 80 | 
        
        
           0    1    2    3    4    5    6    7
        | 52 | 68 | 60 | 67 | 55 | 40 | 75 | 80 |  
            
        lastHeapIndex = 6
        Swap heap[0] with [lastHeapIndex]
                
                Now, heapify by looking down tree:
                   0    1    2    3    4    5    6    7
                | 68 | 67 | 60 | 52 | 55 | 40 | 75 | 80 | 
        
           0    1    2    3    4    5    6    7
        | 68 | 67 | 60 | 52 | 55 | 40 | 75 | 80 |         
        lastHeapIndex = 5
        Now third largest value is at root
        Rinse and repeat