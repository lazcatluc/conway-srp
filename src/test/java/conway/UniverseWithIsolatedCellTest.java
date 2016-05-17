package conway;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class UniverseWithIsolatedCellTest {
	
	@Test
	public void removesCellOnEvolution() throws Exception {
		Cell cell = new IsolatedCell();
		Universe universeWithCell = new Universe(cell);
		
		assertThat(universeWithCell.evolve().getCells()).isEqualTo(EmptyUniverse.get().getCells());
	}
}
