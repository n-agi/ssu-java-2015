package week10;

import java.awt.Rectangle;

class AnotherRectangle extends Rectangle{
	@Override
	public boolean equals(Object obj)
	{
		AnotherRectangle obj2 = (AnotherRectangle)obj;
		if(this.width == obj2.width && this.height == obj2.height) return true;
		else return false;
	}
	public AnotherRectangle(int width, int height){
		super(width,height);
	}
}
public class Question1 {

	public static void main(String[] args) {
		AnotherRectangle r1= new AnotherRectangle(3,4);
		AnotherRectangle r2= new AnotherRectangle(3,4);
		AnotherRectangle r3= new AnotherRectangle(5,6);
		System.out.println("r1.equals(r2):"+r1.equals(r2));
		System.out.println("r1.equals(r3):"+r1.equals(r3));
		System.out.println("r1==r2: "+(r1==r2));

	}

}
