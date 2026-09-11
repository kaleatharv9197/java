package employeemanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyHr {

    ArrayList<Department> department;

    Scanner sc = new Scanner(System.in);

    public CompanyHr() {

        department = new ArrayList<Department>();
    }

    public void adddepartment() {

        System.out.println("Enter Department Name");

        String dname = sc.next();

        Department d = new Department(dname);

        department.add(d);

        System.out.println("Department Added Successfully");
    }

    public void displayAll() {

        if (department.isEmpty()) {

            System.out.println("No Department Found");

            return;
        }

        for (Department d : department) {

            System.out.println(d);
        }
    }

    public void addEmpToDept() {

        System.out.println("Enter The Name Of Department");

        String dname = sc.next();

        for (Department d : department) {

            if (d.getDeptName().equalsIgnoreCase(dname)) {

                System.out.println("1. Employee");
                System.out.println("2. Manager");

                int ch = sc.nextInt();

                System.out.println("Enter Name Of Employee");

                String name = sc.next();

                System.out.println("Enter Salary");

                double sal = sc.nextDouble();

                if (ch == 1) {

                    Employee e = new Employee(ch, name, sal);

                    d.addEmployee(e);

                    System.out.println("Employee Added Successfully");

                    return;
                }

                else if (ch == 2) {

                    System.out.println(
                            "Enter Department Name For Manager");

                    String deptname = sc.next();

                    Employee e =
                            new Manager(name, sal, deptname);

                    d.addEmployee(e);

                    System.out.println("Manager Added Successfully");

                    return;
                }

                else {

                    System.out.println("Invalid Choice");

                    return;
                }
            }
        }

        System.out.println(
                "Department With Given Name Not Found");
    }

    public void removeEmpfromDept() {

        System.out.println("Enter Department Name");

        String dname = sc.next();

        for (Department d : department) {

            if (d.getDeptName().equalsIgnoreCase(dname)) {

                System.out.println("Enter Employee Id");

                int id = sc.nextInt();

                d.removeEmployee(id);

                return;
            }
        }

        System.out.println(
                "Department With Given Name Not Found");
    }

    public void displayDepartmentEmployees() {

        System.out.println("Enter Department Name");

        String dname = sc.next();

        for (Department d : department) {

            if (d.getDeptName().equalsIgnoreCase(dname)) {

                d.displayAll();

                return;
            }
        }

        System.out.println(
                "Department With Given Name Not Found");
    }

    public void raiseEmployee() {

        System.out.println("Enter Department Name");

        String dname = sc.next();

        for (Department d : department) {

            if (d.getDeptName().equalsIgnoreCase(dname)) {

                System.out.println("Enter Employee Id");

                int id = sc.nextInt();

                for (Employee e : d.getEmployee()) {

                    if (e.getId() == id) {

                        System.out.println(
                                "Enter Raise Percentage");

                        int percentage = sc.nextInt();

                        e.setRaise(percentage);

                        e.applyRaise();

                        return;
                    }
                }

                System.out.println(
                        "Employee With Given Id Not Found");

                return;
            }
        }

        System.out.println(
                "Department With Given Name Not Found");
    }
}