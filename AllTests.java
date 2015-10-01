import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AllTests
{
	@Test
	public void testInuptChecks()
	{
		assertEquals(true, aname.inputalg ("ascending"));
		assertEquals(true, aname.inputalg ("random"));
		assertEquals(true, aname.inputalg ("decending"));
		
		assertEquals(true, aname.intype ("bubblesort"));
		assertEquals(true, aname.inputalg ("insertionsort"));
		assertEquals(true, aname.inputalg ("mergesort"));
	}
	
	@Test
	public void testFindSort()
	{
		assertEqualls([1,2,3], Sorter.findSort([3,2,1],"bubblesort",2));
		assertEqualls([1,2,3], Sorter.findSort([3,2,1],"insertionsort",2));
		assertEqualls([1,2,3], Sorter.findSort([3,2,1],"mergesort",2));
	}
	

	@Test
	public void testSortingAlgsDecending()
	{
		assertEquals([1,2,3], Sorter.bubblesort([3,2,1]));
		assertEquals([1,2,3], Sorter.insertionsort([3,2,1]));
		assertEquals([1,2,3], Sorter.mergesort(0,1,[3,2,1]));
	}

	@Test
	public void testSortingAlgsAscending()
	{
		assertEquals([1,2,3], Sorter.bubblesort([1,2,3]));
		assertEquals([1,2,3], Sorter.insertionsort([1,2,3]));
		assertEquals([1,2,3], Sorter.mergesort(0,1,[1,2,3]));
	}
	
	@Test
	public void testSortingAlgsNoOrder()
	{
		assertEquals([1,2,3], Sorter.bubblesort([3,1,2]));
		assertEquals([1,2,3], Sorter.insertionsort([3,1,2]));
		assertEquals([1,2,3], Sorter.mergesort(0,1,[3,1,2]));
	}

	@Test
	public void testDuplicates()
	{
		assertEquals([1,1,3], Sorter.bubblesort([3,1,1]));
		assertEquals([1,1,3], Sorter.insertionsort([3,1,1]));
		assertEquals([1,1,3], Sorter.mergesort(0,1,[3,1,1]));
	}

	@Test
	public void testArrayBuilder()
	{
		assertEquals([1,2,3], assign1.arr(2,"ascending", []));
		assertEquals([3,2,1], assign1.arr(2,"decending", []));
	}



	
}
