package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StrokeStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p182n6.C7264i;
import p195o6.C7461a;

public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new C4566h();

    /* renamed from: d */
    private final List f14112d;

    /* renamed from: e */
    private float f14113e;

    /* renamed from: f */
    private int f14114f;

    /* renamed from: g */
    private float f14115g;

    /* renamed from: h */
    private boolean f14116h;

    /* renamed from: i */
    private boolean f14117i;

    /* renamed from: j */
    private boolean f14118j;

    /* renamed from: k */
    private Cap f14119k;

    /* renamed from: l */
    private Cap f14120l;

    /* renamed from: m */
    private int f14121m;

    /* renamed from: n */
    private List f14122n;

    /* renamed from: o */
    private List f14123o;

    public PolylineOptions() {
        this.f14113e = 10.0f;
        this.f14114f = -16777216;
        this.f14115g = Utils.FLOAT_EPSILON;
        this.f14116h = true;
        this.f14117i = false;
        this.f14118j = false;
        this.f14119k = new ButtCap();
        this.f14120l = new ButtCap();
        this.f14121m = 0;
        this.f14122n = null;
        this.f14123o = new ArrayList();
        this.f14112d = new ArrayList();
    }

    /* renamed from: F1 */
    public float mo14172F1() {
        return this.f14115g;
    }

    /* renamed from: G1 */
    public boolean mo14173G1() {
        return this.f14118j;
    }

    /* renamed from: H1 */
    public boolean mo14174H1() {
        return this.f14117i;
    }

    /* renamed from: I1 */
    public boolean mo14175I1() {
        return this.f14116h;
    }

    /* renamed from: J1 */
    public PolylineOptions mo14176J1(float f) {
        this.f14113e = f;
        return this;
    }

    /* renamed from: R */
    public Cap mo14177R() {
        return this.f14120l.mo14096v();
    }

    /* renamed from: f0 */
    public int mo14178f0() {
        return this.f14121m;
    }

    /* renamed from: f1 */
    public Cap mo14179f1() {
        return this.f14119k.mo14096v();
    }

    /* renamed from: i1 */
    public float mo14180i1() {
        return this.f14113e;
    }

    /* renamed from: q0 */
    public List mo14181q0() {
        return this.f14122n;
    }

    /* renamed from: s0 */
    public List mo14182s0() {
        return this.f14112d;
    }

    /* renamed from: v */
    public PolylineOptions mo14183v(Iterable iterable) {
        C7264i.m27903l(iterable, "points must not be null.");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f14112d.add((LatLng) it.next());
        }
        return this;
    }

    /* renamed from: w */
    public PolylineOptions mo14184w(int i) {
        this.f14114f = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 2, mo14182s0(), false);
        C7461a.m28380l(parcel, 3, mo14180i1());
        C7461a.m28383o(parcel, 4, mo14186x());
        C7461a.m28380l(parcel, 5, mo14172F1());
        C7461a.m28372d(parcel, 6, mo14175I1());
        C7461a.m28372d(parcel, 7, mo14174H1());
        C7461a.m28372d(parcel, 8, mo14173G1());
        C7461a.m28390v(parcel, 9, mo14179f1(), i, false);
        C7461a.m28390v(parcel, 10, mo14177R(), i, false);
        C7461a.m28383o(parcel, 11, mo14178f0());
        C7461a.m28364C(parcel, 12, mo14181q0(), false);
        ArrayList arrayList = new ArrayList(this.f14123o.size());
        for (StyleSpan styleSpan : this.f14123o) {
            StrokeStyle.C4558a aVar = new StrokeStyle.C4558a(styleSpan.mo14220w());
            aVar.mo14218c(this.f14113e);
            aVar.mo14217b(this.f14116h);
            arrayList.add(new StyleSpan(aVar.mo14216a(), styleSpan.mo14219v()));
        }
        C7461a.m28364C(parcel, 13, arrayList, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo14186x() {
        return this.f14114f;
    }

    PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List list2, List list3) {
        this.f14113e = 10.0f;
        this.f14114f = -16777216;
        this.f14115g = Utils.FLOAT_EPSILON;
        this.f14116h = true;
        this.f14117i = false;
        this.f14118j = false;
        this.f14119k = new ButtCap();
        this.f14120l = new ButtCap();
        this.f14121m = 0;
        this.f14122n = null;
        this.f14123o = new ArrayList();
        this.f14112d = list;
        this.f14113e = f;
        this.f14114f = i;
        this.f14115g = f2;
        this.f14116h = z;
        this.f14117i = z2;
        this.f14118j = z3;
        if (cap != null) {
            this.f14119k = cap;
        }
        if (cap2 != null) {
            this.f14120l = cap2;
        }
        this.f14121m = i2;
        this.f14122n = list2;
        if (list3 != null) {
            this.f14123o = list3;
        }
    }
}
