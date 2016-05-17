package conway;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class CartesianLocationTest {
	@Test
	public void has8neighbors() throws Exception {
		assertThat(new CartesianLocation(0,0).getNeighbors().size()).isEqualTo(8);
	}
}
