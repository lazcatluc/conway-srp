package cartesian;

import java.util.HashMap;
import java.util.Map;

import conway.Location;

class CartesianLocator {
	private static final Map<Integer, Map<Integer, Location>> LOCATIONS = new HashMap<>();
	
	public static synchronized Location get(int x, int y) {
		Map<Integer, Location> xMap = LOCATIONS.get(x);
		if (xMap == null) {
			xMap = new HashMap<>();
			LOCATIONS.put(x, xMap);
		}
		Location location = xMap.get(y);
		if (location == null) {
			location = new CartesianLocation(x, y);
			xMap.put(y, location);
		}
		return location;
	}
}
