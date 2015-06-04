package week12;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question4 {
	public static void main(String args[]) throws FileNotFoundException{
		String fname;
		Scanner s = new Scanner(System.in);
		System.out.print("Filename: ");
		fname = s.nextLine();
		PrintWriter out = new PrintWriter(fname);
		out.println("Hello, My first program in File");
		out.close();
	}
}
