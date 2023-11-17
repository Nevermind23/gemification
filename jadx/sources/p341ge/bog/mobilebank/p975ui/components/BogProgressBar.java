package p341ge.bog.mobilebank.p975ui.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.C2326h0;
import com.airbnb.lottie.C2345p0;
import com.airbnb.lottie.LottieAnimationView;
import g91.C32335t0;
import p061e2.C6015c;
import p294w1.C8738e;
import p366bk.C10316e;
import p366bk.C10319h;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.components.BogProgressBar */
public class BogProgressBar extends LottieAnimationView {

    /* renamed from: v */
    private static final String[] f85883v = {"progress_orange.json", "progress_white.json", "progress_search.json"};

    /* renamed from: t */
    private int f85884t;

    /* renamed from: u */
    private int f85885u = 0;

    public BogProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m105555F(attributeSet);
    }

    /* renamed from: E */
    private void m105554E(int i) {
        C2345p0 p0Var = new C2345p0(i);
        mo7394j(new C8738e("**"), C2326h0.f7277K, new C6015c(p0Var));
    }

    /* renamed from: F */
    private void m105555F(AttributeSet attributeSet) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29463w0);
            if (obtainStyledAttributes != null) {
                this.f85885u = obtainStyledAttributes.getInt(C10330s.f29473x0, 0);
                obtainStyledAttributes.recycle();
            }
            if (this.f85885u == 2) {
                this.f85884t = getResources().getDimensionPixelSize(C10319h.search_progress_bar_size);
                m105554E(C32335t0.m95360e(getContext(), C10316e.f28613r, false));
            } else {
                this.f85884t = getResources().getDimensionPixelSize(C10319h.bog_progress_bar_size);
            }
            m105556G();
            setRepeatCount(-1);
        }
    }

    /* renamed from: G */
    private void m105556G() {
        if (this.f85885u == 0 && C32335t0.m95361f() == 1) {
            setAnimation("progress_yellow.json");
        } else {
            setAnimation(f85883v[this.f85885u]);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            mo7438w();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = this.f85884t;
        if (measuredHeight < i3) {
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        } else {
            setMeasuredDimension(i3, i3);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        try {
            if (!isShown() || i != 0) {
                if (mo7400r()) {
                    mo7395k();
                }
            } else if (!mo7400r()) {
                mo7438w();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 && mo7400r()) {
            mo7395k();
        }
    }
}
