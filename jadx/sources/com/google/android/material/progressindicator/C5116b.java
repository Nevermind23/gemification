package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C5088l;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0082l;
import p080f8.C6170a;
import p184n8.C7343c;

/* renamed from: com.google.android.material.progressindicator.b */
public abstract class C5116b {

    /* renamed from: a */
    public int f16369a;

    /* renamed from: b */
    public int f16370b;

    /* renamed from: c */
    public int[] f16371c = new int[0];

    /* renamed from: d */
    public int f16372d;

    /* renamed from: e */
    public int f16373e;

    /* renamed from: f */
    public int f16374f;

    protected C5116b(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0074d.f207g0);
        TypedArray i3 = C5088l.m19898i(context, attributeSet, C0082l.f549R, i, i2, new int[0]);
        this.f16369a = C7343c.m28006d(context, i3, C0082l.f623Z, dimensionPixelSize);
        this.f16370b = Math.min(C7343c.m28006d(context, i3, C0082l.f614Y, 0), this.f16369a / 2);
        this.f16373e = i3.getInt(C0082l.f587V, 0);
        this.f16374f = i3.getInt(C0082l.f559S, 0);
        m20014c(context, i3);
        m20015d(context, i3);
        i3.recycle();
    }

    /* renamed from: c */
    private void m20014c(Context context, TypedArray typedArray) {
        int i = C0082l.f569T;
        if (!typedArray.hasValue(i)) {
            this.f16371c = new int[]{C6170a.m24581b(context, C0072b.f157p, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f16371c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f16371c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    /* renamed from: d */
    private void m20015d(Context context, TypedArray typedArray) {
        int i = C0082l.f605X;
        if (typedArray.hasValue(i)) {
            this.f16372d = typedArray.getColor(i, -1);
            return;
        }
        this.f16372d = this.f16371c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f16372d = C6170a.m24580a(this.f16372d, (int) (f * 255.0f));
    }

    /* renamed from: a */
    public boolean mo16746a() {
        return this.f16374f != 0;
    }

    /* renamed from: b */
    public boolean mo16747b() {
        return this.f16373e != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo16748e();
}
