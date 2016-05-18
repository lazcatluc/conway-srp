package conway;

import org.junit.Test;

import cell.Healthy;

public class HealthyCellTest {
	@Test
	public void survivesEvolution() throws Exception {
		Healthy cell = new Healthy();
		new AssertThatUniverseWith(cell).evolvesTo(cell);
	}
}
