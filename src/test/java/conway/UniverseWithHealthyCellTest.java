package conway;

import org.junit.Test;

public class UniverseWithHealthyCellTest {
	@Test
	public void keepsCellOnEvolution() throws Exception {
		HealthyCell cell = new HealthyCell();
		new AssertThatUniverseWith(cell).evolvesTo(cell);
	}
}
