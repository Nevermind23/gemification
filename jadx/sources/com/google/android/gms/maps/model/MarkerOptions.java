package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p222q7.C7896a;
import p299w6.C8859b;

public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new C4564f();

    /* renamed from: d */
    private LatLng f14082d;

    /* renamed from: e */
    private String f14083e;

    /* renamed from: f */
    private String f14084f;

    /* renamed from: g */
    private C7896a f14085g;

    /* renamed from: h */
    private float f14086h = 0.5f;

    /* renamed from: i */
    private float f14087i = 1.0f;

    /* renamed from: j */
    private boolean f14088j;

    /* renamed from: k */
    private boolean f14089k = true;

    /* renamed from: l */
    private boolean f14090l = false;

    /* renamed from: m */
    private float f14091m = Utils.FLOAT_EPSILON;

    /* renamed from: n */
    private float f14092n = 0.5f;

    /* renamed from: o */
    private float f14093o = Utils.FLOAT_EPSILON;

    /* renamed from: p */
    private float f14094p = 1.0f;

    /* renamed from: q */
    private float f14095q;

    public MarkerOptions() {
    }

    /* renamed from: F1 */
    public String mo14137F1() {
        return this.f14083e;
    }

    /* renamed from: G1 */
    public float mo14138G1() {
        return this.f14095q;
    }

    /* renamed from: H1 */
    public MarkerOptions mo14139H1(C7896a aVar) {
        this.f14085g = aVar;
        return this;
    }

    /* renamed from: I1 */
    public boolean mo14140I1() {
        return this.f14088j;
    }

    /* renamed from: J1 */
    public boolean mo14141J1() {
        return this.f14090l;
    }

    /* renamed from: K1 */
    public boolean mo14142K1() {
        return this.f14089k;
    }

    /* renamed from: L1 */
    public MarkerOptions mo14143L1(LatLng latLng) {
        if (latLng != null) {
            this.f14082d = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: M1 */
    public MarkerOptions mo14144M1(String str) {
        this.f14084f = str;
        return this;
    }

    /* renamed from: N1 */
    public MarkerOptions mo14145N1(String str) {
        this.f14083e = str;
        return this;
    }

    /* renamed from: O1 */
    public MarkerOptions mo14146O1(float f) {
        this.f14095q = f;
        return this;
    }

    /* renamed from: R */
    public float mo14147R() {
        return this.f14087i;
    }

    /* renamed from: f0 */
    public float mo14148f0() {
        return this.f14092n;
    }

    /* renamed from: f1 */
    public float mo14149f1() {
        return this.f14091m;
    }

    /* renamed from: i1 */
    public String mo14150i1() {
        return this.f14084f;
    }

    /* renamed from: q0 */
    public float mo14151q0() {
        return this.f14093o;
    }

    /* renamed from: s0 */
    public LatLng mo14152s0() {
        return this.f14082d;
    }

    /* renamed from: v */
    public MarkerOptions mo14153v(float f, float f2) {
        this.f14086h = f;
        this.f14087i = f2;
        return this;
    }

    /* renamed from: w */
    public float mo14154w() {
        return this.f14094p;
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, mo14152s0(), i, false);
        C7461a.m28392x(parcel, 3, mo14137F1(), false);
        C7461a.m28392x(parcel, 4, mo14150i1(), false);
        C7896a aVar = this.f14085g;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.mo22867a().asBinder();
        }
        C7461a.m28382n(parcel, 5, iBinder, false);
        C7461a.m28380l(parcel, 6, mo14156x());
        C7461a.m28380l(parcel, 7, mo14147R());
        C7461a.m28372d(parcel, 8, mo14140I1());
        C7461a.m28372d(parcel, 9, mo14142K1());
        C7461a.m28372d(parcel, 10, mo14141J1());
        C7461a.m28380l(parcel, 11, mo14149f1());
        C7461a.m28380l(parcel, 12, mo14148f0());
        C7461a.m28380l(parcel, 13, mo14151q0());
        C7461a.m28380l(parcel, 14, mo14154w());
        C7461a.m28380l(parcel, 15, mo14138G1());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public float mo14156x() {
        return this.f14086h;
    }

    MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f14082d = latLng;
        this.f14083e = str;
        this.f14084f = str2;
        if (iBinder == null) {
            this.f14085g = null;
        } else {
            this.f14085g = new C7896a(C8859b.C8860a.m32974x(iBinder));
        }
        this.f14086h = f;
        this.f14087i = f2;
        this.f14088j = z;
        this.f14089k = z2;
        this.f14090l = z3;
        this.f14091m = f3;
        this.f14092n = f4;
        this.f14093o = f5;
        this.f14094p = f6;
        this.f14095q = f7;
    }
}
