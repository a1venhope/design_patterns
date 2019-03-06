package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsCenter {
    protected String name;
    private List<NewsReport> reports;

    public NewsCenter() {
        this.reports = new ArrayList<NewsReport>();
    }

    void registerReporter(NewsReport report) {
        reports.add(report);
    }
    void removeReporter(NewsReport report) {
        reports.remove(report);
    }
    void notifyObservers(String time, String who, String thing) {
        for (NewsReport report : reports) {
            report.report(time, who, thing);
        }
    }
}
