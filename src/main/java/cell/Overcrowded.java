package cell;

import conway.Cell;

public class Overcrowded implements Cell {

	@Override
	public boolean isToBeKilled() {
		return true;
	}

}
