package p341ge.bog.mobilebank.model.google;

import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.google.Leg */
public class Leg {
    private Distance distance;
    private Duration duration;
    private ArrayList<Step> steps;

    public Distance getDistance() {
        return this.distance;
    }

    public Duration getDuration() {
        return this.duration;
    }

    public void setDistance(Distance distance2) {
        this.distance = distance2;
    }

    public void setDuration(Duration duration2) {
        this.duration = duration2;
    }
}
