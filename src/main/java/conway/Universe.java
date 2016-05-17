package conway;

import java.util.Arrays;
import java.util.Collection;

public class Universe {

	private final Collection<Cell> cells;

	public Universe(Cell... cells) {
		this.cells = Arrays.asList(cells);
	}

	public Collection<Cell> getCells() {
		return cells;
	}

}
