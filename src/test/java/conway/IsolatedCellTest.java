package conway;

import org.junit.Test;

public class IsolatedCellTest {
	
	@Test
	public void isKilledByEvolution() throws Exception {
		new AssertThatUniverseWith(new Isolated()).evolvesTo();
	}
}
