package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import p060e1.C5936i0;
import p060e1.C5989q0;

/* renamed from: com.google.android.material.internal.j */
public class C5085j extends C5936i0 {

    /* renamed from: com.google.android.material.internal.j$a */
    class C5086a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        final /* synthetic */ TextView f16252d;

        C5086a(TextView textView) {
            this.f16252d = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f16252d.setScaleX(floatValue);
            this.f16252d.setScaleY(floatValue);
        }
    }

    /* renamed from: A0 */
    private void m19886A0(C5989q0 q0Var) {
        View view = q0Var.f18719b;
        if (view instanceof TextView) {
            q0Var.f18718a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        m19886A0(q0Var);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        m19886A0(q0Var);
    }

    /* renamed from: r */
    public Animator mo16528r(ViewGroup viewGroup, C5989q0 q0Var, C5989q0 q0Var2) {
        float f;
        if (q0Var == null || q0Var2 == null || !(q0Var.f18719b instanceof TextView)) {
            return null;
        }
        View view = q0Var2.f18719b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = q0Var.f18718a;
        Map map2 = q0Var2.f18718a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new C5086a(textView));
        return ofFloat;
    }
}
