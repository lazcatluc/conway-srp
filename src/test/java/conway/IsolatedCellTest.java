package conway;

import org.junit.Test;

import conway.cell.Isolated;

public class IsolatedCellTest {
	
	@Test
	public void isKilledByEvolution() throws Exception {
		new AssertThatUniverseWith(new Isolated()).evolvesTo();
	}
}
