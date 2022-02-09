package abtract_factory.factory;

import abtract_factory.chair.Chair;
import abtract_factory.chair.PlasticChair;
import abtract_factory.table.PlasticTable;
import abtract_factory.table.Table;

public class PlasticFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
