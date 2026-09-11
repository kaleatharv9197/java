package employeemanagementsystem;

public class Employee {
		static int idGenerator=1000;
		int id;
		String name;
		double salary;
		static int empcount=0;
		static double raiseprecentage;
		
	
public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
public Employee(int id, String name, double salary) {
			super();
			this.id = idGenerator++;
			this.name = name;
			this.salary = salary;
			empcount++;
		}
public void displayEmployee() {
	System.out.println("Employee Id:"+ id);
	System.out.println("name:"+this.name );
	System.out.println("salary:"+ this.salary );
	
}
public static void displayTotalEmployee() {
	System.out.println("Total no Employee:"+empcount);
}
public void setRaise(int amt) {
	raiseprecentage=amt;
}
public void applyRaise() {
	double hike =salary+(raiseprecentage/100);
	salary=salary+hike;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
