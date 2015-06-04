package week12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question6{
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("babynames.txt");
		Scanner s = new Scanner(reader);
		String data;
		ArrayList<String> boy = new ArrayList<String>();
		ArrayList<String> girl = new ArrayList<String>();
		
		while(s.hasNext()){
			int idx = s.nextInt();
			for(int i = 0 ; i <2 ; i++){
				String name = s.next();
				int a = s.nextInt();
				Double b = s.nextDouble();

				if(i == 0){
					boy.add(String.format("%d %s %d %.4f",idx,name,a,b));
				}
				else{
					girl.add(String.format("%d %s %d %.4f",idx,name,a,b));
				}
			}
		}
		PrintWriter out1 = new PrintWriter("boynames.txt");
		PrintWriter out2 = new PrintWriter("girlnames.txt");
		for(String t : boy){
			out1.println(t);
		}
		for(String t : girl){
			out2.println(t);
		}
		out1.close();
		out2.close();
	}
}
