package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import p195o6.C7461a;

/* renamed from: com.google.firebase.dynamiclinks.internal.c */
public class C5269c implements Parcelable.Creator {
    /* renamed from: c */
    static void m20794c(ShortDynamicLinkImpl.WarningImpl warningImpl, Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, warningImpl.mo17463v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: a */
    public ShortDynamicLinkImpl.WarningImpl createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                str = SafeParcelReader.m15144p(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new ShortDynamicLinkImpl.WarningImpl(str);
    }

    /* renamed from: b */
    public ShortDynamicLinkImpl.WarningImpl[] newArray(int i) {
        return new ShortDynamicLinkImpl.WarningImpl[i];
    }
}
