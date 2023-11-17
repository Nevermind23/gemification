package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzr;

/* renamed from: y7.n */
public final class C9096n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int[] iArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                iArr = SafeParcelReader.m15139k(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzr(iArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
