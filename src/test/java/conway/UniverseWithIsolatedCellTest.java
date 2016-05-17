package conway;

import org.junit.Test;

public class UniverseWithIsolatedCellTest {
	
	@Test
	public void removesCellOnEvolution() throws Exception {
		new AssertThatUniverseWith(new IsolatedCell()).evolvesTo();
	}
}
