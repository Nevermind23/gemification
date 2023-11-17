package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.util.C1002c;
import androidx.core.view.C1060a1;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C5071a;
import com.google.android.material.internal.C5074b;
import com.google.android.material.internal.C5081h;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0076f;
import p009a8.C0081k;
import p009a8.C0082l;
import p026b8.C2170a;
import p119i8.C6616a;
import p292w.C8720a;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: G */
    private static final int f15456G = C0081k.f364l;

    /* renamed from: A */
    private int f15457A;

    /* renamed from: B */
    WindowInsetsCompat f15458B;

    /* renamed from: C */
    private int f15459C;

    /* renamed from: D */
    private boolean f15460D;

    /* renamed from: E */
    private int f15461E;

    /* renamed from: F */
    private boolean f15462F;

    /* renamed from: d */
    private boolean f15463d;

    /* renamed from: e */
    private int f15464e;

    /* renamed from: f */
    private ViewGroup f15465f;

    /* renamed from: g */
    private View f15466g;

    /* renamed from: h */
    private View f15467h;

    /* renamed from: i */
    private int f15468i;

    /* renamed from: j */
    private int f15469j;

    /* renamed from: k */
    private int f15470k;

    /* renamed from: l */
    private int f15471l;

    /* renamed from: m */
    private final Rect f15472m;

    /* renamed from: n */
    final C5071a f15473n;

    /* renamed from: o */
    final C6616a f15474o;

    /* renamed from: p */
    private boolean f15475p;

    /* renamed from: q */
    private boolean f15476q;

    /* renamed from: r */
    private Drawable f15477r;

    /* renamed from: s */
    Drawable f15478s;

    /* renamed from: t */
    private int f15479t;

    /* renamed from: u */
    private boolean f15480u;

    /* renamed from: v */
    private ValueAnimator f15481v;

    /* renamed from: w */
    private long f15482w;

    /* renamed from: x */
    private int f15483x;

    /* renamed from: y */
    private AppBarLayout.C4916g f15484y;

    /* renamed from: z */
    int f15485z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    class C4917a implements C1060a1 {
        C4917a() {
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return CollapsingToolbarLayout.this.mo15408o(windowInsetsCompat);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    class C4918b implements ValueAnimator.AnimatorUpdateListener {
        C4918b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$d */
    private class C4920d implements AppBarLayout.C4916g {
        C4920d() {
        }

        /* renamed from: a */
        public void mo15369a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f15485z = i;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.f15458B;
            if (windowInsetsCompat != null) {
                i2 = windowInsetsCompat.mo3496l();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                C4919c cVar = (C4919c) childAt.getLayoutParams();
                C4930h k = CollapsingToolbarLayout.m18685k(childAt);
                int i4 = cVar.f15488a;
                if (i4 == 1) {
                    k.mo15473f(C8720a.m32478b(-i, 0, CollapsingToolbarLayout.this.mo15407i(childAt)));
                } else if (i4 == 2) {
                    k.mo15473f(Math.round(((float) (-i)) * cVar.f15489b));
                }
            }
            CollapsingToolbarLayout.this.mo15454v();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f15478s != null && i2 > 0) {
                ViewCompat.m3601i0(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int C = (height - ViewCompat.m3543C(CollapsingToolbarLayout.this)) - i2;
            float f = (float) C;
            CollapsingToolbarLayout.this.f15473n.mo16493w0(Math.min(1.0f, ((float) (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger())) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f15473n.mo16475j0(collapsingToolbarLayout3.f15485z + C);
            CollapsingToolbarLayout.this.f15473n.mo16490u0(((float) Math.abs(i)) / f);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$e */
    public interface C4921e extends C5081h {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f152k);
    }

    /* renamed from: a */
    private void m18678a(int i) {
        TimeInterpolator timeInterpolator;
        m18681d();
        ValueAnimator valueAnimator = this.f15481v;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f15481v = valueAnimator2;
            if (i > this.f15479t) {
                timeInterpolator = C2170a.f6352c;
            } else {
                timeInterpolator = C2170a.f6353d;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.f15481v.addUpdateListener(new C4918b());
        } else if (valueAnimator.isRunning()) {
            this.f15481v.cancel();
        }
        this.f15481v.setDuration(this.f15482w);
        this.f15481v.setIntValues(new int[]{this.f15479t, i});
        this.f15481v.start();
    }

    /* renamed from: b */
    private TextUtils.TruncateAt m18679b(int i) {
        if (i == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i == 1) {
            return TextUtils.TruncateAt.MIDDLE;
        }
        if (i != 3) {
            return TextUtils.TruncateAt.END;
        }
        return TextUtils.TruncateAt.MARQUEE;
    }

    /* renamed from: c */
    private void m18680c(AppBarLayout appBarLayout) {
        if (m18686l()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18681d() {
        /*
            r6 = this;
            boolean r0 = r6.f15463d
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f15465f = r0
            r6.f15466g = r0
            int r1 = r6.f15464e
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f15465f = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.m18682e(r1)
            r6.f15466g = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.f15465f
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = m18687m(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.f15465f = r0
        L_0x003e:
            r6.m18693u()
            r6.f15463d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.m18681d():void");
    }

    /* renamed from: e */
    private View m18682e(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: h */
    private static int m18683h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: j */
    private static CharSequence m18684j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    /* renamed from: k */
    static C4930h m18685k(View view) {
        int i = C0076f.f269e0;
        C4930h hVar = (C4930h) view.getTag(i);
        if (hVar != null) {
            return hVar;
        }
        C4930h hVar2 = new C4930h(view);
        view.setTag(i, hVar2);
        return hVar2;
    }

    /* renamed from: l */
    private boolean m18686l() {
        return this.f15457A == 1;
    }

    /* renamed from: m */
    private static boolean m18687m(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    /* renamed from: n */
    private boolean m18688n(View view) {
        View view2 = this.f15466g;
        if (view2 == null || view2 == this) {
            if (view == this.f15465f) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private void m18689q(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View view = this.f15466g;
        if (view == null) {
            view = this.f15465f;
        }
        int i6 = mo15407i(view);
        C5074b.m19850a(this, this.f15467h, this.f15472m);
        ViewGroup viewGroup = this.f15465f;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i3 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i = toolbar.getTitleMarginTop();
            i4 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i3 = 0;
            i4 = 0;
            i2 = 0;
            i = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i3 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i = toolbar2.getTitleMarginTop();
            i4 = toolbar2.getTitleMarginBottom();
        }
        C5071a aVar = this.f15473n;
        Rect rect = this.f15472m;
        int i7 = rect.left;
        if (z) {
            i5 = i2;
        } else {
            i5 = i3;
        }
        int i8 = i7 + i5;
        int i9 = rect.top + i6 + i;
        int i12 = rect.right;
        if (!z) {
            i3 = i2;
        }
        aVar.mo16469b0(i8, i9, i12 - i3, (rect.bottom + i6) - i4);
    }

    /* renamed from: r */
    private void m18690r() {
        setContentDescription(getTitle());
    }

    /* renamed from: s */
    private void m18691s(Drawable drawable, int i, int i2) {
        m18692t(drawable, this.f15465f, i, i2);
    }

    /* renamed from: t */
    private void m18692t(Drawable drawable, View view, int i, int i2) {
        if (m18686l() && view != null && this.f15475p) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: u */
    private void m18693u() {
        View view;
        if (!this.f15475p && (view = this.f15467h) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f15467h);
            }
        }
        if (this.f15475p && this.f15465f != null) {
            if (this.f15467h == null) {
                this.f15467h = new View(getContext());
            }
            if (this.f15467h.getParent() == null) {
                this.f15465f.addView(this.f15467h, -1, -1);
            }
        }
    }

    /* renamed from: w */
    private void m18694w(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int i5;
        int i6;
        if (this.f15475p && (view = this.f15467h) != null) {
            boolean z3 = false;
            if (!ViewCompat.m3578U(view) || this.f15467h.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f15476q = z2;
            if (z2 || z) {
                if (ViewCompat.m3541B(this) == 1) {
                    z3 = true;
                }
                m18689q(z3);
                C5071a aVar = this.f15473n;
                if (z3) {
                    i5 = this.f15470k;
                } else {
                    i5 = this.f15468i;
                }
                int i7 = this.f15472m.top + this.f15469j;
                int i8 = i3 - i;
                if (z3) {
                    i6 = this.f15468i;
                } else {
                    i6 = this.f15470k;
                }
                aVar.mo16476k0(i5, i7, i8 - i6, (i4 - i2) - this.f15471l);
                this.f15473n.mo16468Z(z);
            }
        }
    }

    /* renamed from: x */
    private void m18695x() {
        if (this.f15465f != null && this.f15475p && TextUtils.isEmpty(this.f15473n.mo16463M())) {
            setTitle(m18684j(this.f15465f));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4919c;
    }

    public void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        m18681d();
        if (this.f15465f == null && (drawable = this.f15477r) != null && this.f15479t > 0) {
            drawable.mutate().setAlpha(this.f15479t);
            this.f15477r.draw(canvas);
        }
        if (this.f15475p && this.f15476q) {
            if (this.f15465f == null || this.f15477r == null || this.f15479t <= 0 || !m18686l() || this.f15473n.mo16448D() >= this.f15473n.mo16450E()) {
                this.f15473n.mo16477l(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f15477r.getBounds(), Region.Op.DIFFERENCE);
                this.f15473n.mo16477l(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f15478s != null && this.f15479t > 0) {
            WindowInsetsCompat windowInsetsCompat = this.f15458B;
            if (windowInsetsCompat != null) {
                i = windowInsetsCompat.mo3496l();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f15478s.setBounds(0, -this.f15485z, getWidth(), i - this.f15485z);
                this.f15478s.mutate().setAlpha(this.f15479t);
                this.f15478s.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f15477r == null || this.f15479t <= 0 || !m18688n(view)) {
            z = false;
        } else {
            m18692t(this.f15477r, view, getWidth(), getHeight());
            this.f15477r.mutate().setAlpha(this.f15479t);
            this.f15477r.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f15478s;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f15477r;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C5071a aVar = this.f15473n;
        if (aVar != null) {
            z |= aVar.mo16451E0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C4919c generateDefaultLayoutParams() {
        return new C4919c(-1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4919c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f15473n.mo16484q();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f15473n.mo16489u();
    }

    public Drawable getContentScrim() {
        return this.f15477r;
    }

    public int getExpandedTitleGravity() {
        return this.f15473n.mo16442A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f15471l;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f15470k;
    }

    public int getExpandedTitleMarginStart() {
        return this.f15468i;
    }

    public int getExpandedTitleMarginTop() {
        return this.f15469j;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f15473n.mo16446C();
    }

    public int getHyphenationFrequency() {
        return this.f15473n.mo16452F();
    }

    public int getLineCount() {
        return this.f15473n.mo16454G();
    }

    public float getLineSpacingAdd() {
        return this.f15473n.mo16456H();
    }

    public float getLineSpacingMultiplier() {
        return this.f15473n.mo16458I();
    }

    public int getMaxLines() {
        return this.f15473n.mo16460J();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.f15479t;
    }

    public long getScrimAnimationDuration() {
        return this.f15482w;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.f15483x;
        if (i2 >= 0) {
            return i2 + this.f15459C + this.f15461E;
        }
        WindowInsetsCompat windowInsetsCompat = this.f15458B;
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.mo3496l();
        } else {
            i = 0;
        }
        int C = ViewCompat.m3543C(this);
        if (C > 0) {
            return Math.min((C * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f15478s;
    }

    public CharSequence getTitle() {
        if (this.f15475p) {
            return this.f15473n.mo16463M();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f15457A;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f15473n.mo16462L();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f15473n.mo16464P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo15407i(View view) {
        return ((getHeight() - m18685k(view).mo15469b()) - view.getHeight()) - ((C4919c) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public WindowInsetsCompat mo15408o(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (ViewCompat.m3632y(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!C1002c.m3509a(this.f15458B, windowInsetsCompat2)) {
            this.f15458B = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.mo3485c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m18680c(appBarLayout);
            ViewCompat.m3540A0(this, ViewCompat.m3632y(appBarLayout));
            if (this.f15484y == null) {
                this.f15484y = new C4920d();
            }
            appBarLayout.mo15285d(this.f15484y);
            ViewCompat.m3613o0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15473n.mo16466W(configuration);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.C4916g gVar = this.f15484y;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo15315r(gVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.f15458B;
        if (windowInsetsCompat != null) {
            int l = windowInsetsCompat.mo3496l();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!ViewCompat.m3632y(childAt) && childAt.getTop() < l) {
                    ViewCompat.m3589c0(childAt, l);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m18685k(getChildAt(i6)).mo15471d();
        }
        m18694w(i, i2, i3, i4, false);
        m18695x();
        mo15454v();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m18685k(getChildAt(i7)).mo15468a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        m18681d();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.f15458B;
        if (windowInsetsCompat != null) {
            i3 = windowInsetsCompat.mo3496l();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.f15460D) && i3 > 0) {
            this.f15459C = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.f15462F && this.f15473n.mo16460J() > 1) {
            m18695x();
            m18694w(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int y = this.f15473n.mo16495y();
            if (y > 1) {
                this.f15461E = Math.round(this.f15473n.mo16496z()) * (y - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f15461E, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f15465f;
        if (viewGroup != null) {
            View view = this.f15466g;
            if (view == null || view == this) {
                setMinimumHeight(m18683h(viewGroup));
            } else {
                setMinimumHeight(m18683h(view));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f15477r;
        if (drawable != null) {
            m18691s(drawable, i, i2);
        }
    }

    /* renamed from: p */
    public void mo15415p(boolean z, boolean z2) {
        if (this.f15480u != z) {
            int i = C11051p3.f31759c;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m18678a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f15480u = z;
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f15473n.mo16473g0(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f15473n.mo16471d0(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f15473n.mo16474h0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f15477r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f15477r = drawable3;
            if (drawable3 != null) {
                m18691s(drawable3, getWidth(), getHeight());
                this.f15477r.setCallback(this);
                this.f15477r.setAlpha(this.f15479t);
            }
            ViewCompat.m3601i0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0767a.m2895e(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f15473n.mo16485q0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f15471l = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f15470k = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f15468i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f15469j = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f15473n.mo16480n0(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f15473n.mo16483p0(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f15473n.mo16488s0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f15462F = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f15460D = z;
    }

    public void setHyphenationFrequency(int i) {
        this.f15473n.mo16494x0(i);
    }

    public void setLineSpacingAdd(float f) {
        this.f15473n.mo16497z0(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.f15473n.mo16443A0(f);
    }

    public void setMaxLines(int i) {
        this.f15473n.mo16445B0(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f15473n.mo16449D0(z);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f15479t) {
            if (!(this.f15477r == null || (viewGroup = this.f15465f) == null)) {
                ViewCompat.m3601i0(viewGroup);
            }
            this.f15479t = i;
            ViewCompat.m3601i0(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f15482w = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f15483x != i) {
            this.f15483x = i;
            mo15454v();
        }
    }

    public void setScrimsShown(boolean z) {
        mo15415p(z, ViewCompat.m3579V(this) && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(C4921e eVar) {
        this.f15473n.mo16453F0(eVar);
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f15478s;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f15478s = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f15478s.setState(getDrawableState());
                }
                C0836a.m3151m(this.f15478s, ViewCompat.m3541B(this));
                Drawable drawable4 = this.f15478s;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f15478s.setCallback(this);
                this.f15478s.setAlpha(this.f15479t);
            }
            ViewCompat.m3601i0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0767a.m2895e(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f15473n.mo16455G0(charSequence);
        m18690r();
    }

    public void setTitleCollapseMode(int i) {
        this.f15457A = i;
        boolean l = m18686l();
        this.f15473n.mo16492v0(l);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m18680c((AppBarLayout) parent);
        }
        if (l && this.f15477r == null) {
            setContentScrimColor(this.f15474o.mo20638d(getResources().getDimension(C0074d.f196a)));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f15473n.mo16459I0(truncateAt);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f15475p) {
            this.f15475p = z;
            m18690r();
            m18693u();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f15473n.mo16447C0(timeInterpolator);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f15478s;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f15478s.setVisible(z, false);
        }
        Drawable drawable2 = this.f15477r;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f15477r.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo15454v() {
        boolean z;
        if (this.f15477r != null || this.f15478s != null) {
            if (getHeight() + this.f15485z < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15477r || drawable == this.f15478s;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = f15456G
            android.content.Context r11 = p249s8.C8273a.m31120c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = 1
            r10.f15463d = r11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f15472m = r0
            r6 = -1
            r10.f15483x = r6
            r7 = 0
            r10.f15459C = r7
            r10.f15461E = r7
            android.content.Context r8 = r10.getContext()
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>(r10)
            r10.f15473n = r9
            android.animation.TimeInterpolator r0 = p026b8.C2170a.f6354e
            r9.mo16457H0(r0)
            r9.mo16449D0(r7)
            i8.a r0 = new i8.a
            r0.<init>(r8)
            r10.f15474o = r0
            int[] r2 = p009a8.C0082l.f441G1
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.C5088l.m19898i(r0, r1, r2, r3, r4, r5)
            int r13 = p009a8.C0082l.f491L1
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r13 = r12.getInt(r13, r0)
            r9.mo16485q0(r13)
            int r13 = p009a8.C0082l.f451H1
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r13 = r12.getInt(r13, r0)
            r9.mo16473g0(r13)
            int r13 = p009a8.C0082l.f501M1
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f15471l = r13
            r10.f15470k = r13
            r10.f15469j = r13
            r10.f15468i = r13
            int r13 = p009a8.C0082l.f531P1
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0074
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f15468i = r13
        L_0x0074:
            int r13 = p009a8.C0082l.f521O1
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0082
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f15470k = r13
        L_0x0082:
            int r13 = p009a8.C0082l.f541Q1
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0090
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f15469j = r13
        L_0x0090:
            int r13 = p009a8.C0082l.f511N1
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x009e
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f15471l = r13
        L_0x009e:
            int r13 = p009a8.C0082l.f645b2
            boolean r13 = r12.getBoolean(r13, r11)
            r10.f15475p = r13
            int r13 = p009a8.C0082l.f625Z1
            java.lang.CharSequence r13 = r12.getText(r13)
            r10.setTitle(r13)
            int r13 = p009a8.C0081k.f356d
            r9.mo16480n0(r13)
            int r13 = p030c.C2218i.f6616c
            r9.mo16471d0(r13)
            int r13 = p009a8.C0082l.f551R1
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00c8
            int r13 = r12.getResourceId(r13, r7)
            r9.mo16480n0(r13)
        L_0x00c8:
            int r13 = p009a8.C0082l.f461I1
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00d7
            int r13 = r12.getResourceId(r13, r7)
            r9.mo16471d0(r13)
        L_0x00d7:
            int r13 = p009a8.C0082l.f665d2
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00ea
            int r13 = r12.getInt(r13, r6)
            android.text.TextUtils$TruncateAt r13 = r10.m18679b(r13)
            r10.setTitleEllipsize(r13)
        L_0x00ea:
            int r13 = p009a8.C0082l.f561S1
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00f9
            android.content.res.ColorStateList r13 = p184n8.C7343c.m28003a(r8, r12, r13)
            r9.mo16483p0(r13)
        L_0x00f9:
            int r13 = p009a8.C0082l.f471J1
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0108
            android.content.res.ColorStateList r13 = p184n8.C7343c.m28003a(r8, r12, r13)
            r9.mo16472f0(r13)
        L_0x0108:
            int r13 = p009a8.C0082l.f607X1
            int r13 = r12.getDimensionPixelSize(r13, r6)
            r10.f15483x = r13
            int r13 = p009a8.C0082l.f589V1
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x011f
            int r11 = r12.getInt(r13, r11)
            r9.mo16445B0(r11)
        L_0x011f:
            int r11 = p009a8.C0082l.f655c2
            boolean r13 = r12.hasValue(r11)
            if (r13 == 0) goto L_0x0132
            int r11 = r12.getResourceId(r11, r7)
            android.view.animation.Interpolator r11 = android.view.animation.AnimationUtils.loadInterpolator(r8, r11)
            r9.mo16447C0(r11)
        L_0x0132:
            int r11 = p009a8.C0082l.f598W1
            r13 = 600(0x258, float:8.41E-43)
            int r11 = r12.getInt(r11, r13)
            long r0 = (long) r11
            r10.f15482w = r0
            int r11 = p009a8.C0082l.f481K1
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setContentScrim(r11)
            int r11 = p009a8.C0082l.f616Y1
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarScrim(r11)
            int r11 = p009a8.C0082l.f635a2
            int r11 = r12.getInt(r11, r7)
            r10.setTitleCollapseMode(r11)
            int r11 = p009a8.C0082l.f675e2
            int r11 = r12.getResourceId(r11, r6)
            r10.f15464e = r11
            int r11 = p009a8.C0082l.f580U1
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f15460D = r11
            int r11 = p009a8.C0082l.f571T1
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f15462F = r11
            r12.recycle()
            r10.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r11 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r11.<init>()
            androidx.core.view.ViewCompat.m3550F0(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f15473n.mo16472f0(colorStateList);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4919c(getContext(), attributeSet);
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    public static class C4919c extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f15488a = 0;

        /* renamed from: b */
        float f15489b = 0.5f;

        public C4919c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f685f2);
            this.f15488a = obtainStyledAttributes.getInt(C0082l.f695g2, 0);
            mo15457a(obtainStyledAttributes.getFloat(C0082l.f705h2, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo15457a(float f) {
            this.f15489b = f;
        }

        public C4919c(int i, int i2) {
            super(i, i2);
        }

        public C4919c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
