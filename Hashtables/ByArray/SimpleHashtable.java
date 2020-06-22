package Hashtables.ByArray;
import Hashtables.Employee;
//(✷‿✷)
public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    // add value to hashtable
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key); //Hashing
        if (hashtable[hashedKey] != null) { // handling collisions
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        }
        else { // assigning the employee int hashtable at hashedKey position
            hashtable[hashedKey] = employee;
        }
    }
    //retrieval
    public Employee get(String key) {
        int hashedKey = hashKey(key); //Hashing
        return hashtable[hashedKey]; // O(1)
    }
    //Hashing Function and it's private because we don't need to expose it to the world
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
