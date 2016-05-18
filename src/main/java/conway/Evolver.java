package conway;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import cell.New;

public class Evolver {
	
	private final CellFactory cellFactory;
	
	public Evolver(CellFactory cellFactory) {
		this.cellFactory = cellFactory;
	}

	public Universe evolve(Universe universe) {
		Map<Location, Cell> cells = new HashMap<>(universe.getCells());
		reviveCells(cells);
		killOldCells(cells);
		return new Universe(buildNewCells(cells));
		
	}
	
	
	private void reviveCells(Map<Location, Cell> cells) {
		Map<Location, Cell> newCells = new HashMap<>();
		cells.forEach((location, cell) -> {
				if (!(cell instanceof New)) {
					location.getNeighbors().forEach(newLocation -> { 
						if (!cells.containsKey(newLocation)) { 
							addNewLocationToNewCells(cells, newCells, newLocation);
						}
					});
				};
			}
		);
		cells.putAll(newCells);
	}
	
	private void killOldCells(Map<Location, Cell> cells) {
		Iterator<Map.Entry<Location, Cell>> cellsIt = cells.entrySet().iterator();
		while (cellsIt.hasNext()) {
			Map.Entry<Location, Cell> cell = cellsIt.next();
			if (cell.getValue().isToBeKilled()) {
				cellsIt.remove();
			}
		}
	}

	private Map<Location, Cell> buildNewCells(Map<Location, Cell> cells) {
		Map<Location, Cell> newCells = new HashMap<>();
		cells.forEach((location, cell) ->  {
			addNewLocationToNewCells(cells, newCells, location);
		});
		return newCells;
	}

	private void addNewLocationToNewCells(Map<Location, Cell> currentCells, Map<Location, Cell> newCells,
			Location newLocation) {
		Cell newCell = cellFactory.makeAt(currentCells, newLocation);
		if (!Cell.NULL.equals(newCell)) {
			newCells.put(newLocation, newCell);
		}
	}
}
