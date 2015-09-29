public class Sorter
{

	public int cnt=0;	
	
	public int[] findSort(int[] unsortedArray, String sortType, int size)
	{
		if (sortType.equalsIgnoreCase("bubblesort"))
		{
			unsortedArray=bubblesort(unsortedArray);															
		}

		else if (sortType.equalsIgnoreCase("insertionsort"))
		{
			unsortedArray=insertionsort(unsortedArray);
		}

		else if(sortType.equalsIgnoreCase("mergesort"))
		{
			unsortedArray=mergesort(0, size-1, unsortedArray);
		}
		return unsortedArray;
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

	public int getCount()
	{
		return cnt;
	}
}
