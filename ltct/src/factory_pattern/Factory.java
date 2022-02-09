package factory_pattern;

public class Factory {
    private Factory(){}
    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new ViettinBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
