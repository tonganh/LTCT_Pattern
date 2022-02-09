package state;

public class Client {
    public static void main(String[] args) {
        State newState  = new NewState();
        State submitted = new SubmittedState();

        DocumentContext client = new DocumentContext();
        client.setState(newState);
        client.handleReqest();


        client.setState(submitted);
        client.handleReqest();

    }
}
