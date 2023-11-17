package p222q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: q7.i */
public final class C7904i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                latLng = (LatLng) SafeParcelReader.m15143o(parcel, E, LatLng.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                latLng2 = (LatLng) SafeParcelReader.m15143o(parcel, E, LatLng.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
