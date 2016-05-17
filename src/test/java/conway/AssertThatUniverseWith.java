package conway;

import static org.assertj.core.api.Assertions.*;

public class AssertThatUniverseWith {
	
	private final Universe universe;

	public AssertThatUniverseWith(Cell...cells) {
		this.universe = new Universe(cells);
	}
	
	public void evolvesTo(Cell...cells) {
		assertThat(new Evolver().evolve(universe).getCells()).isEqualTo(new Universe(cells).getCells());
	}
}
