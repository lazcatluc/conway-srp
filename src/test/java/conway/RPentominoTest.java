package conway;

import static org.assertj.core.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import cartesian.CartesianLocator;
import cell.Healthy;
import cell.Overcrowded;
import cell.factory.CompositeCellFactory;
import cell.factory.IsolateAt;
import cell.factory.KeepAliveAt;
import cell.factory.OvercrowdAt;
import cell.factory.ResurectAt;

public class RPentominoTest {
	@Test
	public void stabilizesTo116Cells() throws Exception {
		Map<Location, Cell> map = new HashMap<>();
		map.put(CartesianLocator.get(0, 0), new Overcrowded());
		map.put(CartesianLocator.get(0, 1), new Healthy());
		map.put(CartesianLocator.get(1, 1), new Healthy());
		map.put(CartesianLocator.get(-1, 0), new Healthy());
		map.put(CartesianLocator.get(0, -1), new Healthy());
		Universe universe = new Universe(map);
		Evolver evolver = new Evolver(new CompositeCellFactory(
				new IsolateAt(0), new IsolateAt(1),
				new KeepAliveAt(2), new KeepAliveAt(3),
				new OvercrowdAt(4), new OvercrowdAt(5), new OvercrowdAt(6), new OvercrowdAt(7), new OvercrowdAt(8),
				new ResurectAt(3)
			));
		
		for (int i = 0; i < 1133; i++) {
			universe = evolver.evolve(universe);
		}
		assertThat(universe.getCells().size()).isEqualTo(116);
	}
}
