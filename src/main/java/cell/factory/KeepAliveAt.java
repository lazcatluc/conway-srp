package cell.factory;

import cell.Healthy;

public class KeepAliveAt extends CellNeighborsFactory implements ForLiving {

	public KeepAliveAt(int necessaryNeighbors) {
		super(necessaryNeighbors, Healthy::new);
	}
	
}
