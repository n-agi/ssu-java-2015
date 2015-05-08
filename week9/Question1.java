package week09;
class Quiz implements Measurable{
	private double grade;
	public Quiz(double grade){
		if(grade > 4.5 || grade < 0.0)
			throw new IllegalArgumentException("Not valid grade");
		this.grade = grade;

	}
	public double getMeasure(){
		return grade;
	}
	public String toString(){
		String r = "";
		r += String.valueOf(this.grade);
		r += "(";
		r += Question1.get(this.grade);
		r += ")";
		return r;
	}
}
public class Question1 {

	public static String get(double grade){
		if(grade == 4.5){
			return "A+";
		}
		else if(grade >= 4.0 && grade < 4.5){
			return "A";
		}
		else if(grade >= 3.5 && grade < 4.0){
			return "B+";
		}
		else if(grade >= 3.0 && grade < 3.5){
			return "B";
		}
		else if(grade >= 2.5 && grade < 3.0){
			return "C+";
		}
		else if(grade >= 2.0 && grade < 2.5){
			return "C";
		}
		else return "F";
	}
	public static void main(String[] args) {
		DataSet d = new DataSet();
		d.add(new Quiz(4.5));
		d.add(new Quiz(4.0));
		System.out.println("Average : " + d.getAverage()+"("+get(d.getAverage())+")");
		Quiz max = (Quiz) d.getMaximum();
		System.out.println("Highest : " + max.toString());

	}

}
