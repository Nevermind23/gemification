package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0483r1;
import p009a8.C0082l;

public class TabItem extends View {

    /* renamed from: d */
    public final CharSequence f16458d;

    /* renamed from: e */
    public final Drawable f16459e;

    /* renamed from: f */
    public final int f16460f;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0483r1 u = C0483r1.m1945u(context, attributeSet, C0082l.f869x6);
        this.f16458d = u.mo2329p(C0082l.f386A6);
        this.f16459e = u.mo2320g(C0082l.f879y6);
        this.f16460f = u.mo2327n(C0082l.f889z6, 0);
        u.mo2333w();
    }
}
