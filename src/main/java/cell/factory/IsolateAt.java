package cell.factory;

import cell.Isolated;

public class IsolateAt extends CellNeighborsFactory implements ForLiving {

	public IsolateAt(int necessaryNeighbors) {
		super(necessaryNeighbors, Isolated::new);
	}

}
