package p222q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: q7.h */
public final class C7903h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                latLng = (LatLng) SafeParcelReader.m15143o(parcel, E, LatLng.CREATOR);
            } else if (w == 3) {
                latLng2 = (LatLng) SafeParcelReader.m15143o(parcel, E, LatLng.CREATOR);
            } else if (w == 4) {
                latLng3 = (LatLng) SafeParcelReader.m15143o(parcel, E, LatLng.CREATOR);
            } else if (w == 5) {
                latLng4 = (LatLng) SafeParcelReader.m15143o(parcel, E, LatLng.CREATOR);
            } else if (w != 6) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.m15143o(parcel, E, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
