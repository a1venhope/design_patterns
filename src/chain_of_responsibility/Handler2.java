package chain_of_responsibility;

public class Handler2 extends Handler {
    public Handler2(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Request request) {
        // do handle
    }
}
