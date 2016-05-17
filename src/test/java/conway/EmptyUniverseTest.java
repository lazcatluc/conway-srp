package conway;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class EmptyUniverseTest {
	
	@Test
	public void evolvesToEmpty() throws Exception {
		assertThat(EmptyUniverse.get().evolve().getCells()).isEqualTo(EmptyUniverse.get().getCells());
	}
}
