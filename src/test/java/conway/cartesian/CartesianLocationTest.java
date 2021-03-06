package conway.cartesian;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import conway.cartesian.CartesianLocator;

public class CartesianLocationTest {
	@Test
	public void has8neighbors() throws Exception {
		assertThat(CartesianLocator.get(0,0).getNeighbors().size()).isEqualTo(8);
	}
}
