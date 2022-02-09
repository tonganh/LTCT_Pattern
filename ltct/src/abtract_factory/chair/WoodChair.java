package abtract_factory.chair;

public class WoodChair implements Chair{
    @Override
    public void create() {
        System.out.println("Wood chair");
    }
}
