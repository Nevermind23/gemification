package p222q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: q7.g */
public final class C7902g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        LatLng latLng = null;
        float f = Utils.FLOAT_EPSILON;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                latLng = (LatLng) SafeParcelReader.m15143o(parcel, E, LatLng.CREATOR);
            } else if (w == 3) {
                f = SafeParcelReader.m15114C(parcel, E);
            } else if (w == 4) {
                f2 = SafeParcelReader.m15114C(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                f3 = SafeParcelReader.m15114C(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new CameraPosition(latLng, f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
