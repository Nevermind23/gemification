package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facetec.sdk.be */
final class C2836be extends View {

    /* renamed from: a */
    private int f9183a;

    /* renamed from: b */
    private int f9184b;

    /* renamed from: c */
    private final int f9185c = 5;

    /* renamed from: d */
    private final ArrayList<C2838b> f9186d = new ArrayList<>();

    /* renamed from: e */
    private final int f9187e = 500;

    /* renamed from: f */
    private boolean f9188f = false;

    /* renamed from: com.facetec.sdk.be$a */
    static class C2837a {

        /* renamed from: a */
        float f9189a;

        /* renamed from: d */
        float f9190d = Utils.FLOAT_EPSILON;

        /* renamed from: e */
        float f9191e;

        C2837a(float f, float f2) {
            this.f9191e = f;
            this.f9189a = f2;
        }
    }

    /* renamed from: com.facetec.sdk.be$b */
    class C2838b {

        /* renamed from: a */
        ArrayList<Animator> f9192a = new ArrayList<>();

        /* renamed from: b */
        C2837a f9193b;

        /* renamed from: c */
        float f9194c = Utils.FLOAT_EPSILON;

        /* renamed from: d */
        Paint f9195d;

        /* renamed from: e */
        private int f9196e = -1;

        C2838b(float f, float f2) {
            this.f9193b = new C2837a(f, f2);
            C2836be.this.setLayerType(2, (Paint) null);
            Paint paint = new Paint(1);
            this.f9195d = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f9195d.setStrokeWidth(this.f9194c);
            this.f9195d.setColor(this.f9196e);
        }
    }

    public C2836be(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        post(new C3633v5(this));
    }

    /* renamed from: d */
    private void m11342d() {
        this.f9188f = true;
        postInvalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11344e(C2838b bVar, ValueAnimator valueAnimator) {
        bVar.f9193b.f9190d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float min = Math.min((float) this.f9184b, bVar.f9193b.f9190d);
        bVar.f9194c = min;
        Paint paint = bVar.f9195d;
        if (paint != null) {
            paint.setStrokeWidth(min);
        }
        bVar.f9195d.setAlpha(Math.round((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
        m11342d();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        ArrayList<C2838b> arrayList;
        if (this.f9188f && (arrayList = this.f9186d) != null && arrayList.size() > 0) {
            Iterator<C2838b> it = this.f9186d.iterator();
            while (it.hasNext()) {
                C2838b next = it.next();
                C2837a aVar = next.f9193b;
                canvas.drawCircle(aVar.f9191e, aVar.f9189a, aVar.f9190d, next.f9195d);
            }
            this.f9188f = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11338a(C2838b bVar, ValueAnimator valueAnimator, Animator animator) {
        bVar.f9195d.setAlpha(0);
        m11342d();
        bVar.f9192a.remove(valueAnimator);
        this.f9186d.remove(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8958c(float f, float f2) {
        if (this.f9186d.size() <= 5) {
            C2838b bVar = new C2838b(f, f2);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{bVar.f9193b.f9190d, (float) this.f9183a});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new C3589t5(this, bVar));
            ofFloat.addListener(new C3610u5(this, bVar, ofFloat));
            ofFloat.start();
            bVar.f9192a.add(ofFloat);
            this.f9186d.add(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11343e() {
        this.f9183a = Math.round(C2810ax.m10988b(50) * C2938dc.m12404e() * C2938dc.m12372c());
        this.f9184b = Math.round(C2810ax.m10988b(3) * C2938dc.m12404e() * C2938dc.m12372c());
    }
}
