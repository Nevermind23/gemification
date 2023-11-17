package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import java.util.ArrayList;
import p195o6.C7461a;

/* renamed from: com.google.firebase.dynamiclinks.internal.b */
public class C5268b implements Parcelable.Creator {
    /* renamed from: c */
    static void m20791c(ShortDynamicLinkImpl shortDynamicLinkImpl, Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, shortDynamicLinkImpl.mo17460w(), i, false);
        C7461a.m28390v(parcel, 2, shortDynamicLinkImpl.mo17459v(), i, false);
        C7461a.m28364C(parcel, 3, shortDynamicLinkImpl.mo17462x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: a */
    public ShortDynamicLinkImpl createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                uri = (Uri) SafeParcelReader.m15143o(parcel, E, Uri.CREATOR);
            } else if (w == 2) {
                uri2 = (Uri) SafeParcelReader.m15143o(parcel, E, Uri.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m15149u(parcel, E, ShortDynamicLinkImpl.WarningImpl.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new ShortDynamicLinkImpl(uri, uri2, arrayList);
    }

    /* renamed from: b */
    public ShortDynamicLinkImpl[] newArray(int i) {
        return new ShortDynamicLinkImpl[i];
    }
}
