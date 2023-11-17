package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.firstparty.i */
public final class C4876i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        byte[] bArr = null;
        TokenStatus tokenStatus = null;
        String str2 = null;
        zzaz zzaz = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 2:
                    bArr = SafeParcelReader.m15135g(parcel, E);
                    break;
                case 3:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 4:
                    tokenStatus = (TokenStatus) SafeParcelReader.m15143o(parcel, E, TokenStatus.CREATOR);
                    break;
                case 5:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 6:
                    zzaz = (zzaz) SafeParcelReader.m15143o(parcel, E, zzaz.CREATOR);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzb(str, bArr, i, tokenStatus, str2, zzaz);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
