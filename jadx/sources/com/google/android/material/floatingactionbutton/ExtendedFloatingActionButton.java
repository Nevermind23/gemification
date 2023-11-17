package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C5074b;
import java.util.List;
import p009a8.C0071a;
import p009a8.C0072b;
import p009a8.C0081k;
import p009a8.C0082l;
import p026b8.C2173d;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0643b {

    /* renamed from: V */
    private static final int f16086V = C0081k.f376x;

    /* renamed from: W */
    static final Property f16087W;

    /* renamed from: a0 */
    static final Property f16088a0;

    /* renamed from: b0 */
    static final Property f16089b0;

    /* renamed from: c0 */
    static final Property f16090c0;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f16091H;

    /* renamed from: I */
    private final C5061a f16092I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C5064c f16093J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C5064c f16094K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C5064c f16095L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C5064c f16096M;

    /* renamed from: N */
    private final int f16097N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f16098O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f16099P;

    /* renamed from: Q */
    private final CoordinatorLayout.C0644c f16100Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f16101R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public boolean f16102S;

    /* renamed from: T */
    private boolean f16103T;

    /* renamed from: U */
    protected ColorStateList f16104U;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C5049a implements C5060l {
        C5049a() {
        }

        /* renamed from: a */
        public ViewGroup.LayoutParams mo16342a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f16099P;
        }

        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f16098O;
        }

        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f16098O + ExtendedFloatingActionButton.this.f16099P;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    class C5050b implements C5060l {
        C5050b() {
        }

        /* renamed from: a */
        public ViewGroup.LayoutParams mo16342a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    class C5051c extends AnimatorListenerAdapter {

        /* renamed from: d */
        private boolean f16110d;

        /* renamed from: e */
        final /* synthetic */ C5064c f16111e;

        C5051c(C5064c cVar, C5058j jVar) {
            this.f16111e = cVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f16110d = true;
            this.f16111e.mo16373e();
        }

        public void onAnimationEnd(Animator animator) {
            this.f16111e.mo16369g();
            if (!this.f16110d) {
                this.f16111e.mo16371j((C5058j) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f16111e.onAnimationStart(animator);
            this.f16110d = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    class C5052d extends Property {
        C5052d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    class C5053e extends Property {
        C5053e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    class C5054f extends Property {
        C5054f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) ViewCompat.m3551G(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            ViewCompat.m3552G0(view, f.intValue(), view.getPaddingTop(), ViewCompat.m3549F(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    class C5055g extends Property {
        C5055g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) ViewCompat.m3549F(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            ViewCompat.m3552G0(view, ViewCompat.m3551G(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    class C5056h extends C5062b {

        /* renamed from: g */
        private final C5060l f16113g;

        /* renamed from: h */
        private final boolean f16114h;

        C5056h(C5061a aVar, C5060l lVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f16113g = lVar;
            this.f16114h = z;
        }

        /* renamed from: a */
        public void mo16366a() {
            boolean unused = ExtendedFloatingActionButton.this.f16101R = this.f16114h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f16113g.mo16342a().width;
                layoutParams.height = this.f16113g.mo16342a().height;
                ViewCompat.m3552G0(ExtendedFloatingActionButton.this, this.f16113g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f16113g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: d */
        public boolean mo16367d() {
            return this.f16114h == ExtendedFloatingActionButton.this.f16101R || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        /* renamed from: f */
        public int mo16368f() {
            if (this.f16114h) {
                return C0071a.f118b;
            }
            return C0071a.f117a;
        }

        /* renamed from: g */
        public void mo16369g() {
            super.mo16369g();
            boolean unused = ExtendedFloatingActionButton.this.f16102S = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f16113g.mo16342a().width;
                layoutParams.height = this.f16113g.mo16342a().height;
            }
        }

        /* renamed from: h */
        public AnimatorSet mo16370h() {
            float f;
            C2173d m = mo16384m();
            if (m.mo7062i("width")) {
                PropertyValuesHolder[] g = m.mo7059g("width");
                g[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f16113g.getWidth()});
                m.mo7064k("width", g);
            }
            if (m.mo7062i("height")) {
                PropertyValuesHolder[] g2 = m.mo7059g("height");
                g2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f16113g.getHeight()});
                m.mo7064k("height", g2);
            }
            if (m.mo7062i("paddingStart")) {
                PropertyValuesHolder[] g3 = m.mo7059g("paddingStart");
                g3[0].setFloatValues(new float[]{(float) ViewCompat.m3551G(ExtendedFloatingActionButton.this), (float) this.f16113g.getPaddingStart()});
                m.mo7064k("paddingStart", g3);
            }
            if (m.mo7062i("paddingEnd")) {
                PropertyValuesHolder[] g4 = m.mo7059g("paddingEnd");
                g4[0].setFloatValues(new float[]{(float) ViewCompat.m3549F(ExtendedFloatingActionButton.this), (float) this.f16113g.getPaddingEnd()});
                m.mo7064k("paddingEnd", g4);
            }
            if (m.mo7062i("labelOpacity")) {
                PropertyValuesHolder[] g5 = m.mo7059g("labelOpacity");
                boolean z = this.f16114h;
                float f2 = Utils.FLOAT_EPSILON;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                if (z) {
                    f2 = 1.0f;
                }
                g5[0].setFloatValues(new float[]{f, f2});
                m.mo7064k("labelOpacity", g5);
            }
            return super.mo16383l(m);
        }

        /* renamed from: j */
        public void mo16371j(C5058j jVar) {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean unused = ExtendedFloatingActionButton.this.f16101R = this.f16114h;
            boolean unused2 = ExtendedFloatingActionButton.this.f16102S = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    class C5057i extends C5062b {

        /* renamed from: g */
        private boolean f16116g;

        public C5057i(C5061a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public void mo16366a() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: d */
        public boolean mo16367d() {
            return ExtendedFloatingActionButton.this.m19637E();
        }

        /* renamed from: e */
        public void mo16373e() {
            super.mo16373e();
            this.f16116g = true;
        }

        /* renamed from: f */
        public int mo16368f() {
            return C0071a.f119c;
        }

        /* renamed from: g */
        public void mo16369g() {
            super.mo16369g();
            int unused = ExtendedFloatingActionButton.this.f16091H = 0;
            if (!this.f16116g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        /* renamed from: j */
        public void mo16371j(C5058j jVar) {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f16116g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f16091H = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public static abstract class C5058j {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    class C5059k extends C5062b {
        public C5059k(C5061a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public void mo16366a() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: d */
        public boolean mo16367d() {
            return ExtendedFloatingActionButton.this.m19638F();
        }

        /* renamed from: f */
        public int mo16368f() {
            return C0071a.f120d;
        }

        /* renamed from: g */
        public void mo16369g() {
            super.mo16369g();
            int unused = ExtendedFloatingActionButton.this.f16091H = 0;
        }

        /* renamed from: j */
        public void mo16371j(C5058j jVar) {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f16091H = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    interface C5060l {
        /* renamed from: a */
        ViewGroup.LayoutParams mo16342a();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        f16087W = new C5052d(cls, "width");
        f16088a0 = new C5053e(cls, "height");
        f16089b0 = new C5054f(cls, "paddingStart");
        f16090c0 = new C5055g(cls, "paddingEnd");
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f163x);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public boolean m19637E() {
        if (getVisibility() == 0) {
            if (this.f16091H == 1) {
                return true;
            }
            return false;
        } else if (this.f16091H != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public boolean m19638F() {
        if (getVisibility() != 0) {
            if (this.f16091H == 2) {
                return true;
            }
            return false;
        } else if (this.f16091H != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m19639G(C5064c cVar, C5058j jVar) {
        if (!cVar.mo16367d()) {
            if (!m19641I()) {
                cVar.mo16366a();
                cVar.mo16371j(jVar);
                return;
            }
            measure(0, 0);
            AnimatorSet h = cVar.mo16370h();
            h.addListener(new C5051c(cVar, jVar));
            for (Animator.AnimatorListener addListener : cVar.mo16382i()) {
                h.addListener(addListener);
            }
            h.start();
        }
    }

    /* renamed from: H */
    private void m19640H() {
        this.f16104U = getTextColors();
    }

    /* renamed from: I */
    private boolean m19641I() {
        if ((ViewCompat.m3579V(this) || (!m19638F() && this.f16103T)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public void mo16311B() {
        m19639G(this.f16094K, (C5058j) null);
    }

    /* renamed from: C */
    public void mo16312C() {
        m19639G(this.f16096M, (C5058j) null);
    }

    /* renamed from: D */
    public final boolean mo16313D() {
        return this.f16101R;
    }

    /* renamed from: J */
    public void mo16314J() {
        m19639G(this.f16095L, (C5058j) null);
    }

    /* renamed from: K */
    public void mo16315K() {
        m19639G(this.f16093J, (C5058j) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo16316L(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public CoordinatorLayout.C0644c getBehavior() {
        return this.f16100Q;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        int i = this.f16097N;
        if (i < 0) {
            return (Math.min(ViewCompat.m3551G(this), ViewCompat.m3549F(this)) * 2) + getIconSize();
        }
        return i;
    }

    public C2173d getExtendMotionSpec() {
        return this.f16094K.mo16380b();
    }

    public C2173d getHideMotionSpec() {
        return this.f16096M.mo16380b();
    }

    public C2173d getShowMotionSpec() {
        return this.f16095L.mo16380b();
    }

    public C2173d getShrinkMotionSpec() {
        return this.f16093J.mo16380b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16101R && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f16101R = false;
            this.f16093J.mo16366a();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f16103T = z;
    }

    public void setExtendMotionSpec(C2173d dVar) {
        this.f16094K.mo16381c(dVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C2173d.m8299d(getContext(), i));
    }

    public void setExtended(boolean z) {
        C5064c cVar;
        if (this.f16101R != z) {
            if (z) {
                cVar = this.f16094K;
            } else {
                cVar = this.f16093J;
            }
            if (!cVar.mo16367d()) {
                cVar.mo16366a();
            }
        }
    }

    public void setHideMotionSpec(C2173d dVar) {
        this.f16096M.mo16381c(dVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C2173d.m8299d(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f16101R && !this.f16102S) {
            this.f16098O = ViewCompat.m3551G(this);
            this.f16099P = ViewCompat.m3549F(this);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f16101R && !this.f16102S) {
            this.f16098O = i;
            this.f16099P = i3;
        }
    }

    public void setShowMotionSpec(C2173d dVar) {
        this.f16095L.mo16381c(dVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C2173d.m8299d(getContext(), i));
    }

    public void setShrinkMotionSpec(C2173d dVar) {
        this.f16093J.mo16381c(dVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C2173d.m8299d(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        m19640H();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f16086V
            r1 = r17
            android.content.Context r1 = p249s8.C8273a.m31120c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f16091H = r10
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>()
            r0.f16092I = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.f16095L = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f16096M = r12
            r13 = 1
            r0.f16101R = r13
            r0.f16102S = r10
            r0.f16103T = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f16100Q = r1
            int[] r3 = p009a8.C0082l.f825t2
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C5088l.m19898i(r1, r2, r3, r4, r5, r6)
            int r2 = p009a8.C0082l.f865x2
            b8.d r2 = p026b8.C2173d.m8298c(r14, r1, r2)
            int r3 = p009a8.C0082l.f855w2
            b8.d r3 = p026b8.C2173d.m8298c(r14, r1, r3)
            int r4 = p009a8.C0082l.f845v2
            b8.d r4 = p026b8.C2173d.m8298c(r14, r1, r4)
            int r5 = p009a8.C0082l.f875y2
            b8.d r5 = p026b8.C2173d.m8298c(r14, r1, r5)
            int r6 = p009a8.C0082l.f835u2
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f16097N = r6
            int r6 = androidx.core.view.ViewCompat.m3551G(r16)
            r0.f16098O = r6
            int r6 = androidx.core.view.ViewCompat.m3549F(r16)
            r0.f16099P = r6
            com.google.android.material.floatingactionbutton.a r6 = new com.google.android.material.floatingactionbutton.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f16094K = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f16093J = r10
            r11.mo16381c(r2)
            r12.mo16381c(r3)
            r15.mo16381c(r4)
            r10.mo16381c(r5)
            r1.recycle()
            q8.c r1 = p223q8.C7929k.f22925m
            r2 = r18
            q8.k$b r1 = p223q8.C7929k.m29980g(r14, r2, r8, r9, r1)
            q8.k r1 = r1.mo22998m()
            r0.setShapeAppearanceModel(r1)
            r16.m19640H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C0644c {

        /* renamed from: a */
        private Rect f16105a;

        /* renamed from: b */
        private boolean f16106b;

        /* renamed from: c */
        private boolean f16107c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f16106b = false;
            this.f16107c = true;
        }

        /* renamed from: G */
        private static boolean m19660G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0647f) {
                return ((CoordinatorLayout.C0647f) layoutParams).mo3069f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m19661J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0647f fVar = (CoordinatorLayout.C0647f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f16106b || this.f16107c) && fVar.mo3068e() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: L */
        private boolean m19662L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m19661J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f16105a == null) {
                this.f16105a = new Rect();
            }
            Rect rect = this.f16105a;
            C5074b.m19850a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo16341K(extendedFloatingActionButton);
                return true;
            }
            mo16337E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m19663M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m19661J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0647f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo16341K(extendedFloatingActionButton);
                return true;
            }
            mo16337E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo16337E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C5064c cVar;
            if (this.f16107c) {
                cVar = extendedFloatingActionButton.f16094K;
            } else {
                cVar = extendedFloatingActionButton.f16095L;
            }
            extendedFloatingActionButton.m19639G(cVar, (C5058j) null);
        }

        /* renamed from: F */
        public boolean mo3036b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo3036b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean mo3042h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m19662L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m19660G(view)) {
                return false;
            } else {
                m19663M(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo3046l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List l = coordinatorLayout.mo2992l(extendedFloatingActionButton);
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) l.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m19660G(view) && m19663M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m19662L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2968C(extendedFloatingActionButton, i);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: K */
        public void mo16341K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C5064c cVar;
            if (this.f16107c) {
                cVar = extendedFloatingActionButton.f16093J;
            } else {
                cVar = extendedFloatingActionButton.f16096M;
            }
            extendedFloatingActionButton.m19639G(cVar, (C5058j) null);
        }

        /* renamed from: g */
        public void mo3041g(CoordinatorLayout.C0647f fVar) {
            if (fVar.f3222h == 0) {
                fVar.f3222h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f885z2);
            this.f16106b = obtainStyledAttributes.getBoolean(C0082l.f382A2, false);
            this.f16107c = obtainStyledAttributes.getBoolean(C0082l.f392B2, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m19640H();
    }
}
