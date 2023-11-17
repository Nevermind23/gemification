package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import com.github.mikephil.charting.utils.Utils;
import p366bk.C10318g;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.DetailLoadingView */
public class DetailLoadingView extends FrameLayout {
    /* access modifiers changed from: private */
    public LinearLayout lineContainer;
    /* access modifiers changed from: private */
    public View[] lines;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.DetailLoadingView$a */
    class C35732a implements Runnable {
        C35732a() {
        }

        public void run() {
            DetailLoadingView.this.startAnimation();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.DetailLoadingView$b */
    class C35733b implements Runnable {

        /* renamed from: ge.bog.mobilebank.ui.views.widgets.DetailLoadingView$b$a */
        class C35734a implements Runnable {
            C35734a() {
            }

            public void run() {
                DetailLoadingView.this.removeAnimations();
                DetailLoadingView.this.startAnimation();
            }
        }

        C35733b() {
        }

        public void run() {
            DetailLoadingView.this.lineContainer.animate().alpha(Utils.FLOAT_EPSILON).setDuration(400).withEndAction(new C35734a());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.DetailLoadingView$c */
    class C35735c implements Runnable {
        C35735c() {
        }

        public void run() {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.DetailLoadingView$d */
    class C35736d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ boolean f86361d;

        C35736d(boolean z) {
            this.f86361d = z;
        }

        public void run() {
            if (this.f86361d) {
                for (View clearAnimation : DetailLoadingView.this.lines) {
                    clearAnimation.clearAnimation();
                }
            }
            DetailLoadingView.this.setVisibility(8);
        }
    }

    public DetailLoadingView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void removeAnimations() {
        for (View view : this.lines) {
            view.clearAnimation();
            view.setAlpha(Utils.FLOAT_EPSILON);
        }
    }

    public void hideLayout() {
        hideLayout(true);
    }

    public void showLayout() {
        showLayout(true);
    }

    public void startAnimation() {
        this.lineContainer.setAlpha(1.0f);
        int i = 0;
        while (true) {
            View[] viewArr = this.lines;
            if (i < viewArr.length) {
                ViewPropertyAnimator startDelay = viewArr[i].animate().setDuration(500).alpha(0.6f).setStartDelay((long) (i * 100));
                if (i == this.lines.length - 1) {
                    startDelay.withEndAction(new C35733b());
                }
                i++;
            } else {
                return;
            }
        }
    }

    public DetailLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        setFocusable(true);
        View.inflate(context, C10324m.detail_loading_view, this);
        setBackgroundColor(C0767a.m2893c(context, C10318g.bog_activity_background_color));
        if (!isInEditMode()) {
            int i = 0;
            LinearLayout linearLayout = (LinearLayout) getChildAt(0);
            this.lineContainer = linearLayout;
            this.lines = new View[linearLayout.getChildCount()];
            while (true) {
                View[] viewArr = this.lines;
                if (i < viewArr.length) {
                    viewArr[i] = this.lineContainer.getChildAt(i);
                    this.lines[i].setAlpha(Utils.FLOAT_EPSILON);
                    i++;
                } else {
                    post(new C35732a());
                    return;
                }
            }
        }
    }

    public void hideLayout(boolean z) {
        animate().alpha(Utils.FLOAT_EPSILON).withEndAction(new C35736d(z));
    }

    public void showLayout(boolean z) {
        setVisibility(0);
        animate().alpha(1.0f).withEndAction(new C35735c());
        if (z) {
            startAnimation();
        }
    }
}
