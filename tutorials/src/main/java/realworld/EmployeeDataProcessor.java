package realworld;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDataProcessor
{
    List<Employee> employees = Arrays.asList(
            new Employee("Alice", 25),
            new Employee("Bob", 35),
            new Employee("Charlie", 30),
            new Employee("David", 40)
    );
//    Given a list of employees, filter employees older than 30,
//    map their names to a list, and sort the names alphabetically.
    public void processData(){
       List<String> names = employees.stream().filter(employee -> employee.getAge()>=30).map(Employee::getName).sorted().collect(Collectors.toList());
       for (String name : names){
           System.out.println(name);
       }
    }

    public static void main(String[] args) {
        EmployeeDataProcessor processor = new EmployeeDataProcessor();
        processor.processData();
    }
}
