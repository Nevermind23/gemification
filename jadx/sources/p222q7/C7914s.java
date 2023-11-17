package p222q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;

/* renamed from: q7.s */
public final class C7914s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        StrokeStyle strokeStyle = null;
        double d = Utils.DOUBLE_EPSILON;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                strokeStyle = (StrokeStyle) SafeParcelReader.m15143o(parcel, E, StrokeStyle.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                d = SafeParcelReader.m15112A(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new StyleSpan(strokeStyle, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StyleSpan[i];
    }
}
