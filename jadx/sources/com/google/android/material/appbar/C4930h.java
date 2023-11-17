package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: com.google.android.material.appbar.h */
class C4930h {

    /* renamed from: a */
    private final View f15508a;

    /* renamed from: b */
    private int f15509b;

    /* renamed from: c */
    private int f15510c;

    /* renamed from: d */
    private int f15511d;

    /* renamed from: e */
    private int f15512e;

    /* renamed from: f */
    private boolean f15513f = true;

    /* renamed from: g */
    private boolean f15514g = true;

    public C4930h(View view) {
        this.f15508a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15468a() {
        View view = this.f15508a;
        ViewCompat.m3589c0(view, this.f15511d - (view.getTop() - this.f15509b));
        View view2 = this.f15508a;
        ViewCompat.m3587b0(view2, this.f15512e - (view2.getLeft() - this.f15510c));
    }

    /* renamed from: b */
    public int mo15469b() {
        return this.f15509b;
    }

    /* renamed from: c */
    public int mo15470c() {
        return this.f15511d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo15471d() {
        this.f15509b = this.f15508a.getTop();
        this.f15510c = this.f15508a.getLeft();
    }

    /* renamed from: e */
    public boolean mo15472e(int i) {
        if (!this.f15514g || this.f15512e == i) {
            return false;
        }
        this.f15512e = i;
        mo15468a();
        return true;
    }

    /* renamed from: f */
    public boolean mo15473f(int i) {
        if (!this.f15513f || this.f15511d == i) {
            return false;
        }
        this.f15511d = i;
        mo15468a();
        return true;
    }
}
