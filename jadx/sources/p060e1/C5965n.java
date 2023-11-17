package p060e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0820l;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: e1.n */
public class C5965n extends C5974o1 {

    /* renamed from: e1.n$a */
    class C5966a extends C5955k0 {

        /* renamed from: d */
        final /* synthetic */ View f18660d;

        C5966a(View view) {
            this.f18660d = view;
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            C5887a1.m23691h(this.f18660d, 1.0f);
            C5887a1.m23684a(this.f18660d);
            i0Var.mo19343k0(this);
        }
    }

    /* renamed from: e1.n$b */
    private static class C5967b extends AnimatorListenerAdapter {

        /* renamed from: d */
        private final View f18662d;

        /* renamed from: e */
        private boolean f18663e = false;

        C5967b(View view) {
            this.f18662d = view;
        }

        public void onAnimationEnd(Animator animator) {
            C5887a1.m23691h(this.f18662d, 1.0f);
            if (this.f18663e) {
                this.f18662d.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (ViewCompat.m3573R(this.f18662d) && this.f18662d.getLayerType() == 0) {
                this.f18663e = true;
                this.f18662d.setLayerType(2, (Paint) null);
            }
        }
    }

    public C5965n(int i) {
        mo19416H0(i);
    }

    /* renamed from: I0 */
    private Animator m23937I0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C5887a1.m23691h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C5887a1.f18479b, new float[]{f2});
        ofFloat.addListener(new C5967b(view));
        mo19333a(new C5966a(view));
        return ofFloat;
    }

    /* renamed from: J0 */
    private static float m23938J0(C5989q0 q0Var, float f) {
        Float f2;
        if (q0Var == null || (f2 = (Float) q0Var.f18718a.get("android:fade:transitionAlpha")) == null) {
            return f;
        }
        return f2.floatValue();
    }

    /* renamed from: D0 */
    public Animator mo19298D0(ViewGroup viewGroup, View view, C5989q0 q0Var, C5989q0 q0Var2) {
        float f = Utils.FLOAT_EPSILON;
        float J0 = m23938J0(q0Var, Utils.FLOAT_EPSILON);
        if (J0 != 1.0f) {
            f = J0;
        }
        return m23937I0(view, f, 1.0f);
    }

    /* renamed from: F0 */
    public Animator mo19299F0(ViewGroup viewGroup, View view, C5989q0 q0Var, C5989q0 q0Var2) {
        C5887a1.m23688e(view);
        return m23937I0(view, m23938J0(q0Var, 1.0f), Utils.FLOAT_EPSILON);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        super.mo16527n(q0Var);
        q0Var.f18718a.put("android:fade:transitionAlpha", Float.valueOf(C5887a1.m23686c(q0Var.f18719b)));
    }

    public C5965n() {
    }

    public C5965n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5930h0.f18557f);
        mo19416H0(C0820l.m3068k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, mo19413B0()));
        obtainStyledAttributes.recycle();
    }
}
