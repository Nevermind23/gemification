package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p195o6.C7461a;

/* renamed from: com.google.firebase.dynamiclinks.internal.a */
public class C5267a implements Parcelable.Creator {
    /* renamed from: c */
    static void m20788c(DynamicLinkData dynamicLinkData, Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, dynamicLinkData.mo17458x(), false);
        C7461a.m28392x(parcel, 2, dynamicLinkData.mo17456w(), false);
        C7461a.m28383o(parcel, 3, dynamicLinkData.mo17452f0());
        C7461a.m28387s(parcel, 4, dynamicLinkData.mo17455v());
        C7461a.m28374f(parcel, 5, dynamicLinkData.mo17451R(), false);
        C7461a.m28390v(parcel, 6, dynamicLinkData.mo17453q0(), i, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: a */
    public DynamicLinkData createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        int i = 0;
        long j = 0;
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
                    j = SafeParcelReader.m15121J(parcel, E);
                    break;
                case 5:
                    bundle = SafeParcelReader.m15134f(parcel, E);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m15143o(parcel, E, Uri.CREATOR);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new DynamicLinkData(str, str2, i, j, bundle, uri);
    }

    /* renamed from: b */
    public DynamicLinkData[] newArray(int i) {
        return new DynamicLinkData[i];
    }
}
