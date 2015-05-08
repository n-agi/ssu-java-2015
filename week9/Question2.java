package week09;

class Person implements Measurable{
	private double height;
	private String name;
	public Person(double height, String name){
		this.height = height;
		this.name = name;
	}
	public double getMeasure(){
		return height;
	}
	public String toString(){
		String r = "";
		r += String.valueOf(this.height);
		r += "(";
		r += this.name;
		r += ")";
		return r;
	}
}
public class Question2 {

	public static void main(String[] args) {
		DataSet d = new DataSet();
		d.add(new Person(170.0, "John"));
		d.add(new Person(180.0, "Yap C."));
		System.out.println("Average : " + d.getAverage());
		Person max = (Person) d.getMaximum();
		System.out.println("Tallest : " + max.toString());
	}

}
