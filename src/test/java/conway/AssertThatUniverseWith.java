package conway;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.annotation.Nonnull;

public class AssertThatUniverseWith {
	
	private final @Nonnull Universe universe;

	public AssertThatUniverseWith(Cell...cells) {
		this.universe = universeWithCells(cells);
	}
	
	public void evolvesTo(Cell...cells) {
		new Evolver(new CellFactory() {}).evolve(universe);
		assertThat(new HashSet<>(universe.getCells().values()))
			.isEqualTo(new HashSet<>(universeWithCells(cells).getCells().values()));
	}
	
	private @Nonnull Universe universeWithCells(Cell...cells) {
		Map<Location, Cell> cellsWithLocation = new HashMap<>();
		Arrays.stream(cells).forEach(cell -> cellsWithLocation.put(mock(Location.class), cell));
		return new Universe(cellsWithLocation);
	}
}
