package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1182j3;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.github.mikephil.charting.utils.Utils;
import p030c.C2210a;
import p030c.C2219j;

/* renamed from: androidx.appcompat.widget.a */
abstract class C0392a extends ViewGroup {

    /* renamed from: d */
    protected final C0393a f2005d = new C0393a();

    /* renamed from: e */
    protected final Context f2006e;

    /* renamed from: f */
    protected ActionMenuView f2007f;

    /* renamed from: g */
    protected ActionMenuPresenter f2008g;

    /* renamed from: h */
    protected int f2009h;

    /* renamed from: i */
    protected ViewPropertyAnimatorCompat f2010i;

    /* renamed from: j */
    private boolean f2011j;

    /* renamed from: k */
    private boolean f2012k;

    /* renamed from: androidx.appcompat.widget.a$a */
    protected class C0393a implements C1182j3 {

        /* renamed from: a */
        private boolean f2013a = false;

        /* renamed from: b */
        int f2014b;

        protected C0393a() {
        }

        /* renamed from: a */
        public void mo1913a(View view) {
            this.f2013a = true;
        }

        /* renamed from: b */
        public void mo513b(View view) {
            if (!this.f2013a) {
                C0392a aVar = C0392a.this;
                aVar.f2010i = null;
                C0392a.super.setVisibility(this.f2014b);
            }
        }

        /* renamed from: c */
        public void mo514c(View view) {
            C0392a.super.setVisibility(0);
            this.f2013a = false;
        }

        /* renamed from: d */
        public C0393a mo1914d(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i) {
            C0392a.this.f2010i = viewPropertyAnimatorCompat;
            this.f2014b = i;
            return this;
        }
    }

    C0392a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C2210a.f6445a, typedValue, true) || typedValue.resourceId == 0) {
            this.f2006e = context;
        } else {
            this.f2006e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    protected static int m1597d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1910c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo1911e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: f */
    public ViewPropertyAnimatorCompat mo1247f(int i, long j) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f2010i;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.mo3470c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(Utils.FLOAT_EPSILON);
            }
            ViewPropertyAnimatorCompat b = ViewCompat.m3592e(this).mo3469b(1.0f);
            b.mo3472f(j);
            b.mo3474h(this.f2005d.mo1914d(b, i));
            return b;
        }
        ViewPropertyAnimatorCompat b2 = ViewCompat.m3592e(this).mo3469b(Utils.FLOAT_EPSILON);
        b2.mo3472f(j);
        b2.mo3474h(this.f2005d.mo1914d(b2, i));
        return b2;
    }

    public int getAnimatedVisibility() {
        if (this.f2010i != null) {
            return this.f2005d.f2014b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f2009h;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C2219j.f6750a, C2210a.f6447c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C2219j.f6795j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f2008g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1338I(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2012k = false;
        }
        if (!this.f2012k) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2012k = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2012k = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2011j = false;
        }
        if (!this.f2011j) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2011j = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2011j = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f2010i;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.mo3470c();
            }
            super.setVisibility(i);
        }
    }
}
