package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: com.google.android.material.progressindicator.h */
abstract class C5130h {

    /* renamed from: a */
    C5116b f16420a;

    /* renamed from: b */
    protected C5126g f16421b;

    public C5130h(C5116b bVar) {
        this.f16420a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo16749a(Canvas canvas, Rect rect, float f);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo16750b(Canvas canvas, Paint paint, float f, float f2, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo16751c(Canvas canvas, Paint paint);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo16752d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo16753e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo16807f(C5126g gVar) {
        this.f16421b = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo16808g(Canvas canvas, Rect rect, float f) {
        this.f16420a.mo16748e();
        mo16749a(canvas, rect, f);
    }
}
