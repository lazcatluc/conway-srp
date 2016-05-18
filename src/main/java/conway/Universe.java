package conway;

import java.util.Map;

public class Universe {

	private final Map<Location, Cell> cells;

	public Universe(Map<Location, Cell> cells) {
		this.cells = cells;
	}

	public Map<Location, Cell> getCells() {
		return cells;
	}

}
