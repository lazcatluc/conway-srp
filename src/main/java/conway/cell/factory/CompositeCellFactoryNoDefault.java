package conway.cell.factory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import conway.Cell;
import conway.CellFactory;
import conway.Location;

public class CompositeCellFactoryNoDefault implements CellFactory {

	private final Collection<CellFactory> factories;
	
	public CompositeCellFactoryNoDefault(CellFactory... factories) {
		this.factories = Arrays.asList(factories);
	}

	@Override
	public Cell makeAt(Map<Location, Cell> currentLocation, Location location) {
		return factories.stream().filter(
				factory -> currentLocation.containsKey(location) ? factory instanceof ForLiving : factory instanceof ForDead)
			.map(factory -> factory.makeAt(currentLocation, location))
			.filter(cell -> !Cell.NULL.equals(cell)).findFirst().orElse(Cell.NULL);
	}

}
