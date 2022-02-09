package abtract_factory.factory;

import abtract_factory.chair.Chair;
import abtract_factory.table.Table;

public abstract class FurnitureAbstractFactory {

    public abstract Chair createChair();

    public abstract Table createTable();

}
