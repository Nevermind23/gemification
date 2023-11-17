package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.C1008h;
import androidx.core.view.ViewCompat;
import p009a8.C0082l;
import p184n8.C7343c;
import p223q8.C7922g;
import p223q8.C7929k;

/* renamed from: com.google.android.material.datepicker.a */
final class C5000a {

    /* renamed from: a */
    private final Rect f15949a;

    /* renamed from: b */
    private final ColorStateList f15950b;

    /* renamed from: c */
    private final ColorStateList f15951c;

    /* renamed from: d */
    private final ColorStateList f15952d;

    /* renamed from: e */
    private final int f15953e;

    /* renamed from: f */
    private final C7929k f15954f;

    private C5000a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C7929k kVar, Rect rect) {
        C1008h.m3527d(rect.left);
        C1008h.m3527d(rect.top);
        C1008h.m3527d(rect.right);
        C1008h.m3527d(rect.bottom);
        this.f15949a = rect;
        this.f15950b = colorStateList2;
        this.f15951c = colorStateList;
        this.f15952d = colorStateList3;
        this.f15953e = i;
        this.f15954f = kVar;
    }

    /* renamed from: a */
    static C5000a m19478a(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C1008h.m3525b(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0082l.f609X3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C0082l.f618Y3, 0), obtainStyledAttributes.getDimensionPixelOffset(C0082l.f637a4, 0), obtainStyledAttributes.getDimensionPixelOffset(C0082l.f627Z3, 0), obtainStyledAttributes.getDimensionPixelOffset(C0082l.f647b4, 0));
        ColorStateList a = C7343c.m28003a(context, obtainStyledAttributes, C0082l.f657c4);
        ColorStateList a2 = C7343c.m28003a(context, obtainStyledAttributes, C0082l.f707h4);
        ColorStateList a3 = C7343c.m28003a(context, obtainStyledAttributes, C0082l.f687f4);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0082l.f697g4, 0);
        C7929k m = C7929k.m29975b(context, obtainStyledAttributes.getResourceId(C0082l.f667d4, 0), obtainStyledAttributes.getResourceId(C0082l.f677e4, 0)).mo22998m();
        obtainStyledAttributes.recycle();
        return new C5000a(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo16240b() {
        return this.f15949a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo16241c() {
        return this.f15949a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo16242d(TextView textView) {
        C7922g gVar = new C7922g();
        C7922g gVar2 = new C7922g();
        gVar.setShapeAppearanceModel(this.f15954f);
        gVar2.setShapeAppearanceModel(this.f15954f);
        gVar.mo22941X(this.f15951c);
        gVar.mo22948e0((float) this.f15953e, this.f15952d);
        textView.setTextColor(this.f15950b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f15950b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f15949a;
        ViewCompat.m3627v0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
