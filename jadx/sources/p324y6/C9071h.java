package p324y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.zzai;

/* renamed from: y6.h */
public final class C9071h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        byte[][] bArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                bArr = SafeParcelReader.m15136h(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzai(bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzai[i];
    }
}
