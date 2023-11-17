package p183n7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzce;
import java.util.ArrayList;

/* renamed from: n7.k0 */
public final class C7317k0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m15149u(parcel, E, zzce.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new SleepSegmentRequest(arrayList, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepSegmentRequest[i];
    }
}
