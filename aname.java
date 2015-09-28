public class aname
{
	public static boolean inputCorrect=false;
	public static void main(String[] args)
	{
			assign1 driver = new assign1();
			int size = Integer.parseInt(args[1]);
			String alg = args[2];
			String type = args[0];
			inputalg(alg, type);

			if (inputCorrect = false)
			{
				throw new IllegalArgumentException("Error - input was incorrect");
			}
			driver.name(alg, size, type);
			
			
	}
	public static boolean	inputalg(String x, String y)
	{
		if ((x.equalsIgnoreCase("asscending")||x.equalsIgnoreCase("decending")|x.equalsIgnoreCase("random"))&&(y.equalsIgnoreCase("bubblesort")||y.equalsIgnoreCase("insertionsort")||y.equalsIgnoreCase("mergesort")))
		{
			inputCorrect = true;
		}
		return inputCorrect;
	}
}
