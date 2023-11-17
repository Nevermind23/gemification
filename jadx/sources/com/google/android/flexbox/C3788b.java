package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.b */
public class C3788b {

    /* renamed from: a */
    int f11929a = Integer.MAX_VALUE;

    /* renamed from: b */
    int f11930b = Integer.MAX_VALUE;

    /* renamed from: c */
    int f11931c = Integer.MIN_VALUE;

    /* renamed from: d */
    int f11932d = Integer.MIN_VALUE;

    /* renamed from: e */
    int f11933e;

    /* renamed from: f */
    int f11934f;

    /* renamed from: g */
    int f11935g;

    /* renamed from: h */
    int f11936h;

    /* renamed from: i */
    int f11937i;

    /* renamed from: j */
    float f11938j;

    /* renamed from: k */
    float f11939k;

    /* renamed from: l */
    int f11940l;

    /* renamed from: m */
    int f11941m;

    /* renamed from: n */
    List f11942n = new ArrayList();

    /* renamed from: o */
    int f11943o;

    /* renamed from: p */
    int f11944p;

    /* renamed from: q */
    boolean f11945q;

    /* renamed from: r */
    boolean f11946r;

    C3788b() {
    }

    /* renamed from: a */
    public int mo11540a() {
        return this.f11935g;
    }

    /* renamed from: b */
    public int mo11541b() {
        return this.f11936h;
    }

    /* renamed from: c */
    public int mo11542c() {
        return this.f11936h - this.f11937i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11543d(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f11929a = Math.min(this.f11929a, (view.getLeft() - flexItem.mo11443Y0()) - i);
        this.f11930b = Math.min(this.f11930b, (view.getTop() - flexItem.mo11447h0()) - i2);
        this.f11931c = Math.max(this.f11931c, view.getRight() + flexItem.mo11453r1() + i3);
        this.f11932d = Math.max(this.f11932d, view.getBottom() + flexItem.mo11442W0() + i4);
    }
}
