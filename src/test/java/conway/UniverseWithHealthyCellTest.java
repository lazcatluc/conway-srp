package conway;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class UniverseWithHealthyCellTest {
	@Test
	public void keepsCellOnEvolution() throws Exception {
		HealthyCell cell = new HealthyCell();
		Universe universeWithCell = new Universe(cell);
		
		assertThat(new Evolver().evolve(universeWithCell).getCells()).isEqualTo(universeWithCell.getCells());
	}
}
