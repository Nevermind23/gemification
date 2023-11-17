package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p182n6.C7264i;
import p195o6.C7461a;

public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new C4562d();

    /* renamed from: d */
    private LatLng f14048d;

    /* renamed from: e */
    private double f14049e;

    /* renamed from: f */
    private float f14050f;

    /* renamed from: g */
    private int f14051g;

    /* renamed from: h */
    private int f14052h;

    /* renamed from: i */
    private float f14053i;

    /* renamed from: j */
    private boolean f14054j;

    /* renamed from: k */
    private boolean f14055k;

    /* renamed from: l */
    private List f14056l;

    public CircleOptions() {
        this.f14048d = null;
        this.f14049e = Utils.DOUBLE_EPSILON;
        this.f14050f = 10.0f;
        this.f14051g = -16777216;
        this.f14052h = 0;
        this.f14053i = Utils.FLOAT_EPSILON;
        this.f14054j = true;
        this.f14055k = false;
        this.f14056l = null;
    }

    /* renamed from: F1 */
    public boolean mo14098F1() {
        return this.f14055k;
    }

    /* renamed from: G1 */
    public boolean mo14099G1() {
        return this.f14054j;
    }

    /* renamed from: H1 */
    public CircleOptions mo14100H1(double d) {
        this.f14049e = d;
        return this;
    }

    /* renamed from: I1 */
    public CircleOptions mo14101I1(float f) {
        this.f14050f = f;
        return this;
    }

    /* renamed from: R */
    public int mo14102R() {
        return this.f14052h;
    }

    /* renamed from: f0 */
    public double mo14103f0() {
        return this.f14049e;
    }

    /* renamed from: f1 */
    public float mo14104f1() {
        return this.f14050f;
    }

    /* renamed from: i1 */
    public float mo14105i1() {
        return this.f14053i;
    }

    /* renamed from: q0 */
    public int mo14106q0() {
        return this.f14051g;
    }

    /* renamed from: s0 */
    public List mo14107s0() {
        return this.f14056l;
    }

    /* renamed from: v */
    public CircleOptions mo14108v(LatLng latLng) {
        C7264i.m27903l(latLng, "center must not be null.");
        this.f14048d = latLng;
        return this;
    }

    /* renamed from: w */
    public CircleOptions mo14109w(int i) {
        this.f14052h = i;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, mo14111x(), i, false);
        C7461a.m28378j(parcel, 3, mo14103f0());
        C7461a.m28380l(parcel, 4, mo14104f1());
        C7461a.m28383o(parcel, 5, mo14106q0());
        C7461a.m28383o(parcel, 6, mo14102R());
        C7461a.m28380l(parcel, 7, mo14105i1());
        C7461a.m28372d(parcel, 8, mo14099G1());
        C7461a.m28372d(parcel, 9, mo14098F1());
        C7461a.m28364C(parcel, 10, mo14107s0(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public LatLng mo14111x() {
        return this.f14048d;
    }

    CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.f14048d = latLng;
        this.f14049e = d;
        this.f14050f = f;
        this.f14051g = i;
        this.f14052h = i2;
        this.f14053i = f2;
        this.f14054j = z;
        this.f14055k = z2;
        this.f14056l = list;
    }
}
