package p341ge.bog.mobilebank.rest;

import com.google.android.gms.maps.model.LatLng;
import ed1.C40749p;
import p341ge.bog.mobilebank.model.google.Direction;
import p341ge.bog.mobilebank.rest.model.RetrofitGoogleClient;

/* renamed from: ge.bog.mobilebank.rest.GoogleApi */
public abstract class GoogleApi {
    protected RetrofitGoogleClient retrofitClient;

    public abstract C40749p<Direction> getDirections(LatLng latLng, LatLng latLng2, String str);
}
