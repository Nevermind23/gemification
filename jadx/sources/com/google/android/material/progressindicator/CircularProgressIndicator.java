package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p009a8.C0072b;
import p009a8.C0081k;

public final class CircularProgressIndicator extends C5111a {

    /* renamed from: s */
    public static final int f16349s = C0081k.f373u;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f151j);
    }

    /* renamed from: s */
    private void m19994s() {
        setIndeterminateDrawable(C5132j.m20105s(getContext(), (C5123e) this.f16351d));
        setProgressDrawable(C5124f.m20053u(getContext(), (C5123e) this.f16351d));
    }

    public int getIndicatorDirection() {
        return ((C5123e) this.f16351d).f16396i;
    }

    public int getIndicatorInset() {
        return ((C5123e) this.f16351d).f16395h;
    }

    public int getIndicatorSize() {
        return ((C5123e) this.f16351d).f16394g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C5123e mo16707i(Context context, AttributeSet attributeSet) {
        return new C5123e(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((C5123e) this.f16351d).f16396i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        C5116b bVar = this.f16351d;
        if (((C5123e) bVar).f16395h != i) {
            ((C5123e) bVar).f16395h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        C5116b bVar = this.f16351d;
        if (((C5123e) bVar).f16394g != max) {
            ((C5123e) bVar).f16394g = max;
            ((C5123e) bVar).mo16748e();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((C5123e) this.f16351d).mo16748e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f16349s);
        m19994s();
    }
}
