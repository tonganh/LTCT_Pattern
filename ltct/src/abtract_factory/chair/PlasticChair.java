package abtract_factory.chair;

public class PlasticChair implements Chair{
    @Override
    public void create() {
        System.out.println("Chair");
    }
}
