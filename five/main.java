package assignment.five;

public class Employee {

    String name;
    int id;

    public Employee(String name, int age) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee employee = (Employee) obj;
        return employee.getId() == this.getId()
                && employee.getName() == this.getName();
    }

       
     @Override
        public int hashCode() {
            int result=17;
            result=31*result+id;
            result=31*result+(name!=null ? name.hashCode():0);
            return result;
        }
     
}

driver class main......

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee("aditya", 22);
        Employee employee1 = new Employee("lala", 22);
        Employee employee2 = new Employee("aditya", 25);

        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        System.out.println(employees.contains(employee2));
        System.out.println("employee.hashCode():  " + employee.hashCode()
        + "  employee2.hashCode():" + employee2.hashCode());
    }
}