
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HolidayBonusTestStudent {

	private double[][] dataSet3 = { { 7.2, 2.5, 9.3, 4.8 }, {5.9}, { 8.1, 1.7, 3.3 }, { 11.6, 6.9, 7.3, 2.7 } };

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet3);
			assertEquals(14000.0, result[0], .001);
			assertEquals(1000.0, result[1], .001);
			assertEquals(4000.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}

	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(32000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet3), .001);
	}

}

