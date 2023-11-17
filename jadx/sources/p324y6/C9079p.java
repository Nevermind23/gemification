package p324y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.zzh;

/* renamed from: y6.p */
public final class C9079p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                z = SafeParcelReader.m15152x(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                bArr = SafeParcelReader.m15135g(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzh(z, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
