package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C5088l;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0082l;
import p184n8.C7343c;

/* renamed from: com.google.android.material.progressindicator.e */
public final class C5123e extends C5116b {

    /* renamed from: g */
    public int f16394g;

    /* renamed from: h */
    public int f16395h;

    /* renamed from: i */
    public int f16396i;

    public C5123e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f151j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16748e() {
    }

    public C5123e(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f16349s);
    }

    public C5123e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0074d.f205f0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0074d.f203e0);
        TypedArray i3 = C5088l.m19898i(context, attributeSet, C0082l.f844v1, i, i2, new int[0]);
        this.f16394g = Math.max(C7343c.m28006d(context, i3, C0082l.f874y1, dimensionPixelSize), this.f16369a * 2);
        this.f16395h = C7343c.m28006d(context, i3, C0082l.f864x1, dimensionPixelSize2);
        this.f16396i = i3.getInt(C0082l.f854w1, 0);
        i3.recycle();
        mo16748e();
    }
}
