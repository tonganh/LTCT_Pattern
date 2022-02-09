package abtract_factory.factory;

import abtract_factory.chair.Chair;
import abtract_factory.chair.WoodChair;
import abtract_factory.table.Table;
import abtract_factory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
