package conway;

import org.junit.Test;

import conway.cell.Healthy;
import conway.cell.Isolated;

public class MixedCellsTest {
	@Test
	public void keepsOnlyHealthyCells() throws Exception {
		Cell isolated = new Isolated();
		Cell healthy = new Healthy();
		
		new AssertThatUniverseWith(isolated, healthy).evolvesTo(healthy);
	}
}
