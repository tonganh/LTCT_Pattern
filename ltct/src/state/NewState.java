package state;

public class NewState implements State{
    @Override
    public void handleRequest() {
        System.out.println("New state");
    }
}
