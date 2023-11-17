package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import com.github.mikephil.charting.utils.Utils;
import p046d0.C5793c;
import p046d0.C5794d;
import p046d0.C5795e;
import p080f8.C6170a;

/* renamed from: com.google.android.material.progressindicator.f */
public final class C5124f extends C5126g {

    /* renamed from: x */
    private static final C5793c f16397x = new C5125a("indicatorLevel");

    /* renamed from: s */
    private C5130h f16398s;

    /* renamed from: t */
    private final C5795e f16399t;

    /* renamed from: u */
    private final C5794d f16400u;

    /* renamed from: v */
    private float f16401v;

    /* renamed from: w */
    private boolean f16402w = false;

    /* renamed from: com.google.android.material.progressindicator.f$a */
    class C5125a extends C5793c {
        C5125a(String str) {
            super(str);
        }

        /* renamed from: c */
        public float mo16795a(C5124f fVar) {
            return fVar.m20054w() * 10000.0f;
        }

        /* renamed from: d */
        public void mo16796b(C5124f fVar, float f) {
            fVar.m20055y(f / 10000.0f);
        }
    }

    C5124f(Context context, C5116b bVar, C5130h hVar) {
        super(context, bVar);
        mo16793x(hVar);
        C5795e eVar = new C5795e();
        this.f16399t = eVar;
        eVar.mo18956d(1.0f);
        eVar.mo18958f(50.0f);
        C5794d dVar = new C5794d(this, f16397x);
        this.f16400u = dVar;
        dVar.mo18952p(eVar);
        mo16800m(1.0f);
    }

    /* renamed from: u */
    public static C5124f m20053u(Context context, C5123e eVar) {
        return new C5124f(context, eVar, new C5117c(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public float m20054w() {
        return this.f16401v;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m20055y(float f) {
        this.f16401v = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f16398s.mo16808g(canvas, getBounds(), mo16799g());
            this.f16398s.mo16751c(canvas, this.f16416p);
            Canvas canvas2 = canvas;
            this.f16398s.mo16750b(canvas2, this.f16416p, Utils.FLOAT_EPSILON, m20054w(), C6170a.m24580a(this.f16405e.f16371c[0], getAlpha()));
            canvas.restore();
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f16398s.mo16752d();
    }

    public int getIntrinsicWidth() {
        return this.f16398s.mo16753e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo16777h() {
        return super.mo16777h();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo16778i() {
        return super.mo16778i();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo16780j() {
        return super.mo16780j();
    }

    public void jumpToCurrentState() {
        this.f16400u.mo18953q();
        m20055y(((float) getLevel()) / 10000.0f);
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo16782l(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        super.mo16782l(animatable2Compat$AnimationCallback);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f16402w) {
            this.f16400u.mo18953q();
            m20055y(((float) i) / 10000.0f);
            return true;
        }
        this.f16400u.mo18918h(m20054w() * 10000.0f);
        this.f16400u.mo18949l((float) i);
        return true;
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo16784p(boolean z, boolean z2, boolean z3) {
        return super.mo16784p(z, z2, z3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo16785q(boolean z, boolean z2, boolean z3) {
        boolean q = super.mo16785q(z, z2, z3);
        float a = this.f16406f.mo21227a(this.f16404d.getContentResolver());
        if (a == Utils.FLOAT_EPSILON) {
            this.f16402w = true;
        } else {
            this.f16402w = false;
            this.f16399t.mo18958f(50.0f / a);
        }
        return q;
    }

    /* renamed from: r */
    public /* bridge */ /* synthetic */ boolean mo16786r(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        return super.mo16786r(animatable2Compat$AnimationCallback);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C5130h mo16792v() {
        return this.f16398s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo16793x(C5130h hVar) {
        this.f16398s = hVar;
        hVar.mo16807f(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo16794z(float f) {
        setLevel((int) (f * 10000.0f));
    }
}
