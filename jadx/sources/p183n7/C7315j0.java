package p183n7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.SleepSegmentEvent;

/* renamed from: n7.j0 */
public final class C7315j0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                j = SafeParcelReader.m15121J(parcel, E);
            } else if (w == 2) {
                j2 = SafeParcelReader.m15121J(parcel, E);
            } else if (w == 3) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 4) {
                i2 = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i3 = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new SleepSegmentEvent(j, j2, i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepSegmentEvent[i];
    }
}
