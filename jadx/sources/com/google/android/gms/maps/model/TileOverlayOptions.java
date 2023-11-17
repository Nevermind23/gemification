package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p131j7.C6744g;
import p131j7.C6745h;
import p195o6.C7461a;
import p222q7.C7901f;

public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new C4560b();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6745h f14156d;

    /* renamed from: e */
    private C7901f f14157e;

    /* renamed from: f */
    private boolean f14158f = true;

    /* renamed from: g */
    private float f14159g;

    /* renamed from: h */
    private boolean f14160h = true;

    /* renamed from: i */
    private float f14161i = Utils.FLOAT_EPSILON;

    public TileOverlayOptions() {
    }

    /* renamed from: R */
    public boolean mo14223R() {
        return this.f14158f;
    }

    /* renamed from: v */
    public boolean mo14224v() {
        return this.f14160h;
    }

    /* renamed from: w */
    public float mo14225w() {
        return this.f14161i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C7461a.m28369a(parcel);
        C6745h hVar = this.f14156d;
        if (hVar == null) {
            iBinder = null;
        } else {
            iBinder = hVar.asBinder();
        }
        C7461a.m28382n(parcel, 2, iBinder, false);
        C7461a.m28372d(parcel, 3, mo14223R());
        C7461a.m28380l(parcel, 4, mo14227x());
        C7461a.m28372d(parcel, 5, mo14224v());
        C7461a.m28380l(parcel, 6, mo14225w());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public float mo14227x() {
        return this.f14159g;
    }

    TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        C4559a aVar;
        C6745h x = C6744g.m26279x(iBinder);
        this.f14156d = x;
        if (x == null) {
            aVar = null;
        } else {
            aVar = new C4559a(this);
        }
        this.f14157e = aVar;
        this.f14158f = z;
        this.f14159g = f;
        this.f14160h = z2;
        this.f14161i = f2;
    }
}
