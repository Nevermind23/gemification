package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fido.u2f.api.common.e */
public final class C4061e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        byte[] bArr = null;
        ArrayList arrayList = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 2) {
                bArr = SafeParcelReader.m15135g(parcel, E);
            } else if (w == 3) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m15149u(parcel, E, Transport.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new KeyHandle(i, bArr, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyHandle[i];
    }
}
