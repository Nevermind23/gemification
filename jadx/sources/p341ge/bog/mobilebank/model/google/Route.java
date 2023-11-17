package p341ge.bog.mobilebank.model.google;

import java.util.ArrayList;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.google.Route */
public class Route {
    private ArrayList<Leg> legs;
    @C8664c("overview_polyline")
    private Poly overviewPolyline;

    public ArrayList<Leg> getLegs() {
        return this.legs;
    }

    public Poly getOverviewPolyline() {
        return this.overviewPolyline;
    }
}
