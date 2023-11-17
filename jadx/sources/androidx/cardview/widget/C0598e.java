package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.e */
abstract class C0598e extends Drawable {

    /* renamed from: a */
    private static final double f2450a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    static float m2327a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f2450a) * ((double) f2))) : f;
    }

    /* renamed from: b */
    static float m2328b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f2450a) * ((double) f2))) : f * 1.5f;
    }
}
