* Every node has 0,1 or 2 children
* Children are referred to as left and right child
* In practice, we use binary search trees
* Complete Binary tree: Every level except the last level is completely filled i.e. all of the interior nodes must have
  two children and the last level have to at left as much as possible.
* Full Binary Tree: is also a complete tree but every node has two children at every level.

* Binary Search Tree(BST):
    * Can perform insertion,deletion,and retrievals in O(log n) time
    * The left child always has a smaller value than its parent
    * The right child always has a larger value than its parent
    * This means everything to the left of the root is less than the value of the root, and everything to the right of
      the root is greater than the value of the root.
    * Because of that, we can do a binary search
