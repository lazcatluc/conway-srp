package conway.cartesian;

import java.util.HashSet;
import java.util.Set;

import conway.Location;

public class CartesianLocation implements Location {

	private final int x;
	private final int y;

	protected CartesianLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public Set<Location> getNeighbors() {
		Set<Location> neighbors = new HashSet<>();
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				if (i != 0 || j != 0) {
					neighbors.add(CartesianLocator.get(x + i, y + j));
				}
			}
		}
		return neighbors;
	}
	
}
