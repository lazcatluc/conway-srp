package conway;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class UniverseWithMixedCellsTest {
	@Test
	public void keepsOnlyHealthyCells() throws Exception {
		Cell isolated = new IsolatedCell();
		Cell healthy = new HealthyCell();
		
		assertThat(new Universe(isolated, healthy).evolve().getCells()).isEqualTo(new Universe(healthy).getCells());
	}
}
