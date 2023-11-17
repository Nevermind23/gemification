package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p222q7.C7896a;
import p299w6.C8859b;

public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new C4563e();

    /* renamed from: d */
    private C7896a f14061d;

    /* renamed from: e */
    private LatLng f14062e;

    /* renamed from: f */
    private float f14063f;

    /* renamed from: g */
    private float f14064g;

    /* renamed from: h */
    private LatLngBounds f14065h;

    /* renamed from: i */
    private float f14066i;

    /* renamed from: j */
    private float f14067j;

    /* renamed from: k */
    private boolean f14068k = true;

    /* renamed from: l */
    private float f14069l = Utils.FLOAT_EPSILON;

    /* renamed from: m */
    private float f14070m = 0.5f;

    /* renamed from: n */
    private float f14071n = 0.5f;

    /* renamed from: o */
    private boolean f14072o = false;

    public GroundOverlayOptions() {
    }

    /* renamed from: F1 */
    public boolean mo14113F1() {
        return this.f14072o;
    }

    /* renamed from: G1 */
    public boolean mo14114G1() {
        return this.f14068k;
    }

    /* renamed from: R */
    public LatLngBounds mo14115R() {
        return this.f14065h;
    }

    /* renamed from: f0 */
    public float mo14116f0() {
        return this.f14064g;
    }

    /* renamed from: f1 */
    public float mo14117f1() {
        return this.f14063f;
    }

    /* renamed from: i1 */
    public float mo14118i1() {
        return this.f14067j;
    }

    /* renamed from: q0 */
    public LatLng mo14119q0() {
        return this.f14062e;
    }

    /* renamed from: s0 */
    public float mo14120s0() {
        return this.f14069l;
    }

    /* renamed from: v */
    public float mo14121v() {
        return this.f14070m;
    }

    /* renamed from: w */
    public float mo14122w() {
        return this.f14071n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28382n(parcel, 2, this.f14061d.mo22867a().asBinder(), false);
        C7461a.m28390v(parcel, 3, mo14119q0(), i, false);
        C7461a.m28380l(parcel, 4, mo14117f1());
        C7461a.m28380l(parcel, 5, mo14116f0());
        C7461a.m28390v(parcel, 6, mo14115R(), i, false);
        C7461a.m28380l(parcel, 7, mo14124x());
        C7461a.m28380l(parcel, 8, mo14118i1());
        C7461a.m28372d(parcel, 9, mo14114G1());
        C7461a.m28380l(parcel, 10, mo14120s0());
        C7461a.m28380l(parcel, 11, mo14121v());
        C7461a.m28380l(parcel, 12, mo14122w());
        C7461a.m28372d(parcel, 13, mo14113F1());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public float mo14124x() {
        return this.f14066i;
    }

    GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.f14061d = new C7896a(C8859b.C8860a.m32974x(iBinder));
        this.f14062e = latLng;
        this.f14063f = f;
        this.f14064g = f2;
        this.f14065h = latLngBounds;
        this.f14066i = f3;
        this.f14067j = f4;
        this.f14068k = z;
        this.f14069l = f5;
        this.f14070m = f6;
        this.f14071n = f7;
        this.f14072o = z2;
    }
}
