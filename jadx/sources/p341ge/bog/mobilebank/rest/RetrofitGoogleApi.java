package p341ge.bog.mobilebank.rest;

import com.google.android.gms.maps.model.LatLng;
import ed1.C40749p;
import p341ge.bog.mobilebank.model.google.Direction;
import p341ge.bog.mobilebank.rest.model.RetrofitGoogleClient;
import p341ge.bog.mobilebank.rest.service.IRetrofitGoogleService;

/* renamed from: ge.bog.mobilebank.rest.RetrofitGoogleApi */
public class RetrofitGoogleApi extends GoogleApi {
    private static final String LANG_EN = "en";
    private static final String LANG_KA = "ka";
    private static IRetrofitGoogleService googleService;

    public RetrofitGoogleApi(RetrofitGoogleClient retrofitGoogleClient) {
        if (googleService == null) {
            this.retrofitClient = retrofitGoogleClient;
            googleService = retrofitGoogleClient.getGoogleService();
        }
    }

    public C40749p<Direction> getDirections(LatLng latLng, LatLng latLng2, String str) {
        return googleService.getDirections(latLng.f14073d + "," + latLng.f14074e, latLng2.f14073d + "," + latLng2.f14074e, LANG_KA, false, "metric", "walking", str);
    }
}
