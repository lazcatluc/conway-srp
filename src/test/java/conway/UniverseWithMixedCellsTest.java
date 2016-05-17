package conway;

import org.junit.Test;

public class UniverseWithMixedCellsTest {
	@Test
	public void keepsOnlyHealthyCells() throws Exception {
		Cell isolated = new IsolatedCell();
		Cell healthy = new HealthyCell();
		
		new AssertThatUniverseWith(isolated, healthy).evolvesTo(healthy);
	}
}
