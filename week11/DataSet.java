package week11;
/**
   Computes the average of a set of data values.
*/
public class DataSet
{
   private Comparable<String> maximum;
   private int count;
   private Comparable<String> minimum;

   /**
      Constructs an empty data set.
   */
   public DataSet()
   {
      count = 0;
      maximum = null;
      minimum = null;
   }

   /**
      Adds a data value to the data set.
      @param x a data value
   */
   public void add(Comparable<String> x)
   {
      if (count == 0 || maximum.compareTo(x.toString()) < 0 )
         maximum = x;
      if (count == 0 || minimum.compareTo(x.toString()) > 0 )
    	 minimum = x;
      count++;
   }

   /**
   Gets the largest of the added data.
   @return the maximum or 0 if no data has been added
    */
	public Comparable<String> getMaximum()
	{
	   return maximum;
	}   /**
	Gets the largest of the added data.
	@return the maximum or 0 if no data has been added
	*/
	public Comparable<String> getMinimum()
	{
	return minimum;
	}
}





