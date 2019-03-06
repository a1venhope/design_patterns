package observer;

public abstract class NewsReport {

    public void register(NewsCenter center) {
        center.registerReporter(this);
    }

    abstract void report(String time, String who, String thing);
}
