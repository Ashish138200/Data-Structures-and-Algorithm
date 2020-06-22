package Hashtables.LinearProbing;
import Hashtables.Employee;
//(✷‿✷)
public class StoredEmployee {
    //We need to store both key and the employee in the hashtable
    public String key; //raw key not the hashed one
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
