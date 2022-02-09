package factory_pattern;

public class Client {
    public static void main(String[] args) {
        BankType test = BankType.VIETCOMBANK;
        Bank testValue = Factory.getBank(test);
        System.out.println(testValue.getBankName());
    }
}
