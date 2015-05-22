package week11;
class Person
{
   private String firstName;
   private String lastName;
   private int age;

   public Person (String newFirstName, String newLastName, int newAge)
   {
      firstName = newFirstName;
      lastName = newLastName;
      age = newAge;
   }
   
   public String getFirstName() 
   {
       return firstName;
   }
   
   public String getLastName() 
   {
       return lastName;
   }
   
   public int getAge() 
   {
       return age;
   }
   @Override
   public boolean equals(Object obj){
	   Person casted = (Person) obj;
	   if(casted.getFirstName() == this.getFirstName() && casted.getLastName() == this.getLastName() && casted.getAge() == this.getAge())
		   return true;
	   else return false;
   }
}

public class Question2 {

	public static void main(String[] args) {
		Person p1=new Person("Smith","John", 21);
		Person p2=new Person("Smith","John", 22);
		Person p3=new Person("Smith","John", 21);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}

}
