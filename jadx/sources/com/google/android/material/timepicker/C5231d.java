package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0630d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import p009a8.C0076f;
import p009a8.C0078h;
import p009a8.C0082l;
import p223q8.C7922g;
import p223q8.C7927i;

/* renamed from: com.google.android.material.timepicker.d */
abstract class C5231d extends ConstraintLayout {

    /* renamed from: d */
    private final Runnable f16770d = new C5230c(this);

    /* renamed from: e */
    private int f16771e;

    /* renamed from: f */
    private C7922g f16772f;

    public C5231d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0078h.f300j, this);
        ViewCompat.m3627v0(this, m20650h());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f465I5, i, 0);
        this.f16771e = obtainStyledAttributes.getDimensionPixelSize(C0082l.f475J5, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    private Drawable m20650h() {
        C7922g gVar = new C7922g();
        this.f16772f = gVar;
        gVar.mo22939V(new C7927i(0.5f));
        this.f16772f.mo22941X(ColorStateList.valueOf(-1));
        return this.f16772f;
    }

    /* renamed from: k */
    private static boolean m20651k(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: m */
    private void m20652m() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f16770d);
            handler.post(this.f16770d);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.m3604k());
        }
        m20652m();
    }

    /* renamed from: i */
    public int mo17389i() {
        return this.f16771e;
    }

    /* renamed from: j */
    public void mo17357j(int i) {
        this.f16771e = i;
        mo17390l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo17390l() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m20651k(getChildAt(i2))) {
                i++;
            }
        }
        C0630d dVar = new C0630d();
        dVar.mo2942h(this);
        float f = Utils.FLOAT_EPSILON;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = C0076f.f264c;
            if (id != i4 && !m20651k(childAt)) {
                dVar.mo2945k(childAt.getId(), i4, this.f16771e, f);
                f += 360.0f / ((float) (childCount - i));
            }
        }
        dVar.mo2937c(this);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo17390l();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m20652m();
    }

    public void setBackgroundColor(int i) {
        this.f16772f.mo22941X(ColorStateList.valueOf(i));
    }
}
