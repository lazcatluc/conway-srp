package conway;

import java.util.Set;

import javax.annotation.Nonnull;

public interface Location {
	Set<@Nonnull Location> getNeighbors();
}
