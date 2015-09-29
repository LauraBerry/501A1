import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AllTests
{
	@Test
	public void testInuptChecks()
	{
		assertEquals(true, aname.inputalg ("asscending"));
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
	public void testSortingAlgs()
	{
		assertEquals([1,2,3], Sorter.bubblesort([3,2,1]));
		assertEquals([1,2,3], Sorter.insertionsort([3,2,1]));
		assertEquals([1,2,3], Sorter.mergesort(0,1,[3,2,1]));
	}

	@Test
	public void testArrayBuilder()
	{
		assertEquals([1,2,3], assign1.arr(2,"asscending", []));
		assertEquals([3,2,1], assign1.arr(2,"decending", []));
	}



	
}
