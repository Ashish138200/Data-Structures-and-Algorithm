# Practice of Insertion and Deletion in BST

                                        25
                                      /   \
                                     20    27
                                    / \    / \
                                  15  22  26  30
                                   \          / \
                                   17        29  32

### Insert(28):
                                        25
                                       /  \
                                     20    27
                                    / \    / \
                                  15  22  26  30
                                   \          / \
                                   17        29  32
                                            /
                                           28

### Insert(16):

                                        25
                                       /  \
                                     20    27
                                    / \    / \
                                  15  22  26  30
                                   \          / \
                                    17        29  32
                                   /        /
                                  16       28
### Insert(23):
                                        25
                                       /  \
                                     20    27
                                    / \    / \
                                  15  22  26  30
                                   \   \      / \
                                    17  23   29  32
                                   /        /
                                  16       28
### Insert(14):
                                        25
                                       /  \
                                     20    27
                                    / \    / \
                                  15  22  26  30
                                 /  \   \     / \
                               14   17  23   29  32
                                   /        /
                                  16       28

### Delete(28):
                                        25
                                       /  \
                                     20    27
                                    / \    / \
                                  15  22  26  30
                                 /  \   \     / \
                               14   17  23   29  32
                                   /        
                                  16 
null out 29's left child   

### Delete(22):
                                        25
                                       /  \
                                     20    27
                                    / \    / \
                                  15  23  26  30
                                 /  \         / \
                               14   17       29  32
                                   /        
                                  16    
23 will become the new right child of 20

### Delete(15):
###### Look for the replacement in right subTree i.e. the smallest value
                                        25
                                       /  \
                                     20    27
                                    / \    / \
                                  16  23  26  30
                                 /  \         / \
                               14   17       29  32
                               
### Delete(27):
###### Look for the replacement in right subTree i.e. the smallest value
                                        25
                                       /  \
                                     20    29
                                    / \    / \
                                  16  23  26  30
                                 /  \           \
                               14   17           32
                               
## New Tree:
                                 30
                               /    \
                             20      40        
                            /  \    /  \
                           16  23  34   46
                          /  \           \   
                         14  17          66
                                        / 
                                       60
                                         \
                                         62
### Delete(40):
###### Look for the replacement in right subTree i.e. the smallest value

                                 30
                               /    \
                             20      46       
                            /  \    /  \
                           16  23  34   66
                          /  \          / 
                         14  17        60  
                                        \
                                       62
                                         
