package conway;

public class EmptyUniverse {
	private static final Universe EMPTY = new Universe();
	
	public static Universe get() {
		return EMPTY;
	}
}
