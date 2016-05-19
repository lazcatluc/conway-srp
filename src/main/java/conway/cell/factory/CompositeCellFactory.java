package conway.cell.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import conway.CellFactory;

/**
 *
 * default = Kill every cell not matching factories
 * 
 * @author LClazar
 *
 *
 */
public class CompositeCellFactory extends CompositeCellFactoryNoDefault {

	public CompositeCellFactory(CellFactory... factories) {
		super(cellFactoriesPlusKillEveryLivingCell(factories));
	}

	private static CellFactory[] cellFactoriesPlusKillEveryLivingCell(CellFactory...factories) {
		List<CellFactory> myFactories = new ArrayList<>(Arrays.asList(factories));
		myFactories.add(new KillEveryLivingCell());
		return myFactories.toArray(new CellFactory[factories.length + 1]);
	}
}
