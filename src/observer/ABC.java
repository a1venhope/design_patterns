package observer;

import javax.sound.midi.SoundbankResource;

public class ABC extends NewsReport {

    @Override
    void report(String time, String who, String thing) {
        System.out.printf("hello everyone, welcome to ABC News. We got a break news here that at %s, %s %s.", time, who, thing);
    }
}
