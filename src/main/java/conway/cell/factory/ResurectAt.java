package conway.cell.factory;

import conway.cell.New;

public class ResurectAt extends CellNeighborsFactory implements ForDead {

	public ResurectAt(int necessaryNeighbors) {
		super(necessaryNeighbors, New::new);
	}

}
