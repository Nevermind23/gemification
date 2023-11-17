package p222q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.PatternItem;

/* renamed from: q7.l */
public final class C7907l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                f = SafeParcelReader.m15115D(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new PatternItem(i, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PatternItem[i];
    }
}
