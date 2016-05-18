package cell.factory;

import cell.Overcrowded;

public class OvercrowdAt extends CellNeighborsFactory implements ForLiving {

	public OvercrowdAt(int necessaryNeighbors) {
		super(necessaryNeighbors, Overcrowded::new);
	}

}
