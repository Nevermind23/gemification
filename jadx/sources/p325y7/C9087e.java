package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzal;

/* renamed from: y7.e */
public final class C9087e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                z = SafeParcelReader.m15152x(parcel, E);
            } else if (w == 2) {
                z2 = SafeParcelReader.m15152x(parcel, E);
            } else if (w == 3) {
                z3 = SafeParcelReader.m15152x(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzal(z, z2, z3, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
