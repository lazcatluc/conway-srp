package conway;

import java.util.Map;

import javax.annotation.Nonnull;

public class Universe {

	private final Map<@Nonnull Location, Cell> cells;

	public Universe(Map<@Nonnull Location, Cell> cells) {
		this.cells = cells;
	}

	public Map<Location, Cell> getCells() {
		return cells;
	}

}
