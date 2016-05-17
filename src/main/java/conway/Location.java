package conway;

import java.util.Set;

public interface Location {
	Set<Location> getNeighbors();
}
