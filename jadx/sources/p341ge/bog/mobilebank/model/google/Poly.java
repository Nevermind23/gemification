package p341ge.bog.mobilebank.model.google;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p340za.C9273a;

/* renamed from: ge.bog.mobilebank.model.google.Poly */
public class Poly {
    private String points;

    public List<LatLng> getDecodedPolyline() {
        return C9273a.m34173a(this.points);
    }

    public String getPoints() {
        return this.points;
    }

    public void setPoints(String str) {
        this.points = str;
    }
}
