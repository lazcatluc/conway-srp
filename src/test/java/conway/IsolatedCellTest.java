package conway;

import org.junit.Test;

import cell.Isolated;

public class IsolatedCellTest {
	
	@Test
	public void isKilledByEvolution() throws Exception {
		new AssertThatUniverseWith(new Isolated()).evolvesTo();
	}
}
