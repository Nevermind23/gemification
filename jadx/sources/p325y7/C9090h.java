package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzas;
import java.math.BigDecimal;

/* renamed from: y7.h */
public final class C9090h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        long j = 0;
        long j2 = 0;
        BigDecimal bigDecimal = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                j = SafeParcelReader.m15121J(parcel, E);
            } else if (w == 2) {
                bigDecimal = SafeParcelReader.m15129a(parcel, E);
            } else if (w == 3) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w == 4) {
                j2 = SafeParcelReader.m15121J(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzas(j, bigDecimal, str, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzas[i];
    }
}
