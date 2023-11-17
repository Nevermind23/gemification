package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p195o6.C7461a;

/* renamed from: com.google.android.gms.measurement.internal.t */
public final class C4786t implements Parcelable.Creator {
    /* renamed from: a */
    static void m18284a(zzaw zzaw, Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, zzaw.f15103d, false);
        C7461a.m28390v(parcel, 3, zzaw.f15104e, i, false);
        C7461a.m28392x(parcel, 4, zzaw.f15105f, false);
        C7461a.m28387s(parcel, 5, zzaw.f15106g);
        C7461a.m28370b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        long j = 0;
        String str = null;
        zzau zzau = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w == 3) {
                zzau = (zzau) SafeParcelReader.m15143o(parcel, E, zzau.CREATOR);
            } else if (w == 4) {
                str2 = SafeParcelReader.m15144p(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                j = SafeParcelReader.m15121J(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzaw(str, zzau, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }
}
