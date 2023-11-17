package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.firstparty.e */
public final class C4872e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        String str2 = null;
        TokenStatus tokenStatus = null;
        String str3 = null;
        Uri uri = null;
        byte[] bArr = null;
        zzan[] zzanArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 2:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 3:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 4:
                    tokenStatus = (TokenStatus) SafeParcelReader.m15143o(parcel, E, TokenStatus.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m15143o(parcel, E, Uri.CREATOR);
                    break;
                case 7:
                    bArr = SafeParcelReader.m15135g(parcel, E);
                    break;
                case 8:
                    zzanArr = (zzan[]) SafeParcelReader.m15148t(parcel, E, zzan.CREATOR);
                    break;
                case 9:
                    i2 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 10:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzau(str, str2, i, tokenStatus, str3, uri, bArr, zzanArr, i2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
