package conway;

public interface Cell {
	Cell NULL = new Cell() {
		@Override
		public boolean isToBeKilled() {
			return true;
		}
	};

	boolean isToBeKilled();
}
