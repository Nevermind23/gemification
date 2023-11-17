package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.proxy.a */
public final class C3818a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w == 2) {
                i2 = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 3) {
                j = SafeParcelReader.m15121J(parcel, E);
            } else if (w == 4) {
                bArr = SafeParcelReader.m15135g(parcel, E);
            } else if (w == 5) {
                bundle = SafeParcelReader.m15134f(parcel, E);
            } else if (w != 1000) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new ProxyRequest(i, str, i2, j, bArr, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }
}
