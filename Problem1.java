class Employee {
	public String name;
	public double salary;
	public int byPercent;
	
	public Employee (String employeeName, double currentSalary) {
		name = employeeName;
		salary = currentSalary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double raiseSalary(int byPercent) {
		salary = ((byPercent * salary)*0.01)+salary;
		return salary;
	}
	
	
}

public class Problem1 {

	public static void main(String[] args) {
		Employee Weihao = new Employee("Weihao Qu",50000);
		System.out.println("Employee Name: " + Weihao.getName());
		System.out.println("Employee Salary: " + Weihao.getSalary());
		System.out.println("Raised Salary: "+ Weihao.raiseSalary(10));
	}

}
