package week_13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class ExceptionLineTooLong extends Exception{
	public ExceptionLineTooLong(String msg){
		super(msg);
	}
	
}
public class Question5 {
	public static void main(String args[]) throws FileNotFoundException, ExceptionLineTooLong{
		FileReader reader = null;
		try{
			reader = new FileReader("asdf.txt");
		}
		catch(FileNotFoundException e){
			System.out.println("File not found.");
			return;
		}
		Scanner s = new Scanner(reader);
		String ss = "";
		while(s.hasNext()){
				ss = s.nextLine();
				if(ss.length() >= 80)
					throw new ExceptionLineTooLong("The strings is too long");
				System.out.println(ss);
		}
	}
}
