package chain_of_responsibility;

public abstract class Handler {

    // protected修饰
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(Request request);
}

class Request {
    // ***
}
