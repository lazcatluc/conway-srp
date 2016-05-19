package conway.cell.factory;

import java.util.Map;

import conway.Cell;
import conway.Location;

public class KillEveryLivingCell implements ForLiving {
	@Override
	public Cell makeAt(Map<Location, Cell> currentLocation, Location location) {
		return new Cell() {
			@Override
			public boolean isToBeKilled() {
				return true;
			}
		};
	}
}
