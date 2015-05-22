package week11;
class MyPerson{
	private String name;
	private int year;
	public MyPerson(String name, int year){
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	@Override
	public String toString(){
		String r = "";
		r+= "Name : " + this.getName()+"\n";
		r+= "year : " + this.getYear()+"\n";
		return r;
	}
	
}
class Student extends MyPerson{
	String major;
	public Student(String name, int year, String major){
		super(name, year);
		this.major = major;
	}
	@Override
	public String toString(){
		String r = "";
		r+= "Name : " + this.getName()+"\n";
		r+= "year : " + this.getYear()+"\n";
		r+= "major : " + this.major+"\n";
		return r;
	}
}
class Instructor extends MyPerson{
	int salary;
	public Instructor(String name, int year, int salary){
		super(name, year);
		this.salary = salary;
	}
	@Override
	public String toString(){
		String r = "";
		r+= "Name : " + this.getName()+"\n";
		r+= "year : " + this.getYear()+"\n";
		r+= "salary : " + this.salary+"\n";
		return r;
	}
}
public class Question3 {

	public static void main(String[] args) {
		MyPerson p1 = new MyPerson("John",1995);
		System.out.println(p1);
		Student p2 = new Student("John",1995,"Computer");
		System.out.println(p2);
		Instructor p3 = new Instructor("John",1995,5000);
		System.out.println(p3);
	}

}
