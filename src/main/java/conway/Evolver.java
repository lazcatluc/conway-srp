package conway;

public class Evolver {
	public Universe evolve(Universe universe) {
		return new Universe(universe.getCells().stream().filter(cell -> !cell.isToBeKilled()).toArray(Cell[]::new));
	}
}
