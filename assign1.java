	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Random;

public class assign1
{
	public int cnt=0;
	public Random generator = new Random();
	public int[] sorted;
	public long startTime;
	public long endTime;
	public  long time;
	
	
	public void name (String type, int size, String alg)
	{
		int[] finalArr= new int[size];
		int[] array= new int[size];
		array = arr(size, type, array);
		startTime = System.currentTimeMillis();											//create array
		if (alg.equalsIgnoreCase("bubblesort"))
		{
			finalArr=bubblesort(array);															
		}

		else if (alg.equalsIgnoreCase("insertionsort"))
		{
			finalArr=insertionsort(array);
		}

		else if(alg.equalsIgnoreCase("mergesort"))
		{
			finalArr=mergesort(0, size-1, array);
		}
		endTime = System.currentTimeMillis();
		time = endTime - startTime;
		output(time, finalArr);
		
	}
	
	public int[] arr(int x, String s, int[] a)
	{
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
		{
			for( int i=0; i< a.length; i++)
			{
				a[i] = generator.nextInt(11);					
			}
		}
		return a;			
	}

	public int[] bubblesort(int[] a)
	{
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
		return a;
	} 


	public int[] insertionsort(int[] a)
	{
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
		return a;
	}

	public int[] mergesort( int begin, int end, int[] a)
	{
		int n = end-begin +1;
		if (n>1)
		{
			int begin1 = begin;
			int end1 = begin + (end-begin)/2;
			int begin2 = end1+1;
			int end2 = end;
			cnt++;
			mergesort(begin1, end1, a);
			mergesort(begin2, end2, a);
			a = merge(begin1, end1, begin2, end2, a);
		}
		return a;
	}
		
	public int [] merge( int begin1, int end1, int begin2, int end2, int[] a)
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
		return tmp;
	}
	
	public void output (long time, int[] a)
	{
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
