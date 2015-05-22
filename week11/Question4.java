package week11;
class Employee{
	String name;
	int salary;
	public Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String toString(){
		String r = "";
		r += "Name : " + this.name + "\n";
		r += "Salary : " + this.salary;
		return r;
	}
	
}
class Manager extends Employee{
	String department;
	public Manager(String name, int salary, String department){
		super(name,salary);
		this.department = department;
	}
	public String toString(){
		String r = super.toString();
		r += "\n";
		r += "Department : " + department + "\n";
		return r;
	}
}
class Executive extends Manager{
	public Executive(String name, int salary, String department){
		super(name,salary,department);
	}
	public String toString(){
		String r = super.toString();
		r += "This is Executive!\n";
		return r;
	}
}
public class Question4 {

	public static void main(String[] args) {
		Employee e1 = new Employee("John",1000);
		Manager e2 = new Manager("Smith",2000,"Department store");
		Executive e3 = new Executive("KING", 4000, "Department store king");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
