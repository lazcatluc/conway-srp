package conway;

import static org.assertj.core.api.StrictAssertions.assertThat;

import java.util.HashMap;

import org.junit.Test;

import cartesian.CartesianCellAdder;
import cell.factory.CompositeCellFactory;
import cell.factory.KeepAliveAt;
import cell.factory.ResurectAt;

public class RPentominoTest {
	@Test
	public void stabilizesTo116Cells() throws Exception {
		Universe universe = new Universe(new HashMap<>());
		new CartesianCellAdder(universe).addAt(0, 0).addAt(0, 1).addAt(1, 1).addAt(-1, 0).addAt(0, -1);
		Evolver evolver = new Evolver(
				new CompositeCellFactory(new KeepAliveAt(2), new KeepAliveAt(3), new ResurectAt(3)));

		for (int i = 0; i < 1133; i++) {
			evolver.evolve(universe);
		}
		assertThat(universe.getCells().size()).isEqualTo(116);
	}
}
