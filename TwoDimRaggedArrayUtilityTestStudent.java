
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet3 = {{ 7.2, 2.5, 9.3, 4.8 }, {5.9}, { 8.1, 1.7, 3.3 }, { 11.6, 6.9, 7.3, 2.7 }};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(5.9,TwoDimRaggedArrayUtility.getRowTotal(dataSet3,1),.001);
	}
	
	/**
	 * Test getTotal method
	 * Returns the total of all the elements in two dimensional array
	 * 
	 */
	@Test
	
	public void testGetTotal() {
		
		assertEquals(71.3,TwoDimRaggedArrayUtility.getTotal(dataSet3),.001);
	}
	
	/**
	 * Test lowestInRowIndex method
	 * 
	 * Returns the index of the lowest element in the specified row.
	 * 
	 */
	@Test
	
	public void testGetLowestInRowIndex() {
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet3, 0),.001);
	}
	
	/**
	 * Test getHighestInArray method
	 * 
	 * Returns the highest element in two-dimensional array
	 * 
	 */
	@Test
	
	public void testGetHighestInArray() {
		assertEquals(11.6, TwoDimRaggedArrayUtility.getHighestInArray(dataSet3),.001);
	}
	
	/**
	 * Test getLowestArray method
	 * 
	 * Returns the lowest element in two-dimensional array
	 * 
	 */
	@Test
	
	public void testGetInLowestArray() {
		assertEquals(1.7, TwoDimRaggedArrayUtility.getLowestInArray(dataSet3),.001);
	}
	
	/**
	 * Test getLowestInColumnIndex method
	 * 
	 * Returns the index of the element that is the lowest in the specified column index
	 * 
	 */
	@Test
	
	public void testGetLowestInColumnIndex(){
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet3, 2),.001);
	}
	
	/**
	 * Test GetAverage method
	 * 
	 * Returns the average of the two dimensional array
	 * 
	 */
	@Test
	
	public void testGetAverage() {
		assertEquals(5.941, TwoDimRaggedArrayUtility.getAverage(dataSet3),.001);
	}
	
	/**
	 * Test GetColumnTotal method
	 * 
	 * Returns total of index column
	 * 
	 */
	@Test
	
	public void testGetColumnTotal() {
		assertEquals(11.1,TwoDimRaggedArrayUtility.getColumnTotal(dataSet3,1),.001);
	}
	
	
	/**
	 * Test GetHighestInRow method
	 * 
	 * Returns highest in index row 
	 * 
	 */
	@Test
	
	public void testGetHighestInRow() {
		assertEquals(9.3,TwoDimRaggedArrayUtility.getHighestInRow(dataSet3,0),.001);
	}
	
	/**
	 * Test getHighestInRowIndex method
	 * 
	 * Returns index of biggest element of row
	 * 
	 */
	@Test
	
	public void testGetHighestInRowIndex() {
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet3,0),.001);
	}
	
	/**
	 * Test getLowestInRow method
	 * 
	 * Returns lowest element in row
	 * 
	 */
	@Test
	
	public void testGetLowestInRow() {
		assertEquals(2.5,TwoDimRaggedArrayUtility.getLowestInRow(dataSet3,0),.001);
	}
	
	/**
	 * Test getHighestInColumnIndex method
	 * 
	 * Returns the index for highest column element
	 * 
	 */
	@Test
	
	public void testGetHighestInColumnIndex() {
		assertEquals(3,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet3,0),.001);
	}
	
	/**
	 * Test getHighestInColumn method
	 * 
	 * Returns highest in the specific column
	 * 
	 */
	@Test
	
	public void testGetHighestInColumn() {
		assertEquals(11.6,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet3,0),.001);
	}
	
	
	
	/**
	 * Test getLowestInColumn method
	 * 
	 * Returns highest in the specific column
	 * 
	 */
	@Test
	
	public void testGetLowestInColumn() {
		assertEquals(5.9,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet3,0),.001);
	}
}
