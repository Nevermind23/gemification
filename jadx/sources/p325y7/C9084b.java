package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzal;
import com.google.android.gms.tapandpay.firstparty.zzz;

/* renamed from: y7.b */
public final class C9084b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        zzal zzal = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                zzal = (zzal) SafeParcelReader.m15143o(parcel, E, zzal.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzz(zzal);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
