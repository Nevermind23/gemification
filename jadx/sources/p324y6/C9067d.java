package p324y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.zzab;

/* renamed from: y6.d */
public final class C9067d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        long j = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                j = SafeParcelReader.m15121J(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzab(j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzab[i];
    }
}
