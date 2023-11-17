package p222q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* renamed from: q7.q */
public final class C7912q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        float f = Utils.FLOAT_EPSILON;
        float f2 = 0.0f;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                f = SafeParcelReader.m15114C(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                f2 = SafeParcelReader.m15114C(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new StreetViewPanoramaOrientation(f, f2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}
