package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;

/* renamed from: com.google.android.material.progressindicator.j */
public final class C5132j extends C5126g {

    /* renamed from: s */
    private C5130h f16425s;

    /* renamed from: t */
    private C5131i f16426t;

    C5132j(Context context, C5116b bVar, C5130h hVar, C5131i iVar) {
        super(context, bVar);
        mo16817w(hVar);
        mo16816v(iVar);
    }

    /* renamed from: s */
    public static C5132j m20105s(Context context, C5123e eVar) {
        return new C5132j(context, eVar, new C5117c(eVar), new C5118d(eVar));
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f16425s.mo16808g(canvas, getBounds(), mo16799g());
            this.f16425s.mo16751c(canvas, this.f16416p);
            int i = 0;
            while (true) {
                C5131i iVar = this.f16426t;
                int[] iArr = iVar.f16424c;
                if (i < iArr.length) {
                    C5130h hVar = this.f16425s;
                    Paint paint = this.f16416p;
                    float[] fArr = iVar.f16423b;
                    int i2 = i * 2;
                    hVar.mo16750b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f16425s.mo16752d();
    }

    public int getIntrinsicWidth() {
        return this.f16425s.mo16753e();
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

    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo16782l(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        super.mo16782l(animatable2Compat$AnimationCallback);
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo16784p(boolean z, boolean z2, boolean z3) {
        return super.mo16784p(z, z2, z3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo16785q(boolean z, boolean z2, boolean z3) {
        boolean q = super.mo16785q(z, z2, z3);
        if (!isRunning()) {
            this.f16426t.mo16754a();
        }
        this.f16406f.mo21227a(this.f16404d.getContentResolver());
        if (z && z3) {
            this.f16426t.mo16758g();
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
    /* renamed from: t */
    public C5131i mo16814t() {
        return this.f16426t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C5130h mo16815u() {
        return this.f16425s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo16816v(C5131i iVar) {
        this.f16426t = iVar;
        iVar.mo16810e(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo16817w(C5130h hVar) {
        this.f16425s = hVar;
        hVar.mo16807f(this);
    }
}
