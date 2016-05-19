package conway;

import java.util.Map;

public interface CellFactory {

	default Cell makeAt(Map<Location, Cell> currentLocation, Location location) {
		return currentLocation.getOrDefault(location, Cell.NULL);
	}

}
