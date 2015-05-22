package week11;

public class Question5 {

	public static void main(String[] args) {
		DataSet d = new DataSet();
		d.add("ABCD");
		d.add("ABCDE");
		d.add("DCBA");
		System.out.println(d.getMaximum());
		System.out.println(d.getMinimum());
	}

}
