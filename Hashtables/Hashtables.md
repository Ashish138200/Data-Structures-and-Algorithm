(✷‿✷)
* Abstract Data type
* Provide access to data using keys
* Key doesn't have to be an integer
* Consists of key/value pairs-Data types don't have to match
* Optimized for retrieval(When you know the key)
* Associative array(Maps,Dictionary,Lookup tables) is one type of hashtable

* Hashing<br/>
    * Maps keys of any data type to an integer
    * Hash function maps keys to int
    * In java, hash function is Object.hashCode()
    * Collision occurs when more than one value has the same hashed value
    * keys are converted to integer because hashtable is backed by an array

* Load Factor
    * Tells us how full a hash table is
    * Load factor = no. of items/capacity = size/capacity
    * Load factor is used to decide when to resize the array backing the hash table
    * Don't want load factor too low(lots of empty spaces)
    * Don't want load factor too high(will increase the likelihood of collisions)
    * can play a role in determining the time complexity for retrieval.

* Add to a Hash Table backed by an array
    * Provide a key/value pair
    * Use a hash function to hash the key to an int
    * Store the value at the hashed key value - this is the index into the array

* Retrieve a value from a Hash Table
    * Provide a key
    * Use a hash function to hash the key to an int
    * Retrieve the value stored at the hashed key value

* Load factor and Hashing() are going to influence the TC if the load factor is really high then
  adding an item you'll get more collisions and for retrieval TC will get degrade. You might not able to achieve
  constant time.
