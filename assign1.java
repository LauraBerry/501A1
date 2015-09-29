	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Random;

public class assign1
{
	public Random generator = new Random();
	public long startTime;
	public long endTime;
	public  long time;
	public Sorter sorter= new Sorter();
	
	
	public void name (String type, int size, String alg)
	{
		int[] finalArr= new int[size];
		int[] array= new int[size];
		array = arr(size, type, array);

		startTime = System.currentTimeMillis();
		finalArr=sorter.findSort(array, alg, size);
		endTime = System.currentTimeMillis();

		time = endTime - startTime;
		output(time, finalArr);
	}
	
	public int[] arr(int x, String s, int[] a)
	{
		if( s.equalsIgnoreCase("ascending"))
		{
			for (int i=0; i < a.length; i++)
			{
				a[i] = i;
			}
		}
		else if (s.equalsIgnoreCase("decending"))
		{
			int j = x;
			for (int k = 0; k < a.length; k++)
			{
					a[k] = j;
					j--;
			}
				
		}
		else
		{
			for( int i=0; i< a.length; i++)
			{
				a[i] = generator.nextInt(11);					
			}
		}
		return a;			
	}

	
	public void output (long time, int[] a)
	{
		int cnt=sorter.getCount();
		System.out.print("sorted list: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
			System.out.print(", ");
		}
		System.out.println("");
		System.out.print("time: ");
		System.out.println(time);
		System.out.print("count: ");
		System.out.println(cnt);
	}
	
}
