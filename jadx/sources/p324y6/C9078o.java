package p324y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.zzf;

/* renamed from: y6.o */
public final class C9078o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                bArr = SafeParcelReader.m15135g(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                bArr2 = SafeParcelReader.m15135g(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzf(bArr, bArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
