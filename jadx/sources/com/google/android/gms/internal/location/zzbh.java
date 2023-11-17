package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p118i7.C6594e;
import p183n7.C7299b0;
import p183n7.C7301c0;
import p183n7.C7338y;
import p183n7.C7339z;
import p195o6.C7461a;

public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new C4083k();

    /* renamed from: d */
    private final int f13110d;

    /* renamed from: e */
    private final zzbf f13111e;

    /* renamed from: f */
    private final C7301c0 f13112f;

    /* renamed from: g */
    private final C7339z f13113g;

    /* renamed from: h */
    private final PendingIntent f13114h;

    /* renamed from: i */
    private final C6594e f13115i;

    /* renamed from: j */
    private final String f13116j;

    zzbh(int i, zzbf zzbf, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        C7301c0 c0Var;
        C7339z zVar;
        this.f13110d = i;
        this.f13111e = zzbf;
        C6594e eVar = null;
        if (iBinder != null) {
            c0Var = C7299b0.m27964x(iBinder);
        } else {
            c0Var = null;
        }
        this.f13112f = c0Var;
        this.f13114h = pendingIntent;
        if (iBinder2 != null) {
            zVar = C7338y.m27988x(iBinder2);
        } else {
            zVar = null;
        }
        this.f13113g = zVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof C6594e) {
                eVar = (C6594e) queryLocalInterface;
            } else {
                eVar = new C4073a(iBinder3);
            }
        }
        this.f13115i = eVar;
        this.f13116j = str;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbh m15463v(p183n7.C7339z r9, p118i7.C6594e r10) {
        /*
            com.google.android.gms.internal.location.zzbh r8 = new com.google.android.gms.internal.location.zzbh
            if (r10 != 0) goto L_0x0005
            r10 = 0
        L_0x0005:
            r6 = r10
            r1 = 2
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r0 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbh.m15463v(n7.z, i7.e):com.google.android.gms.internal.location.zzbh");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbh m15464w(p183n7.C7301c0 r9, p118i7.C6594e r10) {
        /*
            com.google.android.gms.internal.location.zzbh r8 = new com.google.android.gms.internal.location.zzbh
            if (r10 != 0) goto L_0x0005
            r10 = 0
        L_0x0005:
            r6 = r10
            r1 = 2
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r0 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbh.m15464w(n7.c0, i7.e):com.google.android.gms.internal.location.zzbh");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13110d);
        C7461a.m28390v(parcel, 2, this.f13111e, i, false);
        C7301c0 c0Var = this.f13112f;
        IBinder iBinder3 = null;
        if (c0Var == null) {
            iBinder = null;
        } else {
            iBinder = c0Var.asBinder();
        }
        C7461a.m28382n(parcel, 3, iBinder, false);
        C7461a.m28390v(parcel, 4, this.f13114h, i, false);
        C7339z zVar = this.f13113g;
        if (zVar == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zVar.asBinder();
        }
        C7461a.m28382n(parcel, 5, iBinder2, false);
        C6594e eVar = this.f13115i;
        if (eVar != null) {
            iBinder3 = eVar.asBinder();
        }
        C7461a.m28382n(parcel, 6, iBinder3, false);
        C7461a.m28392x(parcel, 8, this.f13116j, false);
        C7461a.m28370b(parcel, a);
    }
}
