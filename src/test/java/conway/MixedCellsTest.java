package conway;

import org.junit.Test;

public class MixedCellsTest {
	@Test
	public void keepsOnlyHealthyCells() throws Exception {
		Cell isolated = new Isolated();
		Cell healthy = new Healthy();
		
		new AssertThatUniverseWith(isolated, healthy).evolvesTo(healthy);
	}
}