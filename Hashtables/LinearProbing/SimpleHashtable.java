package Hashtables.LinearProbing;
import Hashtables.Employee;
//(✷‿✷)
/*
* Open Addressing: If we try to put an employee in the table and we find out that there is already an employee at the
  slot where we wanted to put the new employee then we look for another position in the array
* Linear Probing: When we discover that a position for a hashed key value is already occupied then we increment the
  hashedKey value by 1 then we check the resulting index . It's called LP because each time we increment index we're
  doing it in linear fashion
  * Probe: Every increment of the index
* */
public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey; // we need to know when to stop looking
            //Creating the value for the first probe
            if (hashedKey == hashtable.length - 1) { //Wrapping
                hashedKey = 0;
            }
            else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) { //looping the probe value
                //set the next probe value and wrapping too
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (occupied(hashedKey)) {
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        }
        else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        } else {
            Employee employee = hashtable[hashedKey].employee;
            hashtable[hashedKey] = null;
            return employee;
        }
    }
    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null; // no employee with the we're looking for
        }
        return hashtable[hashedKey].employee;
    }
    //Hashing()
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        //If the employee stored at the hashed key index was added with the key that we're interested in
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        //First Probe
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        }
        else {
            hashedKey++;
        }
        //!hashtable[hashedKey].key.equals(key): and key at the hashtable hashedKey also not the one we're looking for
        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        // Update to avoid null pointer exception
        if (hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else{
            return -1;
        }

    }
    //Checks whether the given position is occupied or not
    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            }
            else {
                System.out.println("Position " + i + ": " +hashtable[i].employee);
            }
        }
    }

}
