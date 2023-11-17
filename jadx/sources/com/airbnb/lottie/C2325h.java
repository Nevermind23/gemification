package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p048d2.C5804f;
import p048d2.C5807i;
import p294w1.C8741h;
import p331z1.C9174e;

/* renamed from: com.airbnb.lottie.h */
public class C2325h {

    /* renamed from: a */
    private final C2335l0 f7252a = new C2335l0();

    /* renamed from: b */
    private final HashSet f7253b = new HashSet();

    /* renamed from: c */
    private Map f7254c;

    /* renamed from: d */
    private Map f7255d;

    /* renamed from: e */
    private Map f7256e;

    /* renamed from: f */
    private List f7257f;

    /* renamed from: g */
    private SparseArrayCompat f7258g;

    /* renamed from: h */
    private LongSparseArray f7259h;

    /* renamed from: i */
    private List f7260i;

    /* renamed from: j */
    private Rect f7261j;

    /* renamed from: k */
    private float f7262k;

    /* renamed from: l */
    private float f7263l;

    /* renamed from: m */
    private float f7264m;

    /* renamed from: n */
    private boolean f7265n;

    /* renamed from: o */
    private int f7266o = 0;

    /* renamed from: a */
    public void mo7542a(String str) {
        C5804f.m23334c(str);
        this.f7253b.add(str);
    }

    /* renamed from: b */
    public Rect mo7543b() {
        return this.f7261j;
    }

    /* renamed from: c */
    public SparseArrayCompat mo7544c() {
        return this.f7258g;
    }

    /* renamed from: d */
    public float mo7545d() {
        return (float) ((long) ((mo7546e() / this.f7264m) * 1000.0f));
    }

    /* renamed from: e */
    public float mo7546e() {
        return this.f7263l - this.f7262k;
    }

    /* renamed from: f */
    public float mo7547f() {
        return this.f7263l;
    }

    /* renamed from: g */
    public Map mo7548g() {
        return this.f7256e;
    }

    /* renamed from: h */
    public float mo7549h(float f) {
        return C5807i.m23370i(this.f7262k, this.f7263l, f);
    }

    /* renamed from: i */
    public float mo7550i() {
        return this.f7264m;
    }

    /* renamed from: j */
    public Map mo7551j() {
        return this.f7255d;
    }

    /* renamed from: k */
    public List mo7552k() {
        return this.f7260i;
    }

    /* renamed from: l */
    public C8741h mo7553l(String str) {
        int size = this.f7257f.size();
        for (int i = 0; i < size; i++) {
            C8741h hVar = (C8741h) this.f7257f.get(i);
            if (hVar.mo24147a(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public int mo7554m() {
        return this.f7266o;
    }

    /* renamed from: n */
    public C2335l0 mo7555n() {
        return this.f7252a;
    }

    /* renamed from: o */
    public List mo7556o(String str) {
        return (List) this.f7254c.get(str);
    }

    /* renamed from: p */
    public float mo7557p() {
        return this.f7262k;
    }

    /* renamed from: q */
    public boolean mo7558q() {
        return this.f7265n;
    }

    /* renamed from: r */
    public void mo7559r(int i) {
        this.f7266o += i;
    }

    /* renamed from: s */
    public void mo7560s(Rect rect, float f, float f2, float f3, List list, LongSparseArray longSparseArray, Map map, Map map2, SparseArrayCompat sparseArrayCompat, Map map3, List list2) {
        this.f7261j = rect;
        this.f7262k = f;
        this.f7263l = f2;
        this.f7264m = f3;
        this.f7260i = list;
        this.f7259h = longSparseArray;
        this.f7254c = map;
        this.f7255d = map2;
        this.f7258g = sparseArrayCompat;
        this.f7256e = map3;
        this.f7257f = list2;
    }

    /* renamed from: t */
    public C9174e mo7561t(long j) {
        return (C9174e) this.f7259h.get(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C9174e y : this.f7260i) {
            sb.append(y.mo24785y("\t"));
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo7563u(boolean z) {
        this.f7265n = z;
    }

    /* renamed from: v */
    public void mo7564v(boolean z) {
        this.f7252a.mo7579b(z);
    }
}
