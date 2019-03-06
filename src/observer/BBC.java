package observer;

public class BBC extends NewsReport {

    @Override
    void report(String time, String who, String thing) {
        System.out.printf("this is BBC News, %s %s in %s \n", who, thing, time);
    }
}
