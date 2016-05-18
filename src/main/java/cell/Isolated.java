package cell;

import conway.Cell;

public class Isolated implements Cell {

	@Override
	public boolean isToBeKilled() {
		return true;
	}

}
