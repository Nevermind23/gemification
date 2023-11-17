package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p222q7.C7896a;

public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new C4561c();

    /* renamed from: g */
    private static final String f14044g = "Cap";

    /* renamed from: d */
    private final int f14045d;

    /* renamed from: e */
    private final C7896a f14046e;

    /* renamed from: f */
    private final Float f14047f;

    protected Cap(int i) {
        this(i, (C7896a) null, (Float) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        if (this.f14045d != cap.f14045d || !C7258g.m27880a(this.f14046e, cap.f14046e) || !C7258g.m27880a(this.f14047f, cap.f14047f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f14045d), this.f14046e, this.f14047f);
    }

    public String toString() {
        int i = this.f14045d;
        return "[Cap: type=" + i + "]";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final Cap mo14096v() {
        boolean z;
        int i = this.f14045d;
        if (i == 0) {
            return new ButtCap();
        }
        boolean z2 = true;
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i != 3) {
            Log.w(f14044g, "Unknown Cap type: " + i);
            return this;
        }
        if (this.f14046e != null) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27906o(z, "bitmapDescriptor must not be null");
        if (this.f14047f == null) {
            z2 = false;
        }
        C7264i.m27906o(z2, "bitmapRefWidth must not be null");
        return new CustomCap(this.f14046e, this.f14047f.floatValue());
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, this.f14045d);
        C7896a aVar = this.f14046e;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.mo22867a().asBinder();
        }
        C7461a.m28382n(parcel, 3, iBinder, false);
        C7461a.m28381m(parcel, 4, this.f14047f, false);
        C7461a.m28370b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Cap(int r2, android.os.IBinder r3, java.lang.Float r4) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x000e
        L_0x0004:
            w6.b r3 = p299w6.C8859b.C8860a.m32974x(r3)
            q7.a r0 = new q7.a
            r0.<init>(r3)
            r3 = r0
        L_0x000e:
            r1.<init>((int) r2, (p222q7.C7896a) r3, (java.lang.Float) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Cap.<init>(int, android.os.IBinder, java.lang.Float):void");
    }

    private Cap(int i, C7896a aVar, Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > Utils.FLOAT_EPSILON;
        if (i == 3) {
            z = aVar != null && z2;
            i = 3;
        } else {
            z = true;
        }
        C7264i.m27893b(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), aVar, f}));
        this.f14045d = i;
        this.f14046e = aVar;
        this.f14047f = f;
    }

    protected Cap(C7896a aVar, float f) {
        this(3, aVar, Float.valueOf(f));
    }
}
