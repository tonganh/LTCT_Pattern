package abtract_factory;

import abtract_factory.chair.Chair;
import abtract_factory.factory.FurnitureAbstractFactory;
import abtract_factory.factory.FurnitureFactory;
import abtract_factory.factory.MaterialType;
import abtract_factory.table.Table;

public class Client{
    public static void main(String[] args) {
        FurnitureAbstractFactory test = FurnitureFactory.getFactory(MaterialType.WOOD);
        Chair chair = test.createChair();
        chair.create();
        Table table = test.createTable();
        table.create();
    }
}
