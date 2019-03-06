package chain_of_responsibility;

public class Handler1 extends Handler {
    public Handler1(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Request request) {
        // do handle
    }
}
