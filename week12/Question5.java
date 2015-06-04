package week12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) throws FileNotFoundException {
		int dCount, wCount;
		FileReader reader = new FileReader("asdf");
		Scanner s = new Scanner(reader);
		Scanner stdin = new Scanner(System.in);
		String d = s.nextLine().trim();
		
		if(d.isEmpty()){dCount = 0; wCount =0;}
		else{
			wCount = d.split("\\s+").length;
			dCount = d.length();
		}
		System.out.println(String.format("Words : %d\nCharacters : %d",wCount, dCount));
		System.out.print("Read file name: ");
		String fname = stdin.nextLine();
		reader = new FileReader(fname);
		s.close();
		s = new Scanner(reader);
		d = s.nextLine().trim();
		
		if(d.isEmpty()){dCount = 0; wCount =0;}
		else{
			wCount = d.split("\\s+").length;
			dCount = d.length();
		}
		System.out.println(String.format("Words : %d\nCharacters : %d",wCount, dCount));
		
		s.close();
		stdin.close();
	}

}
