package p341ge.bog.mobilebank.model.datareport;

import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.datareport.LocationDataReport */
public class LocationDataReport {
    private double alt;
    private double lat;
    @C8664c("long")
    private double longitude;

    public void setAlt(double d) {
        this.alt = d;
    }

    public void setLat(double d) {
        this.lat = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public String toString() {
        return "LocationDataReport{lat=" + this.lat + ", longitude=" + this.longitude + ", alt=" + this.alt + '}';
    }
}
