package conway.cell.factory;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Nonnull;

import conway.Cell;
import conway.CellFactory;
import conway.Location;

public class CellNeighborsFactory implements CellFactory {	
	private final int necessaryNeighbors;
	private final Supplier<@Nonnull Cell> cellFactory;
	
	public CellNeighborsFactory(int necessaryNeighbors, Supplier<@Nonnull Cell> cellFactory) {
		this.necessaryNeighbors = necessaryNeighbors;
		this.cellFactory = cellFactory;
	}
	
	@Override
	public Cell makeAt(Map<Location, Cell> currentLocations, Location location) {
		Set<Location> neighbors = new HashSet<>(location.getNeighbors());
		neighbors.retainAll(currentLocations.keySet());
		if (neighbors.size() == necessaryNeighbors) {
			return cellFactory.get();
		}
		return Cell.NULL;
	}
}
