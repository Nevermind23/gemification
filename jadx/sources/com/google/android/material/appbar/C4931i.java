package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C5088l;
import p009a8.C0072b;
import p009a8.C0077g;

/* renamed from: com.google.android.material.appbar.i */
abstract class C4931i {

    /* renamed from: a */
    private static final int[] f15515a = {16843848};

    /* renamed from: a */
    static void m18741a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    static void m18742b(View view, float f) {
        int integer = view.getResources().getInteger(C0077g.f289a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, C0072b.f136V, -C0072b.f137W}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    static void m18743c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray i3 = C5088l.m19898i(context, attributeSet, f15515a, i, i2, new int[0]);
        try {
            if (i3.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, i3.getResourceId(0, 0)));
            }
        } finally {
            i3.recycle();
        }
    }
}
