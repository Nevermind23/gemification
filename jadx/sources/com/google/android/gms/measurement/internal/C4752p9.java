package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p195o6.C7461a;

/* renamed from: com.google.android.gms.measurement.internal.p9 */
public final class C4752p9 implements Parcelable.Creator {
    /* renamed from: a */
    static void m18174a(zzlj zzlj, Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, zzlj.f15107d);
        C7461a.m28392x(parcel, 2, zzlj.f15108e, false);
        C7461a.m28387s(parcel, 3, zzlj.f15109f);
        C7461a.m28388t(parcel, 4, zzlj.f15110g, false);
        C7461a.m28381m(parcel, 5, (Float) null, false);
        C7461a.m28392x(parcel, 6, zzlj.f15111h, false);
        C7461a.m28392x(parcel, 7, zzlj.f15112i, false);
        C7461a.m28379k(parcel, 8, zzlj.f15113j, false);
        C7461a.m28370b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 2:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 3:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 4:
                    l = SafeParcelReader.m15122K(parcel2, E);
                    break;
                case 5:
                    f = SafeParcelReader.m15115D(parcel2, E);
                    break;
                case 6:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 7:
                    str3 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 8:
                    d = SafeParcelReader.m15113B(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new zzlj(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlj[i];
    }
}
