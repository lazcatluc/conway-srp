package cartesian;

import cell.New;
import conway.Universe;

public class CartesianCellAdder {
	private final Universe universe;

	public CartesianCellAdder(Universe universe) {
		this.universe = universe;
	}
	
	public CartesianCellAdder addAt(int x, int y) {
		universe.getCells().put(CartesianLocator.get(x, y), new New());
		return this;
	}
}
