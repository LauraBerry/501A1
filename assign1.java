	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Random;

public class assign1
{
	public static int w = 0;
	public static int cnt;
	public static int temp;
	public static Random generator = new Random();
	public static int[] a;
	public static int[] sorted;
	public static long startTime;
	public static long endTime;
	public static long time;
	
	
	public static void name (String type, int size, String alg, String ofile)
	{
		arr(size, type);											//create array
		if (alg.equalsIgnoreCase("bubblesort"))
		{
			System.out.println("here");
			startTime = System.currentTimeMillis();
			bubblesort();											//sort array
			endTime = System.currentTimeMillis();
			time = endTime - startTime;
			output(ofile, time);						
		}

		else if (alg.equalsIgnoreCase("insertionsort"))
		{
			startTime = System.currentTimeMillis();
			insertionsort();
			endTime = System.currentTimeMillis();
			time = endTime - startTime;
			output(ofile, time);
		}

		else if(alg.equalsIgnoreCase("mergesort"))
		{
			startTime = System.currentTimeMillis();
			cnt=0;
			mergesort(0, a.length-1);
			endTime = System.currentTimeMillis();
			time = endTime - startTime;
			output(time);
		}
		
	}
	
	public static void arr(int x, String s)
	{
		a= new int[x];								//make a new array of the size indicated
		if( s.equalsIgnoreCase("asscending"))
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
			for( int i=0; i< a.length; i++)
			{
				a[i] = generator.nextInt(11);					
			}													
	}

	public static void bubblesort()
	{	cnt=0;
		for(int i= 0; i < a.length-1; i++)
		{
			for (int j = a.length-1;j>i; j--)
			{
				if (a[j] < a[j-1])
				{
					int tmp = a[j-1];
					a[j-1]= a[j];
					a[j] = tmp;
					cnt++;
				}
			}		
		}
	} 


	public static void insertionsort()
	{
		cnt = 0;
		for (int i =1, j; i< a.length; i++)
		{
			int tmp = a[i];
			for(j=i; j>0 && tmp < a[j-1]; j--)
			{
				a[j] = a[j-1];
				cnt++;
			}
			a[j] = tmp;
		}
	}

	public static void mergesort( int begin, int end)
	{
		
		int n = end-begin +1;
		if (n>1)
		{
			int begin1 = begin;
			int end1 = begin + (end-begin)/2;
			int begin2 = end1+1;
			int end2 = end;
			cnt++;
			mergesort(begin1, end1);
			mergesort(begin2, end2);
			merge(begin1, end1, begin2, end2);
		}
	}
		
	public static void merge( int begin1, int end1, int begin2, int end2)
	{
		int n1= end1-begin1 +1;
		int n2= end2-begin2+1;
		int[] tmp = new int[n1+n2];
		int i1 = begin1;
		int i2=begin2;
		int i;
		for( i=0; i < n1+n2&& i1<=end1 && i2<=end2; i++)
		{
			if (a[i1] < a[i2])
			{
				tmp[i] = a[i1];
				i1++;
			}
			else
			{
				tmp[i] = a[i2];
				i2++;
			}
		}
		for(;i1<=end1;i1++)
			tmp[i++]=a[i1];
		for(;i2<=end2;i2++)
			tmp[i++]=a[i2];
		for(i=0;i<n1+n2;i++)
			a[begin1+i]=tmp[i];
		
	}
	
	public static void output(String y, long time)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(time);
		System.out.println(cnt);

		/*try
		{
	 		BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			for (int i=0; i<a.length; i++)
			{
	 			out.write("%d\n", a[i]);
			}
			out.write(("the time taken to sort was: %d", time));
			out.close();
		}
		catch(Exception e)
		{
				if(!y.exists())
			{
				System.out.println("file does not exist");
				return 0;
			}
		}*/
	}
	
	public static void output (long time)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("");
		System.out.println(time);
		System.out.println(cnt);
	}
}