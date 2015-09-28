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
	
}