package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p009a8.C0072b;
import p009a8.C0082l;
import p184n8.C7342b;
import p184n8.C7343c;

/* renamed from: com.google.android.material.datepicker.b */
final class C5001b {

    /* renamed from: a */
    final C5000a f15955a;

    /* renamed from: b */
    final C5000a f15956b;

    /* renamed from: c */
    final C5000a f15957c;

    /* renamed from: d */
    final C5000a f15958d;

    /* renamed from: e */
    final C5000a f15959e;

    /* renamed from: f */
    final C5000a f15960f;

    /* renamed from: g */
    final C5000a f15961g;

    /* renamed from: h */
    final Paint f15962h;

    C5001b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C7342b.m28000d(context, C0072b.f125E, C5010k.class.getCanonicalName()), C0082l.f523O3);
        this.f15955a = C5000a.m19478a(context, obtainStyledAttributes.getResourceId(C0082l.f553R3, 0));
        this.f15961g = C5000a.m19478a(context, obtainStyledAttributes.getResourceId(C0082l.f533P3, 0));
        this.f15956b = C5000a.m19478a(context, obtainStyledAttributes.getResourceId(C0082l.f543Q3, 0));
        this.f15957c = C5000a.m19478a(context, obtainStyledAttributes.getResourceId(C0082l.f563S3, 0));
        ColorStateList a = C7343c.m28003a(context, obtainStyledAttributes, C0082l.f573T3);
        this.f15958d = C5000a.m19478a(context, obtainStyledAttributes.getResourceId(C0082l.f591V3, 0));
        this.f15959e = C5000a.m19478a(context, obtainStyledAttributes.getResourceId(C0082l.f582U3, 0));
        this.f15960f = C5000a.m19478a(context, obtainStyledAttributes.getResourceId(C0082l.f600W3, 0));
        Paint paint = new Paint();
        this.f15962h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
