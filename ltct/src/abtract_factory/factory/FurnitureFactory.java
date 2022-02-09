package abtract_factory.factory;

public class FurnitureFactory {
    private FurnitureFactory(){}
    public static FurnitureAbstractFactory getFactory(MaterialType type){
        switch (type){
            case WOOD:
                return new WoodFactory();
            case FLASTIC:
                return new PlasticFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
