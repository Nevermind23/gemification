package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzau;
import com.google.android.gms.tapandpay.firstparty.zzn;

/* renamed from: y7.l */
public final class C9094l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        zzau[] zzauArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                zzauArr = (zzau[]) SafeParcelReader.m15148t(parcel, E, zzau.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzn(zzauArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzn[i];
    }
}
