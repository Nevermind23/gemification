package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.C5088l;
import java.util.Arrays;
import p009a8.C0072b;
import p009a8.C0081k;
import p009a8.C0082l;
import p080f8.C6170a;
import p158l8.C7014a;
import p249s8.C8273a;

/* renamed from: com.google.android.material.progressindicator.a */
public abstract class C5111a extends ProgressBar {

    /* renamed from: r */
    static final int f16350r = C0081k.f351A;

    /* renamed from: d */
    C5116b f16351d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f16352e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f16353f;

    /* renamed from: g */
    private boolean f16354g;

    /* renamed from: h */
    private final int f16355h;

    /* renamed from: i */
    private final int f16356i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f16357j = -1;

    /* renamed from: k */
    C7014a f16358k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f16359l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f16360m = 4;

    /* renamed from: n */
    private final Runnable f16361n = new C5112a();

    /* renamed from: o */
    private final Runnable f16362o = new C5113b();

    /* renamed from: p */
    private final Animatable2Compat$AnimationCallback f16363p = new C5114c();

    /* renamed from: q */
    private final Animatable2Compat$AnimationCallback f16364q = new C5115d();

    /* renamed from: com.google.android.material.progressindicator.a$a */
    class C5112a implements Runnable {
        C5112a() {
        }

        public void run() {
            C5111a.this.m20005k();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$b */
    class C5113b implements Runnable {
        C5113b() {
        }

        public void run() {
            C5111a.this.m20004j();
            long unused = C5111a.this.f16357j = -1;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$c */
    class C5114c extends Animatable2Compat$AnimationCallback {
        C5114c() {
        }

        public void onAnimationEnd(Drawable drawable) {
            C5111a.this.setIndeterminate(false);
            C5111a aVar = C5111a.this;
            aVar.mo16725o(aVar.f16352e, C5111a.this.f16353f);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$d */
    class C5115d extends Animatable2Compat$AnimationCallback {
        C5115d() {
        }

        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            if (!C5111a.this.f16359l) {
                C5111a aVar = C5111a.this;
                aVar.setVisibility(aVar.f16360m);
            }
        }
    }

    protected C5111a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C8273a.m31120c(context, attributeSet, i, f16350r), attributeSet, i);
        Context context2 = getContext();
        this.f16351d = mo16707i(context2, attributeSet);
        TypedArray i3 = C5088l.m19898i(context2, attributeSet, C0082l.f549R, i, i2, new int[0]);
        this.f16355h = i3.getInt(C0082l.f596W, -1);
        this.f16356i = Math.min(i3.getInt(C0082l.f578U, -1), 1000);
        i3.recycle();
        this.f16358k = new C7014a();
        this.f16354g = true;
    }

    private C5130h getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().mo16815u();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().mo16792v();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m20004j() {
        ((C5126g) getCurrentDrawable()).mo16784p(false, false, true);
        if (m20006m()) {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m20005k() {
        if (this.f16356i > 0) {
            this.f16357j = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    private boolean m20006m() {
        if ((getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible())) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m20007n() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().mo16814t().mo16756d(this.f16363p);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo16782l(this.f16364q);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo16782l(this.f16364q);
        }
    }

    /* renamed from: p */
    private void m20008p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo16786r(this.f16364q);
            getIndeterminateDrawable().mo16814t().mo16759h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo16786r(this.f16364q);
        }
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f16351d.f16374f;
    }

    public int[] getIndicatorColor() {
        return this.f16351d.f16371c;
    }

    public int getShowAnimationBehavior() {
        return this.f16351d.f16373e;
    }

    public int getTrackColor() {
        return this.f16351d.f16372d;
    }

    public int getTrackCornerRadius() {
        return this.f16351d.f16370b;
    }

    public int getTrackThickness() {
        return this.f16351d.f16369a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16722h(boolean z) {
        if (this.f16354g) {
            ((C5126g) getCurrentDrawable()).mo16784p(mo16732q(), false, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract C5116b mo16707i(Context context, AttributeSet attributeSet);

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo16724l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    return true;
                }
                return false;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void mo16725o(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f16352e = i;
            this.f16353f = z;
            this.f16359l = true;
            if (!getIndeterminateDrawable().isVisible() || this.f16358k.mo21227a(getContext().getContentResolver()) == Utils.FLOAT_EPSILON) {
                this.f16363p.onAnimationEnd(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().mo16814t().mo16757f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m20007n();
        if (mo16732q()) {
            m20005k();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f16362o);
        removeCallbacks(this.f16361n);
        ((C5126g) getCurrentDrawable()).mo16777h();
        m20008p();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        C5130h currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            if (currentDrawingDelegate.mo16753e() < 0) {
                i3 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            } else {
                i3 = currentDrawingDelegate.mo16753e() + getPaddingLeft() + getPaddingRight();
            }
            if (currentDrawingDelegate.mo16752d() < 0) {
                i4 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                i4 = currentDrawingDelegate.mo16752d() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        mo16722h(z);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo16722h(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo16732q() {
        if (!ViewCompat.m3578U(this) || getWindowVisibility() != 0 || !mo16724l()) {
            return false;
        }
        return true;
    }

    public void setAnimatorDurationScaleProvider(C7014a aVar) {
        this.f16358k = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f16406f = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f16406f = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f16351d.f16374f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            C5126g gVar = (C5126g) getCurrentDrawable();
            if (gVar != null) {
                gVar.mo16777h();
            }
            super.setIndeterminate(z);
            C5126g gVar2 = (C5126g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.mo16784p(mo16732q(), false, false);
            }
            if ((gVar2 instanceof C5132j) && mo16732q()) {
                ((C5132j) gVar2).mo16814t().mo16758g();
            }
            this.f16359l = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof C5132j) {
            ((C5126g) drawable).mo16777h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C6170a.m24581b(getContext(), C0072b.f157p, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f16351d.f16371c = iArr;
            getIndeterminateDrawable().mo16814t().mo16755c();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            mo16725o(i, false);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof C5124f) {
            C5124f fVar = (C5124f) drawable;
            fVar.mo16777h();
            super.setProgressDrawable(fVar);
            fVar.mo16794z(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f16351d.f16373e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        C5116b bVar = this.f16351d;
        if (bVar.f16372d != i) {
            bVar.f16372d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        C5116b bVar = this.f16351d;
        if (bVar.f16370b != i) {
            bVar.f16370b = Math.min(i, bVar.f16369a / 2);
        }
    }

    public void setTrackThickness(int i) {
        C5116b bVar = this.f16351d;
        if (bVar.f16369a != i) {
            bVar.f16369a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f16360m = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public C5132j getIndeterminateDrawable() {
        return (C5132j) super.getIndeterminateDrawable();
    }

    public C5124f getProgressDrawable() {
        return (C5124f) super.getProgressDrawable();
    }
}
