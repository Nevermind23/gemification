package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p118i7.C6594e;
import p183n7.C7335v;
import p183n7.C7336w;
import p195o6.C7461a;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C4085m();

    /* renamed from: d */
    final int f13131d;

    /* renamed from: e */
    final zzh f13132e;

    /* renamed from: f */
    final C7336w f13133f;

    /* renamed from: g */
    final C6594e f13134g;

    zzj(int i, zzh zzh, IBinder iBinder, IBinder iBinder2) {
        C7336w wVar;
        this.f13131d = i;
        this.f13132e = zzh;
        C6594e eVar = null;
        if (iBinder == null) {
            wVar = null;
        } else {
            wVar = C7335v.m27987x(iBinder);
        }
        this.f13133f = wVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof C6594e) {
                eVar = (C6594e) queryLocalInterface;
            } else {
                eVar = new C4073a(iBinder2);
            }
        }
        this.f13134g = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13131d);
        C7461a.m28390v(parcel, 2, this.f13132e, i, false);
        C7336w wVar = this.f13133f;
        IBinder iBinder2 = null;
        if (wVar == null) {
            iBinder = null;
        } else {
            iBinder = wVar.asBinder();
        }
        C7461a.m28382n(parcel, 3, iBinder, false);
        C6594e eVar = this.f13134g;
        if (eVar != null) {
            iBinder2 = eVar.asBinder();
        }
        C7461a.m28382n(parcel, 4, iBinder2, false);
        C7461a.m28370b(parcel, a);
    }
}
