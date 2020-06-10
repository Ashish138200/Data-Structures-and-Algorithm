/*
 * Vectors are synchronised
 * Overhead comes with sync
 * Vector is thread safe
 * Slower implementation
*/
package Lists;
import java.util.List;
//(✷‿✷)
public class Vectors {
    public static void main(String[] args) {
        List<Employee> employeeList = new java.util.Vector<>();
        employeeList.add(new Employee("Jane","Jones",123));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("John","Doe",4567));
        employeeList.add(new Employee("Mike","Wilson",3245));

        employeeList.forEach(employee -> System.out.println(employee)); //use of lambda function
    }
}
