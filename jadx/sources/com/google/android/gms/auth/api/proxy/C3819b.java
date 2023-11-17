package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.proxy.b */
public final class C3819b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                i2 = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.m15143o(parcel, E, PendingIntent.CREATOR);
            } else if (w == 3) {
                i3 = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 4) {
                bundle = SafeParcelReader.m15134f(parcel, E);
            } else if (w == 5) {
                bArr = SafeParcelReader.m15135g(parcel, E);
            } else if (w != 1000) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
