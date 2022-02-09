package command;

public class BankApp {
    private Command openAccount;
    private Command closeAccount;

    public BankApp(Command openAccount, Command closeAccount){
        this.openAccount=openAccount;
        this.closeAccount=closeAccount;
    }

    public void clickOpenAccount(){
        System.out.println("We will open account");
        openAccount.execute();
    }

    public void clickCloseAccount(){
        System.out.println("We will open account");
        closeAccount.execute();
    }

}
