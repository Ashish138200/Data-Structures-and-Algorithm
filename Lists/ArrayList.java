package Lists;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Employee> employeeList = new java.util.ArrayList<>();
        employeeList.add(new Employee("Jane","Jones",123));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("John","Doe",4567));
        employeeList.add(new Employee("Mike","Wilson",3245));
        //System.out.println(employeeList.get(1)); //getting element by index
        //System.out.println(employeeList.isEmpty());
        //employeeList.set(1,new Employee("john","Adams",852)); //For modifying
        System.out.println(employeeList.size());
        employeeList.add(3,new Employee("Yo","Yo",741));
        Object[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Object employee : employeeArray) {
            System.out.println(employee);
        }
        System.out.println(employeeList.contains(new Employee("Mary","Smith",22)));
        System.out.println(employeeList.indexOf(new Employee("John","Doe",4567)));
        employeeList.remove(3);
        employeeList.forEach(employee -> System.out.println(employee)); //use of lambda function
    }
}
