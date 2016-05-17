package conway;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class EmptyUniverseTest {
	
	private static final Universe EMPTY = new Universe();
	
	@Test
	public void evolvesToEmpty() throws Exception {
		assertThat(emptyUniverse().evolve()).isEqualTo(emptyUniverse());
	}

	private Universe emptyUniverse() {
		return EMPTY;
	}
}
