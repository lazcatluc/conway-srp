package conway.cell.factory;

import conway.cell.Isolated;

public class IsolateAt extends CellNeighborsFactory implements ForLiving {

	public IsolateAt(int necessaryNeighbors) {
		super(necessaryNeighbors, Isolated::new);
	}

}
