/*
* Remove duplicate items from a linked list
* Use JDK LinkedList class
* Use a HashMap
* */
package Hashtables.Challenge2;
import Hashtables.Employee;
import java.util.*;
//(✷‿✷)
public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));
        Map<Integer, Employee> hashMap = new HashMap<Integer, Employee>();

        //employees.forEach(e -> System.out.println(e));
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> rm = new ArrayList<>();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if (hashMap.containsKey(employee.getId())){
                rm.add(employee);
            }
            else {
                hashMap.put(employee.getId(),employee);
            }
        }
        for (Employee employee:rm){
            employees.remove(employee);
        }
        employees.forEach(e -> System.out.println(e));
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
