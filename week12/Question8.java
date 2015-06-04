package week12;

import java.util.Scanner;

public class Question8 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			try{
				System.out.print("Input float : ");
				in.nextFloat();
			}
			catch(Exception e){
				in = new Scanner(System.in);
				try{
					System.out.print("Input float(last chance) : ");
					in.nextFloat();
				}
				catch(Exception e2){
					System.out.println("End");
					break;
				}
			}
		}
	}
}
