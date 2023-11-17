package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p195o6.C7461a;

public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new C4565g();

    /* renamed from: d */
    private final List f14101d;

    /* renamed from: e */
    private final List f14102e;

    /* renamed from: f */
    private float f14103f;

    /* renamed from: g */
    private int f14104g;

    /* renamed from: h */
    private int f14105h;

    /* renamed from: i */
    private float f14106i;

    /* renamed from: j */
    private boolean f14107j;

    /* renamed from: k */
    private boolean f14108k;

    /* renamed from: l */
    private boolean f14109l;

    /* renamed from: m */
    private int f14110m;

    /* renamed from: n */
    private List f14111n;

    public PolygonOptions() {
        this.f14103f = 10.0f;
        this.f14104g = -16777216;
        this.f14105h = 0;
        this.f14106i = Utils.FLOAT_EPSILON;
        this.f14107j = true;
        this.f14108k = false;
        this.f14109l = false;
        this.f14110m = 0;
        this.f14111n = null;
        this.f14101d = new ArrayList();
        this.f14102e = new ArrayList();
    }

    /* renamed from: F1 */
    public boolean mo14161F1() {
        return this.f14107j;
    }

    /* renamed from: R */
    public int mo14162R() {
        return this.f14110m;
    }

    /* renamed from: f0 */
    public List mo14163f0() {
        return this.f14111n;
    }

    /* renamed from: f1 */
    public boolean mo14164f1() {
        return this.f14109l;
    }

    /* renamed from: i1 */
    public boolean mo14165i1() {
        return this.f14108k;
    }

    /* renamed from: q0 */
    public float mo14166q0() {
        return this.f14103f;
    }

    /* renamed from: s0 */
    public float mo14167s0() {
        return this.f14106i;
    }

    /* renamed from: v */
    public int mo14168v() {
        return this.f14105h;
    }

    /* renamed from: w */
    public List mo14169w() {
        return this.f14101d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 2, mo14169w(), false);
        C7461a.m28386r(parcel, 3, this.f14102e, false);
        C7461a.m28380l(parcel, 4, mo14166q0());
        C7461a.m28383o(parcel, 5, mo14171x());
        C7461a.m28383o(parcel, 6, mo14168v());
        C7461a.m28380l(parcel, 7, mo14167s0());
        C7461a.m28372d(parcel, 8, mo14161F1());
        C7461a.m28372d(parcel, 9, mo14165i1());
        C7461a.m28372d(parcel, 10, mo14164f1());
        C7461a.m28383o(parcel, 11, mo14162R());
        C7461a.m28364C(parcel, 12, mo14163f0(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo14171x() {
        return this.f14104g;
    }

    PolygonOptions(List list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List list3) {
        this.f14101d = list;
        this.f14102e = list2;
        this.f14103f = f;
        this.f14104g = i;
        this.f14105h = i2;
        this.f14106i = f2;
        this.f14107j = z;
        this.f14108k = z2;
        this.f14109l = z3;
        this.f14110m = i3;
        this.f14111n = list3;
    }
}
