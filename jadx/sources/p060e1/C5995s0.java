package p060e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import p060e1.C5936i0;

/* renamed from: e1.s0 */
abstract class C5995s0 {

    /* renamed from: e1.s0$a */
    private static class C5996a extends AnimatorListenerAdapter implements C5936i0.C5943g {

        /* renamed from: d */
        private final View f18735d;

        /* renamed from: e */
        private final View f18736e;

        /* renamed from: f */
        private final int f18737f;

        /* renamed from: g */
        private final int f18738g;

        /* renamed from: h */
        private int[] f18739h;

        /* renamed from: i */
        private float f18740i;

        /* renamed from: j */
        private float f18741j;

        /* renamed from: k */
        private final float f18742k;

        /* renamed from: l */
        private final float f18743l;

        C5996a(View view, View view2, int i, int i2, float f, float f2) {
            this.f18736e = view;
            this.f18735d = view2;
            this.f18737f = i - Math.round(view.getTranslationX());
            this.f18738g = i2 - Math.round(view.getTranslationY());
            this.f18742k = f;
            this.f18743l = f2;
            int i3 = C5894c0.f18493f;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f18739h = iArr;
            if (iArr != null) {
                view2.setTag(i3, (Object) null);
            }
        }

        /* renamed from: a */
        public void mo19292a(C5936i0 i0Var) {
        }

        /* renamed from: b */
        public void mo19293b(C5936i0 i0Var) {
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            this.f18736e.setTranslationX(this.f18742k);
            this.f18736e.setTranslationY(this.f18743l);
            i0Var.mo19343k0(this);
        }

        /* renamed from: d */
        public void mo19368d(C5936i0 i0Var) {
        }

        /* renamed from: e */
        public void mo19295e(C5936i0 i0Var) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f18739h == null) {
                this.f18739h = new int[2];
            }
            this.f18739h[0] = Math.round(((float) this.f18737f) + this.f18736e.getTranslationX());
            this.f18739h[1] = Math.round(((float) this.f18738g) + this.f18736e.getTranslationY());
            this.f18735d.setTag(C5894c0.f18493f, this.f18739h);
        }

        public void onAnimationPause(Animator animator) {
            this.f18740i = this.f18736e.getTranslationX();
            this.f18741j = this.f18736e.getTranslationY();
            this.f18736e.setTranslationX(this.f18742k);
            this.f18736e.setTranslationY(this.f18743l);
        }

        public void onAnimationResume(Animator animator) {
            this.f18736e.setTranslationX(this.f18740i);
            this.f18736e.setTranslationY(this.f18741j);
        }
    }

    /* renamed from: a */
    static Animator m24078a(View view, C5989q0 q0Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, C5936i0 i0Var) {
        float f5;
        float f6;
        View view2 = view;
        C5989q0 q0Var2 = q0Var;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) q0Var2.f18719b.getTag(C5894c0.f18493f);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C5996a aVar = new C5996a(view, q0Var2.f18719b, round, round2, translationX, translationY);
        i0Var.mo19333a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C5885a.m23678a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
