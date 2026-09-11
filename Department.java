package employeemanagementsystem;

import java.util.ArrayList;

public class Department {

    String deptName;

    ArrayList<Employee> employee;

    public Department(String deptName) {

        this.deptName = deptName;

        this.employee = new ArrayList<Employee>();
    }

    public String getDeptName() {

        return deptName;
    }

    public void setDeptName(String deptName) {

        this.deptName = deptName;
    }

    public void addEmployee(Employee e) {

        employee.add(e);

        System.out.println("Employee Added Successfully");
    }

    public void removeEmployee(int id) {

        for (int i = 0; i < employee.size(); i++) {

            Employee e = employee.get(i);

            if (e.getId() == id) {

                employee.remove(i);

                Employee.empcount--;

                System.out.println("Employee Removed Successfully");

                return;
            }
        }

        System.out.println("Employee With Given Id Not Found");
    }

    public void displayAll() {

        if (employee.isEmpty()) {

            System.out.println("No Employee Found");

            return;
        }

        for (Employee e : employee) {

            System.out.println(e);
        }
    }

    public ArrayList<Employee> getEmployee() {

        return employee;
    }

    @Override
    public String toString() {

        return "Department [deptName=" + deptName
                + ", employee=" + employee + "]";
    }
}