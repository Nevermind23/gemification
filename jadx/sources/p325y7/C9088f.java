package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzap;

/* renamed from: y7.f */
public final class C9088f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            SafeParcelReader.m15151w(E);
            SafeParcelReader.m15125N(parcel, E);
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzap();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzap[i];
    }
}
