package p182n6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: n6.p */
public final class C7279p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m15149u(parcel, E, MethodInvocation.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new TelemetryData(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TelemetryData[i];
    }
}
