package conway;

import org.junit.Test;

public class EmptyUniverseTest {
	
	@Test
	public void evolvesToEmpty() throws Exception {
		new AssertThatUniverseWith().evolvesTo();
	}
}
