package state;

public class DocumentContext {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    void handleReqest(){
        this.state.handleRequest();
    }
}
