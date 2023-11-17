package p341ge.bog.mobilebank.p975ui.components.ripplepulse;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.utils.Utils;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.components.ripplepulse.RipplePulseLayout */
public class RipplePulseLayout extends RelativeLayout {

    /* renamed from: d */
    private Paint f85935d;

    /* renamed from: e */
    private AnimatorSet f85936e;

    /* renamed from: f */
    private boolean f85937f;

    /* renamed from: g */
    private C35560a f85938g;

    /* renamed from: ge.bog.mobilebank.ui.components.ripplepulse.RipplePulseLayout$a */
    private static class C35560a extends View {

        /* renamed from: d */
        private Paint f85939d;

        /* renamed from: e */
        private float f85940e;

        public C35560a(Context context, Paint paint, float f) {
            super(context);
            this.f85939d = paint;
            this.f85940e = f;
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f85940e, this.f85939d);
        }
    }

    public RipplePulseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m105578a(context, attributeSet);
    }

    /* renamed from: a */
    private void m105578a(Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29459v6);
            int color = obtainStyledAttributes.getColor(C10330s.f29489y6, getResources().getColor(17170459));
            float dimension = obtainStyledAttributes.getDimension(C10330s.f29499z6, (float) getMeasuredWidth());
            float dimension2 = obtainStyledAttributes.getDimension(C10330s.f29479x6, (float) (getMeasuredWidth() * 2));
            float dimension3 = obtainStyledAttributes.getDimension(C10330s.f28985A6, 4.0f);
            int integer = obtainStyledAttributes.getInteger(C10330s.f29469w6, 2000);
            m105580c(color, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, dimension3);
            m105581d(dimension2, dimension, dimension3);
            m105579b(dimension, dimension2, integer);
        }
    }

    /* renamed from: b */
    private void m105579b(float f, float f2, int i) {
        this.f85936e = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f85938g, "radius", new float[]{f, f2});
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f85938g, "alpha", new float[]{0.2f, Utils.FLOAT_EPSILON});
        ofFloat2.setRepeatCount(-1);
        this.f85936e.setDuration((long) i);
        this.f85936e.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f85936e.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    /* renamed from: c */
    private void m105580c(int i, String str, float f) {
        Paint paint = new Paint();
        this.f85935d = paint;
        paint.setColor(i);
        this.f85935d.setAntiAlias(true);
        if (str.equals("1")) {
            this.f85935d.setStyle(Paint.Style.STROKE);
            this.f85935d.setStrokeWidth(f);
            return;
        }
        this.f85935d.setStyle(Paint.Style.FILL);
        this.f85935d.setStrokeWidth(Utils.FLOAT_EPSILON);
    }

    /* renamed from: d */
    private void m105581d(float f, float f2, float f3) {
        this.f85938g = new C35560a(getContext(), this.f85935d, f2);
        int i = ((int) (f + f3)) * 2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(13, -1);
        addView(this.f85938g, layoutParams);
        this.f85938g.setVisibility(4);
    }

    /* renamed from: e */
    public void mo86538e() {
        if (!this.f85937f) {
            this.f85938g.setVisibility(0);
            this.f85936e.start();
            this.f85937f = true;
        }
    }

    /* renamed from: f */
    public void mo86539f() {
        if (this.f85937f) {
            this.f85936e.end();
            this.f85938g.setVisibility(4);
            this.f85937f = false;
        }
    }
}
