package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import com.github.mikephil.charting.utils.Utils;
import p366bk.C10313b;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.ErrorLoadingView */
public class ErrorLoadingView extends FrameLayout implements View.OnClickListener {
    private Runnable executorRunnable;
    private ImageView refreshIV;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.ErrorLoadingView$a */
    class C35737a implements Runnable {
        C35737a() {
        }

        public void run() {
            ErrorLoadingView.this.setVisibility(8);
        }
    }

    public ErrorLoadingView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void hideLayout() {
        if (getVisibility() == 0) {
            animate().alpha(Utils.FLOAT_EPSILON).setDuration(100).withEndAction(new C35737a());
        }
        stopAnimating();
    }

    public void onClick(View view) {
        if (this.executorRunnable != null) {
            this.refreshIV.startAnimation(AnimationUtils.loadAnimation(getContext(), C10313b.rotate_infinite));
            this.executorRunnable.run();
        }
    }

    public void setExecutorRunnable(Runnable runnable) {
        this.executorRunnable = runnable;
    }

    public void showLayout() {
        if (getVisibility() == 8 || getVisibility() == 4) {
            setVisibility(0);
        }
        setAlpha(Utils.FLOAT_EPSILON);
        animate().alpha(1.0f).setDuration(100);
    }

    public void stopAnimating() {
        this.refreshIV.clearAnimation();
    }

    public ErrorLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, C10324m.layout_horizontal_error, this);
        if (!isInEditMode()) {
            setBackgroundColor(C0767a.m2893c(context, C10318g.bog_card_view_background_color));
            LinearLayout linearLayout = (LinearLayout) findViewById(C10322k.horizontal_error_retry_button);
            this.refreshIV = (ImageView) linearLayout.findViewById(C10322k.retry_button_refresh_img);
            linearLayout.setOnClickListener(this);
        }
    }
}
