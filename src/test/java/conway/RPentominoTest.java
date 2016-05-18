package conway;

import static org.assertj.core.api.StrictAssertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import cartesian.CartesianLocator;
import cell.New;
import cell.factory.CompositeCellFactory;
import cell.factory.KeepAliveAt;
import cell.factory.ResurectAt;

public class RPentominoTest {
	@Test
	public void stabilizesTo116Cells() throws Exception {
		Map<Location, Cell> map = new HashMap<>();
		map.put(CartesianLocator.get(0, 0), new New());
		map.put(CartesianLocator.get(0, 1), new New());
		map.put(CartesianLocator.get(1, 1), new New());
		map.put(CartesianLocator.get(-1, 0), new New());
		map.put(CartesianLocator.get(0, -1), new New());
		Universe universe = new Universe(map);
		Evolver evolver = new Evolver(new CompositeCellFactory(
				new KeepAliveAt(2), new KeepAliveAt(3),
				new ResurectAt(3)
			));
		
		for (int i = 0; i < 1133; i++) {
			universe = evolver.evolve(universe);
		}
		assertThat(universe.getCells().size()).isEqualTo(116);
	}
}
