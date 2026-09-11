package employeemanagementsystem;

public class Manager extends Employee {
String deptName;

public Manager( String name, double salary, String deptName) {
	super(empcount, name, salary);
	this.deptName = deptName;
}
@Override
public void displayEmployee() {
	System.out.println("Employee Id:"+ id);
	System.out.println("name:"+this.name );
	System.out.println("salary:"+ this.salary );
	System.out.println("deptName:"+ this.deptName);
	

	}
}
