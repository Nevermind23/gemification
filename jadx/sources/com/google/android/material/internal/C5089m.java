package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.C0767a;
import androidx.core.view.C1060a1;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.google.android.material.internal.m */
public abstract class C5089m {

    /* renamed from: com.google.android.material.internal.m$a */
    class C5090a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f16256d;

        C5090a(View view) {
            this.f16256d = view;
        }

        public void run() {
            ((InputMethodManager) this.f16256d.getContext().getSystemService("input_method")).showSoftInput(this.f16256d, 1);
        }
    }

    /* renamed from: com.google.android.material.internal.m$b */
    class C5091b implements C1060a1 {

        /* renamed from: d */
        final /* synthetic */ C5093d f16257d;

        /* renamed from: e */
        final /* synthetic */ C5094e f16258e;

        C5091b(C5093d dVar, C5094e eVar) {
            this.f16257d = dVar;
            this.f16258e = eVar;
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f16257d.mo15563a(view, windowInsetsCompat, new C5094e(this.f16258e));
        }
    }

    /* renamed from: com.google.android.material.internal.m$c */
    class C5092c implements View.OnAttachStateChangeListener {
        C5092c() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.m3613o0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.m$d */
    public interface C5093d {
        /* renamed from: a */
        WindowInsetsCompat mo15563a(View view, WindowInsetsCompat windowInsetsCompat, C5094e eVar);
    }

    /* renamed from: a */
    public static void m19900a(View view, C5093d dVar) {
        ViewCompat.m3550F0(view, new C5091b(dVar, new C5094e(ViewCompat.m3551G(view), view.getPaddingTop(), ViewCompat.m3549F(view), view.getPaddingBottom())));
        m19907h(view);
    }

    /* renamed from: b */
    public static float m19901b(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static Integer m19902c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    /* renamed from: d */
    public static float m19903d(View view) {
        float f = Utils.FLOAT_EPSILON;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ViewCompat.m3628w((View) parent);
        }
        return f;
    }

    /* renamed from: e */
    public static void m19904e(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C0767a.m2900j(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: f */
    public static boolean m19905f(View view) {
        return ViewCompat.m3541B(view) == 1;
    }

    /* renamed from: g */
    public static PorterDuff.Mode m19906g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: h */
    public static void m19907h(View view) {
        if (ViewCompat.m3578U(view)) {
            ViewCompat.m3613o0(view);
        } else {
            view.addOnAttachStateChangeListener(new C5092c());
        }
    }

    /* renamed from: i */
    public static void m19908i(View view) {
        view.requestFocus();
        view.post(new C5090a(view));
    }

    /* renamed from: com.google.android.material.internal.m$e */
    public static class C5094e {

        /* renamed from: a */
        public int f16259a;

        /* renamed from: b */
        public int f16260b;

        /* renamed from: c */
        public int f16261c;

        /* renamed from: d */
        public int f16262d;

        public C5094e(int i, int i2, int i3, int i4) {
            this.f16259a = i;
            this.f16260b = i2;
            this.f16261c = i3;
            this.f16262d = i4;
        }

        /* renamed from: a */
        public void mo16535a(View view) {
            ViewCompat.m3552G0(view, this.f16259a, this.f16260b, this.f16261c, this.f16262d);
        }

        public C5094e(C5094e eVar) {
            this.f16259a = eVar.f16259a;
            this.f16260b = eVar.f16260b;
            this.f16261c = eVar.f16261c;
            this.f16262d = eVar.f16262d;
        }
    }
}
