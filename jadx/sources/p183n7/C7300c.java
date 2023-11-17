package p183n7;

import com.facetec.sdk.FaceTecSDK;
import p143k6.C6818a;

/* renamed from: n7.c */
public abstract class C7300c extends C6818a {
    /* renamed from: a */
    public static String m27965a(int i) {
        switch (i) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case FaceTecSDK.REQUEST_CODE_SESSION:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
            default:
                return C6818a.m26551a(i);
        }
    }
}
