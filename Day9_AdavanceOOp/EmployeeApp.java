package Day9_AdavanceOOp;
class employee {
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id  = id;
	}
	public String getNmae() {
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
}
public class EmployeeApp {
	public static void main(String[] args) {
		employee e1 = new employee();
		e1.setId(12);
		e1.setName("Ram");
		e1.setSalary(75000.00);
		System.out.println("Id : " + e1.getId());
		System.out.println("Name : " + e1.getNmae());
		System.out.println("Salary : " + e1.getSalary());
	}
}
