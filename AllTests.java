import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;


public class AllTests
{
	@Test
	public void testInuptChecks()
	{
		assertEquals(true, aname.inputalg ("ascending", "bubblesort"));
		assertEquals(true, aname.inputalg ("random", "bubblesort"));
		assertEquals(true, aname.inputalg ("decending","bubblesort"));
		
		assertEquals(true, aname.inputalg ("ascending", "insertionsort"));
		assertEquals(true, aname.inputalg ("random", "insertionsort"));
		assertEquals(true, aname.inputalg ("decending","insertionsort"));

		assertEquals(true, aname.inputalg ("ascending", "mergesort"));
		assertEquals(true, aname.inputalg ("random", "mergesort"));
		assertEquals(true, aname.inputalg ("decending","mergesort"));
	}
	
	@Test
	public void testFindSort()
	{
		assertArrayEquals(new int[] {1,2,3}, Sorter.findSort(new int[] {3,2,1},"bubblesort",2));
		assertArrayEquals(new int[] {1,2,3}, Sorter.findSort(new int[] {3,2,1},"insertionsort",2));
		assertArrayEquals(new int[] {1,2,3}, Sorter.findSort(new int[] {3,2,1},"mergesort",2));
	}
	

	@Test
	public void testSortingAlgsDecending()
	{
		assertArrayEquals(new int[] {1,2,3}, Sorter.bubblesort(new int[] {3,2,1}));
		assertArrayEquals(new int[] {1,2,3}, Sorter.insertionsort(new int[] {3,2,1}));
		assertArrayEquals(new int[] {1,2,3}, Sorter.mergesort(0,1,new int[] {3,2,1}));
	}

	@Test
	public void testSortingAlgsAscending()
	{
		assertArrayEquals(new int[] {1,2,3}, Sorter.bubblesort(new int[] {1,2,3}));
		assertArrayEquals(new int[] {1,2,3}, Sorter.insertionsort(new int[] {1,2,3}));
		assertArrayEquals(new int[] {1,2,3}, Sorter.mergesort(0,1,new int[] {1,2,3}));
	}
	
	@Test
	public void testSortingAlgsNoOrder()
	{
		assertArrayEquals(new int[] {1,2,3}, Sorter.bubblesort(new int[] {3,1,2}));
		assertArrayEquals(new int[] {1,2,3}, Sorter.insertionsort(new int[] {3,1,2}));
		assertArrayEquals(new int[] {1,2,3}, Sorter.mergesort(0,1,new int[] {3,1,2}));
	}

	@Test
	public void testDuplicates()
	{
		assertArrayEquals(new int[] {1,1,3}, Sorter.bubblesort(new int[] {3,1,1}));
		assertArrayEquals(new int[] {1,1,3}, Sorter.insertionsort(new int[] {3,1,1}));
		assertArrayEquals(new int[] {1,1,3}, Sorter.mergesort(0,1,new int[] {3,1,1}));
	}

	@Test
	public void testArrayBuilder()
	{
		assertArrayEquals(new int[] {1,2,3}, assign1.arr(2,"ascending", new int[] {}));
		assertArrayEquals(new int[] {3,2,1}, assign1.arr(2,"decending", new int[] {}));
	}



	
}
