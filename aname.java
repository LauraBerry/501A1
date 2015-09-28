public class aname
{
	public static boolean bool;
	public static boolean iean;
	public static void main(String[] args)
	{
			assign1 driver = new assign1();
		 	String ofile =args[3];
			int size = Integer.parseInt(args[1]);
			String alg = args[2];
			String type = args[0];
			inputalg(alg);
			intype(type);

			if (bool = false)
			{
				throw new IllegalArgumentException("Error - that is not a valid sorting method");
			}
			if(iean = false)
			{
				throw new IllegalArgumentException("Error - that is not a valid algorithm name");
			}
			if (size <=0)
			{
				throw new NumberFormatException("Error- the size of the array must be bigger than zero");
			}
			driver.name(alg, size, type, ofile);
			
			
	}
	public static boolean	inputalg(String x)
	{
		if (x.equalsIgnoreCase("asscending"))
		{
			bool = true;
		}
		else if (x.equalsIgnoreCase("decending"))
		{
			bool = true;
		}
		else if (x.equalsIgnoreCase("random"))
		{
			bool = true;
		}
		else
			bool = false;
		return bool;
	}


	public static boolean intype( String y)
	{
		if (y.equalsIgnoreCase("bubblesort"))
		{
			iean = true;
		}
		else if (y.equalsIgnoreCase("insertionsort"))
		{
			iean = true;
		}
		else if (y.equalsIgnoreCase("mergesort"))
		{
			iean = true;
		}
		else
			iean = false;
		return iean;
	}
}
