package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.core.content.C0767a;
import g91.C32335t0;
import p366bk.C10318g;
import p366bk.C10320i;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.AnimatedBogButton */
public class AnimatedBogButton extends BogButton {

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AnimatedBogButton$a */
    class C35712a implements ValueAnimator.AnimatorUpdateListener {
        C35712a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AnimatedBogButton.this.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AnimatedBogButton$b */
    class C35713b implements ValueAnimator.AnimatorUpdateListener {
        C35713b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AnimatedBogButton.this.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AnimatedBogButton$c */
    class C35714c extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ boolean f86336d;

        C35714c(boolean z) {
            this.f86336d = z;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f86336d) {
                AnimatedBogButton.this.setBackgroundResource(C10320i.bog_button_normal_selector);
                AnimatedBogButton.this.setTextColor(-16777216);
                return;
            }
            if (C32335t0.m95361f() == 0) {
                AnimatedBogButton.this.setBackgroundResource(C10320i.bog_button_activated_selector);
            } else if (C32335t0.m95361f() == 1) {
                AnimatedBogButton.this.setBackgroundResource(C10320i.bog_button_activated_selector_solo);
            } else if (C32335t0.m95361f() == 2) {
                AnimatedBogButton.this.setBackgroundResource(C10320i.bog_button_activated_selector_wealth);
            }
            AnimatedBogButton animatedBogButton = AnimatedBogButton.this;
            animatedBogButton.setTextColor(C0767a.m2893c(animatedBogButton.getContext(), C10318g.bog_button_active_text_selector));
        }
    }

    public AnimatedBogButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void customColorAnimation(boolean z) {
        int i;
        Integer num;
        int i2;
        Integer num2;
        if (z) {
            num2 = Integer.valueOf(Color.parseColor("#000000"));
            num = Integer.valueOf(Color.parseColor("#FFFFFF"));
            i2 = Color.parseColor("#FFFFFF");
            if (C32335t0.m95361f() == 0) {
                i = getResources().getColor(C10318g.color_primary_retail);
            } else if (C32335t0.m95361f() == 2) {
                i = getResources().getColor(C10318g.color_accent_wealth);
            } else {
                i = getResources().getColor(C10318g.color_accent_solo);
            }
        } else {
            Integer valueOf = Integer.valueOf(Color.parseColor("#FFFFFF"));
            Integer valueOf2 = Integer.valueOf(Color.parseColor("#000000"));
            i = Color.parseColor("#FFFFFF");
            if (C32335t0.m95361f() == 0) {
                i2 = getContext().getResources().getColor(C10318g.color_primary_retail);
            } else if (C32335t0.m95361f() == 2) {
                i2 = getContext().getResources().getColor(C10318g.color_accent_wealth);
            } else {
                i2 = getContext().getResources().getColor(C10318g.color_accent_solo);
            }
            Integer num3 = valueOf;
            num = valueOf2;
            num2 = num3;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{num2, num});
        ofObject.addUpdateListener(new C35712a());
        ofObject.start();
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i2), Integer.valueOf(i)});
        ofObject2.addUpdateListener(new C35713b());
        ofObject2.addListener(new C35714c(z));
        ofObject2.start();
    }

    public void setOrange(boolean z, boolean z2, boolean z3) {
        setClickable(z2);
        this.flat = false;
        this.activated = z;
        customColorAnimation(z);
    }

    public AnimatedBogButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
