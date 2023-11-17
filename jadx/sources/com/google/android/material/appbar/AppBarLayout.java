package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0125b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.util.C1002c;
import androidx.core.view.C1055a;
import androidx.core.view.C1060a1;
import androidx.core.view.C1255v0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0077g;
import p009a8.C0081k;
import p009a8.C0082l;
import p026b8.C2170a;
import p045d.C5769a;
import p223q8.C7922g;
import p223q8.C7926h;
import p292w.C8720a;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0643b {

    /* renamed from: w */
    private static final int f15405w = C0081k.f361i;

    /* renamed from: d */
    private int f15406d;

    /* renamed from: e */
    private int f15407e;

    /* renamed from: f */
    private int f15408f;

    /* renamed from: g */
    private int f15409g;

    /* renamed from: h */
    private boolean f15410h;

    /* renamed from: i */
    private int f15411i;

    /* renamed from: j */
    private WindowInsetsCompat f15412j;

    /* renamed from: k */
    private List f15413k;

    /* renamed from: l */
    private boolean f15414l;

    /* renamed from: m */
    private boolean f15415m;

    /* renamed from: n */
    private boolean f15416n;

    /* renamed from: o */
    private boolean f15417o;

    /* renamed from: p */
    private int f15418p;

    /* renamed from: q */
    private WeakReference f15419q;

    /* renamed from: r */
    private ValueAnimator f15420r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final List f15421s;

    /* renamed from: t */
    private int[] f15422t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Drawable f15423u;

    /* renamed from: v */
    private Behavior f15424v;

    protected static class BaseBehavior<T extends AppBarLayout> extends C4926e {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f15425k;

        /* renamed from: l */
        private int f15426l;

        /* renamed from: m */
        private ValueAnimator f15427m;

        /* renamed from: n */
        private SavedState f15428n;

        /* renamed from: o */
        private WeakReference f15429o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f15430p;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C4906a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            final /* synthetic */ CoordinatorLayout f15436d;

            /* renamed from: e */
            final /* synthetic */ AppBarLayout f15437e;

            C4906a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f15436d = coordinatorLayout;
                this.f15437e = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo15460P(this.f15436d, this.f15437e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C4907b extends C1055a {
            C4907b() {
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mo3626s0(BaseBehavior.this.f15430p);
                accessibilityNodeInfoCompat.mo3592Y(ScrollView.class.getName());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        class C4908c implements AccessibilityViewCommand {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f15440a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f15441b;

            /* renamed from: c */
            final /* synthetic */ View f15442c;

            /* renamed from: d */
            final /* synthetic */ int f15443d;

            C4908c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f15440a = coordinatorLayout;
                this.f15441b = appBarLayout;
                this.f15442c = view;
                this.f15443d = i;
            }

            /* renamed from: a */
            public boolean mo3654a(View view, AccessibilityViewCommand.C1068a aVar) {
                BaseBehavior.this.mo3051q(this.f15440a, this.f15441b, this.f15442c, 0, this.f15443d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        class C4909d implements AccessibilityViewCommand {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f15445a;

            /* renamed from: b */
            final /* synthetic */ boolean f15446b;

            C4909d(AppBarLayout appBarLayout, boolean z) {
                this.f15445a = appBarLayout;
                this.f15446b = z;
            }

            /* renamed from: a */
            public boolean mo3654a(View view, AccessibilityViewCommand.C1068a aVar) {
                this.f15445a.setExpanded(this.f15446b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: T */
        private boolean m18592T(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            boolean z = false;
            if (mo15337M() != (-appBarLayout.getTotalScrollRange())) {
                m18593U(coordinatorLayout, appBarLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3754q, false);
                z = true;
            }
            if (mo15337M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -appBarLayout.getDownNestedPreScrollRange();
                    if (i != 0) {
                        ViewCompat.m3611n0(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3755r, (CharSequence) null, new C4908c(coordinatorLayout, appBarLayout, view, i));
                        return true;
                    }
                } else {
                    m18593U(coordinatorLayout, appBarLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3755r, true);
                    return true;
                }
            }
            return z;
        }

        /* renamed from: U */
        private void m18593U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, boolean z) {
            ViewCompat.m3611n0(coordinatorLayout, accessibilityActionCompat, (CharSequence) null, new C4909d(appBarLayout, z));
        }

        /* renamed from: V */
        private void m18594V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int i2;
            int abs = Math.abs(mo15337M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > Utils.FLOAT_EPSILON) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            m18595W(coordinatorLayout, appBarLayout, i, i2);
        }

        /* renamed from: W */
        private void m18595W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
            int M = mo15337M();
            if (M == i) {
                ValueAnimator valueAnimator = this.f15427m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f15427m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f15427m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f15427m = valueAnimator3;
                valueAnimator3.setInterpolator(C2170a.f6354e);
                this.f15427m.addUpdateListener(new C4906a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f15427m.setDuration((long) Math.min(i2, 600));
            this.f15427m.setIntValues(new int[]{M, i});
            this.f15427m.start();
        }

        /* renamed from: X */
        private int m18596X(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        /* renamed from: Z */
        private boolean m18597Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!appBarLayout.mo15305l() || coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()) {
                return false;
            }
            return true;
        }

        /* renamed from: a0 */
        private static boolean m18598a0(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: b0 */
        private boolean m18599b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((C4915f) appBarLayout.getChildAt(i).getLayoutParams()).f15453a != 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c0 */
        private View m18600c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C1255v0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: d0 */
        private static View m18601d0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: e0 */
        private int m18602e0(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C4915f fVar = (C4915f) childAt.getLayoutParams();
                if (m18598a0(fVar.mo15372c(), 32)) {
                    top -= fVar.topMargin;
                    bottom += fVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: f0 */
        private View m18603f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.C0647f) childAt.getLayoutParams()).mo3069f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: i0 */
        private int m18604i0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i3);
                C4915f fVar = (C4915f) childAt.getLayoutParams();
                Interpolator d = fVar.mo15373d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (d != null) {
                    int c = fVar.mo15372c();
                    if ((c & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + fVar.topMargin + fVar.bottomMargin;
                        if ((c & 2) != 0) {
                            i2 -= ViewCompat.m3543C(childAt);
                        }
                    }
                    if (ViewCompat.m3632y(childAt)) {
                        i2 -= appBarLayout.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * d.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: v0 */
        private boolean m18605v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List m = coordinatorLayout.mo2993m(appBarLayout);
            int size = m.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.C0644c f = ((CoordinatorLayout.C0647f) ((View) m.get(i)).getLayoutParams()).mo3069f();
                if (!(f instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) f).mo15464K() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: w0 */
        private void m18606w0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int M = mo15337M() - topInset;
            int e0 = m18602e0(appBarLayout, M);
            if (e0 >= 0) {
                View childAt = appBarLayout.getChildAt(e0);
                C4915f fVar = (C4915f) childAt.getLayoutParams();
                int c = fVar.mo15372c();
                if ((c & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (e0 == 0 && ViewCompat.m3632y(appBarLayout) && ViewCompat.m3632y(childAt)) {
                        i -= appBarLayout.getTopInset();
                    }
                    if (m18598a0(c, 2)) {
                        i2 += ViewCompat.m3543C(childAt);
                    } else if (m18598a0(c, 5)) {
                        int C = ViewCompat.m3543C(childAt) + i2;
                        if (M < C) {
                            i = C;
                        } else {
                            i2 = C;
                        }
                    }
                    if (m18598a0(c, 32)) {
                        i += fVar.topMargin;
                        i2 -= fVar.bottomMargin;
                    }
                    m18594V(coordinatorLayout, appBarLayout, C8720a.m32478b(m18596X(M, i2, i) + topInset, -appBarLayout.getTotalScrollRange(), 0), Utils.FLOAT_EPSILON);
                }
            }
        }

        /* renamed from: x0 */
        private void m18607x0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View f0;
            ViewCompat.m3607l0(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3754q.mo3640b());
            ViewCompat.m3607l0(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3755r.mo3640b());
            if (appBarLayout.getTotalScrollRange() != 0 && (f0 = m18603f0(coordinatorLayout)) != null && m18599b0(appBarLayout)) {
                if (!ViewCompat.m3569P(coordinatorLayout)) {
                    ViewCompat.m3619r0(coordinatorLayout, new C4907b());
                }
                this.f15430p = m18592T(coordinatorLayout, appBarLayout, f0);
            }
        }

        /* renamed from: y0 */
        private void m18608y0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View d0 = m18601d0(appBarLayout, i);
            boolean z2 = false;
            if (d0 != null) {
                int c = ((C4915f) d0.getLayoutParams()).mo15372c();
                if ((c & 1) != 0) {
                    int C = ViewCompat.m3543C(d0);
                    if (i2 <= 0 || (c & 12) == 0 ? !((c & 2) == 0 || (-i) < (d0.getBottom() - C) - appBarLayout.getTopInset()) : (-i) >= (d0.getBottom() - C) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (appBarLayout.mo15306n()) {
                z2 = appBarLayout.mo15333z(m18600c0(coordinatorLayout));
            }
            boolean w = appBarLayout.mo15331w(z2);
            if (z || (w && m18605v0(coordinatorLayout, appBarLayout))) {
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public int mo15337M() {
            return mo15362E() + this.f15425k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Y */
        public boolean mo15334H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f15429o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g0 */
        public int mo15335K(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h0 */
        public int mo15336L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j0 */
        public void mo15338N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m18606w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.mo15306n()) {
                appBarLayout.mo15331w(appBarLayout.mo15333z(m18600c0(coordinatorLayout)));
            }
        }

        /* renamed from: k0 */
        public boolean mo3046l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean z;
            int i2;
            boolean l = super.mo3046l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f15428n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    if ((pendingAction & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            m18594V(coordinatorLayout, appBarLayout, i3, Utils.FLOAT_EPSILON);
                        } else {
                            mo15460P(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m18594V(coordinatorLayout, appBarLayout, 0, Utils.FLOAT_EPSILON);
                        } else {
                            mo15460P(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f15431f) {
                mo15460P(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f15432g) {
                mo15460P(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f15433h);
                int i4 = -childAt.getBottom();
                if (this.f15428n.f15435j) {
                    i2 = ViewCompat.m3543C(childAt) + appBarLayout.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f15428n.f15434i);
                }
                mo15460P(coordinatorLayout, appBarLayout, i4 + i2);
            }
            appBarLayout.mo15316s();
            this.f15428n = null;
            mo15363G(C8720a.m32478b(mo15362E(), -appBarLayout.getTotalScrollRange(), 0));
            m18608y0(coordinatorLayout, appBarLayout, mo15362E(), 0, true);
            appBarLayout.mo15307o(mo15362E());
            m18607x0(coordinatorLayout, appBarLayout);
            return l;
        }

        /* renamed from: l0 */
        public boolean mo3047m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0647f) appBarLayout.getLayoutParams()).height != -2) {
                return super.mo3047m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.mo2969D(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: m0 */
        public void mo3051q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i5 = -appBarLayout.getTotalScrollRange();
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                int i6 = i5;
                int i7 = i4;
                if (i6 != i7) {
                    iArr[1] = mo15459O(coordinatorLayout, appBarLayout, i2, i6, i7);
                }
            }
            if (appBarLayout.mo15306n()) {
                appBarLayout.mo15331w(appBarLayout.mo15333z(view));
            }
        }

        /* renamed from: n0 */
        public void mo3054t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo15459O(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m18607x0(coordinatorLayout, appBarLayout);
            }
        }

        /* renamed from: o0 */
        public void mo3058x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                mo15352s0((SavedState) parcelable, true);
                super.mo3058x(coordinatorLayout, appBarLayout, this.f15428n.mo3880a());
                return;
            }
            super.mo3058x(coordinatorLayout, appBarLayout, parcelable);
            this.f15428n = null;
        }

        /* renamed from: p0 */
        public Parcelable mo3059y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable y = super.mo3059y(coordinatorLayout, appBarLayout);
            SavedState t0 = mo15353t0(y, appBarLayout);
            if (t0 == null) {
                return y;
            }
            return t0;
        }

        /* renamed from: q0 */
        public boolean mo3031A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            if ((i & 2) == 0 || (!appBarLayout.mo15306n() && !m18597Z(coordinatorLayout, appBarLayout, view))) {
                z = false;
            } else {
                z = true;
            }
            if (z && (valueAnimator = this.f15427m) != null) {
                valueAnimator.cancel();
            }
            this.f15429o = null;
            this.f15426l = i2;
            return z;
        }

        /* renamed from: r0 */
        public void mo3033C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.f15426l == 0 || i == 1) {
                m18606w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.mo15306n()) {
                    appBarLayout.mo15331w(appBarLayout.mo15333z(view));
                }
            }
            this.f15429o = new WeakReference(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s0 */
        public void mo15352s0(SavedState savedState, boolean z) {
            if (this.f15428n == null || z) {
                this.f15428n = savedState;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t0 */
        public SavedState mo15353t0(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z;
            boolean z2;
            int E = mo15362E();
            int childCount = appBarLayout.getChildCount();
            boolean z3 = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i++;
                } else {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f3879e;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (E == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    savedState.f15432g = z;
                    if (z || (-E) < appBarLayout.getTotalScrollRange()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    savedState.f15431f = z2;
                    savedState.f15433h = i;
                    if (bottom == ViewCompat.m3543C(childAt) + appBarLayout.getTopInset()) {
                        z3 = true;
                    }
                    savedState.f15435j = z3;
                    savedState.f15434i = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u0 */
        public int mo15339Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int i4;
            int M = mo15337M();
            int i5 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.f15425k = 0;
            } else {
                int b = C8720a.m32478b(i, i2, i3);
                if (M != b) {
                    if (appBarLayout.mo15304j()) {
                        i4 = m18604i0(appBarLayout, b);
                    } else {
                        i4 = b;
                    }
                    boolean G = mo15363G(i4);
                    int i6 = M - b;
                    this.f15425k = b - i4;
                    int i7 = 1;
                    if (G) {
                        while (i5 < appBarLayout.getChildCount()) {
                            C4915f fVar = (C4915f) appBarLayout.getChildAt(i5).getLayoutParams();
                            C4913d b2 = fVar.mo15371b();
                            if (!(b2 == null || (fVar.mo15372c() & 1) == 0)) {
                                b2.mo15370a(appBarLayout, appBarLayout.getChildAt(i5), (float) mo15362E());
                            }
                            i5++;
                        }
                    }
                    if (!G && appBarLayout.mo15304j()) {
                        coordinatorLayout.mo2977f(appBarLayout);
                    }
                    appBarLayout.mo15307o(mo15362E());
                    if (b < M) {
                        i7 = -1;
                    }
                    m18608y0(coordinatorLayout, appBarLayout, b, i7, false);
                    i5 = i6;
                }
            }
            m18607x0(coordinatorLayout, appBarLayout);
            return i5;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C4905a();

            /* renamed from: f */
            boolean f15431f;

            /* renamed from: g */
            boolean f15432g;

            /* renamed from: h */
            int f15433h;

            /* renamed from: i */
            float f15434i;

            /* renamed from: j */
            boolean f15435j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            class C4905a implements Parcelable.ClassLoaderCreator {
                C4905a() {
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.f15431f = parcel.readByte() != 0;
                this.f15432g = parcel.readByte() != 0;
                this.f15433h = parcel.readInt();
                this.f15434i = parcel.readFloat();
                this.f15435j = parcel.readByte() == 0 ? false : z;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f15431f ? (byte) 1 : 0);
                parcel.writeByte(this.f15432g ? (byte) 1 : 0);
                parcel.writeInt(this.f15433h);
                parcel.writeFloat(this.f15434i);
                parcel.writeByte(this.f15435j ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        /* renamed from: D */
        public /* bridge */ /* synthetic */ boolean mo3034D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo3034D(coordinatorLayout, view, motionEvent);
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo15362E() {
            return super.mo15362E();
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo15363G(int i) {
            return super.mo15363G(i);
        }

        /* renamed from: k */
        public /* bridge */ /* synthetic */ boolean mo3045k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo3045k(coordinatorLayout, view, motionEvent);
        }

        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean mo15344k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo3046l(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean mo15345l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo3047m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ void mo15346m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo3051q(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo15347n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo3054t(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ void mo15348o0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo3058x(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable mo15349p0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo3059y(coordinatorLayout, appBarLayout);
        }

        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean mo15350q0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo3031A(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void mo15351r0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo3033C(coordinatorLayout, appBarLayout, view, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C4928f {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m18655R(AppBarLayout appBarLayout) {
            CoordinatorLayout.C0644c f = ((CoordinatorLayout.C0647f) appBarLayout.getLayoutParams()).mo3069f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo15337M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m18656S(View view, View view2) {
            CoordinatorLayout.C0644c f = ((CoordinatorLayout.C0647f) view2.getLayoutParams()).mo3069f();
            if (f instanceof BaseBehavior) {
                ViewCompat.m3589c0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f15425k) + mo15465M()) - mo15463I(view2));
            }
        }

        /* renamed from: T */
        private void m18657T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo15306n()) {
                    appBarLayout.mo15331w(appBarLayout.mo15333z(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public float mo15365J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = m18655R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return Utils.FLOAT_EPSILON;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public int mo15366L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo15366L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout mo15364H(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo3039e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: h */
        public boolean mo3042h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m18656S(view, view2);
            m18657T(view, view2);
            return false;
        }

        /* renamed from: i */
        public void mo3043i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.m3607l0(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3754q.mo3640b());
                ViewCompat.m3607l0(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3755r.mo3640b());
                ViewCompat.m3619r0(coordinatorLayout, (C1055a) null);
            }
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo3046l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo3046l(coordinatorLayout, view, i);
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo3047m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo3047m(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: w */
        public boolean mo3057w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = mo15364H(coordinatorLayout.mo2992l(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f15501d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.mo15329t(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f525O5);
            mo15466O(obtainStyledAttributes.getDimensionPixelSize(C0082l.f535P5, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C4910a implements C1060a1 {
        C4910a() {
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return AppBarLayout.this.mo15313p(windowInsetsCompat);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C4911b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        final /* synthetic */ C7922g f15449d;

        C4911b(C7922g gVar) {
            this.f15449d = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f15449d.mo22940W(floatValue);
            if (AppBarLayout.this.f15423u instanceof C7922g) {
                ((C7922g) AppBarLayout.this.f15423u).mo22940W(floatValue);
            }
            Iterator it = AppBarLayout.this.f15421s.iterator();
            if (it.hasNext()) {
                C0125b.m366a(it.next());
                this.f15449d.mo22926A();
                throw null;
            }
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C4912c {
        /* renamed from: a */
        void mo15369a(AppBarLayout appBarLayout, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static abstract class C4913d {
        /* renamed from: a */
        public abstract void mo15370a(AppBarLayout appBarLayout, View view, float f);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public static class C4914e extends C4913d {

        /* renamed from: a */
        private final Rect f15451a = new Rect();

        /* renamed from: b */
        private final Rect f15452b = new Rect();

        /* renamed from: b */
        private static void m18670b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        /* renamed from: a */
        public void mo15370a(AppBarLayout appBarLayout, View view, float f) {
            m18670b(this.f15451a, appBarLayout, view);
            float abs = ((float) this.f15451a.top) - Math.abs(f);
            if (abs <= Utils.FLOAT_EPSILON) {
                float a = 1.0f - C8720a.m32477a(Math.abs(abs / ((float) this.f15451a.height())), Utils.FLOAT_EPSILON, 1.0f);
                float height = (-abs) - ((((float) this.f15451a.height()) * 0.3f) * (1.0f - (a * a)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f15452b);
                this.f15452b.offset(0, (int) (-height));
                ViewCompat.m3633y0(view, this.f15452b);
                return;
            }
            ViewCompat.m3633y0(view, (Rect) null);
            view.setTranslationY(Utils.FLOAT_EPSILON);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$g */
    public interface C4916g extends C4912c {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f143b);
    }

    /* renamed from: A */
    private boolean m18561A() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || ViewCompat.m3632y(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private void m18562B(C7922g gVar, boolean z) {
        float f;
        float dimension = getResources().getDimension(C0074d.f196a);
        if (z) {
            f = 0.0f;
        } else {
            f = dimension;
        }
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f15420r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f15420r = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C0077g.f289a));
        this.f15420r.setInterpolator(C2170a.f6350a);
        this.f15420r.addUpdateListener(new C4911b(gVar));
        this.f15420r.start();
    }

    /* renamed from: C */
    private void m18563C() {
        setWillNotDraw(!m18572y());
    }

    /* renamed from: e */
    private void m18566e() {
        WeakReference weakReference = this.f15419q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f15419q = null;
    }

    /* renamed from: f */
    private View m18567f(View view) {
        int i;
        View view2;
        if (this.f15419q == null && (i = this.f15418p) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f15418p);
            }
            if (view2 != null) {
                this.f15419q = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f15419q;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: k */
    private boolean m18568k() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C4915f) getChildAt(i).getLayoutParams()).mo15374e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    private void m18569m() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.f15424v;
        if (behavior == null || this.f15407e == -1 || this.f15411i != 0) {
            savedState = null;
        } else {
            savedState = behavior.mo15353t0(AbsSavedState.f3879e, this);
        }
        this.f15407e = -1;
        this.f15408f = -1;
        this.f15409g = -1;
        if (savedState != null) {
            this.f15424v.mo15352s0(savedState, false);
        }
    }

    /* renamed from: u */
    private void m18570u(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f15411i = i4 | i3;
        requestLayout();
    }

    /* renamed from: v */
    private boolean m18571v(boolean z) {
        if (this.f15415m == z) {
            return false;
        }
        this.f15415m = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: y */
    private boolean m18572y() {
        return this.f15423u != null && getTopInset() > 0;
    }

    /* renamed from: c */
    public void mo15283c(C4912c cVar) {
        if (this.f15413k == null) {
            this.f15413k = new ArrayList();
        }
        if (cVar != null && !this.f15413k.contains(cVar)) {
            this.f15413k.add(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4915f;
    }

    /* renamed from: d */
    public void mo15285d(C4916g gVar) {
        mo15283c(gVar);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m18572y()) {
            int save = canvas.save();
            canvas.translate(Utils.FLOAT_EPSILON, (float) (-this.f15406d));
            this.f15423u.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f15423u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C4915f generateDefaultLayoutParams() {
        return new C4915f(-1, -2);
    }

    public CoordinatorLayout.C0644c getBehavior() {
        Behavior behavior = new Behavior();
        this.f15424v = behavior;
        return behavior;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int C;
        int i2 = this.f15408f;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C4915f fVar = (C4915f) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = fVar.f15453a;
                if ((i4 & 5) == 5) {
                    int i5 = fVar.topMargin + fVar.bottomMargin;
                    if ((i4 & 8) != 0) {
                        C = ViewCompat.m3543C(childAt);
                    } else if ((i4 & 2) != 0) {
                        C = measuredHeight - ViewCompat.m3543C(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && ViewCompat.m3632y(childAt)) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = i5 + C;
                    i = Math.min(i, measuredHeight - getTopInset());
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.f15408f = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f15409g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C4915f fVar = (C4915f) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + fVar.topMargin + fVar.bottomMargin;
                int i4 = fVar.f15453a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= ViewCompat.m3543C(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f15409g = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f15418p;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C = ViewCompat.m3543C(this);
        if (C == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                C = ViewCompat.m3543C(getChildAt(childCount - 1));
            } else {
                C = 0;
            }
            if (C == 0) {
                return getHeight() / 3;
            }
        }
        return (C * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f15411i;
    }

    public Drawable getStatusBarForeground() {
        return this.f15423u;
    }

    @Deprecated
    public float getTargetElevation() {
        return Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f15412j;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.mo3496l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f15407e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C4915f fVar = (C4915f) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = fVar.f15453a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + fVar.topMargin + fVar.bottomMargin;
                if (i2 == 0 && ViewCompat.m3632y(childAt)) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= ViewCompat.m3543C(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f15407e = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    public C4915f generateLayoutParams(AttributeSet attributeSet) {
        return new C4915f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C4915f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C4915f((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4915f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4915f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo15304j() {
        return this.f15410h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo15305l() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: n */
    public boolean mo15306n() {
        return this.f15417o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo15307o(int i) {
        this.f15406d = i;
        if (!willNotDraw()) {
            ViewCompat.m3601i0(this);
        }
        List list = this.f15413k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4912c cVar = (C4912c) this.f15413k.get(i2);
                if (cVar != null) {
                    cVar.mo15369a(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7926h.m29970e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f15422t == null) {
            this.f15422t = new int[4];
        }
        int[] iArr = this.f15422t;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f15415m;
        int i4 = C0072b.f136V;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (!z || !this.f15416n) {
            i2 = -C0072b.f137W;
        } else {
            i2 = C0072b.f137W;
        }
        iArr[1] = i2;
        int i5 = C0072b.f134R;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (!z || !this.f15416n) {
            i3 = -C0072b.f133Q;
        } else {
            i3 = C0072b.f133Q;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m18566e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (ViewCompat.m3632y(this) && m18561A()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.m3589c0(getChildAt(childCount), topInset);
            }
        }
        m18569m();
        this.f15410h = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C4915f) getChildAt(i5).getLayoutParams()).mo15373d() != null) {
                this.f15410h = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f15423u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f15414l) {
            if (!this.f15417o && !m18568k()) {
                z2 = false;
            }
            m18571v(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ViewCompat.m3632y(this) && m18561A()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C8720a.m32478b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m18569m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public WindowInsetsCompat mo15313p(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (ViewCompat.m3632y(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!C1002c.m3509a(this.f15412j, windowInsetsCompat2)) {
            this.f15412j = windowInsetsCompat2;
            m18563C();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    /* renamed from: q */
    public void mo15314q(C4912c cVar) {
        List list = this.f15413k;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* renamed from: r */
    public void mo15315r(C4916g gVar) {
        mo15314q(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo15316s() {
        this.f15411i = 0;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C7926h.m29969d(this, f);
    }

    public void setExpanded(boolean z) {
        mo15329t(z, ViewCompat.m3579V(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f15417o = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f15418p = -1;
        if (view == null) {
            m18566e();
        } else {
            this.f15419q = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f15418p = i;
        m18566e();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f15414l = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f15423u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f15423u = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f15423u.setState(getDrawableState());
                }
                C0836a.m3151m(this.f15423u, ViewCompat.m3541B(this));
                Drawable drawable4 = this.f15423u;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f15423u.setCallback(this);
            }
            m18563C();
            ViewCompat.m3601i0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C5769a.m23210b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C4931i.m18742b(this, f);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f15423u;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public void mo15329t(boolean z, boolean z2) {
        m18570u(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15423u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo15331w(boolean z) {
        return mo15332x(z, !this.f15414l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo15332x(boolean z, boolean z2) {
        if (!z2 || this.f15416n == z) {
            return false;
        }
        this.f15416n = z;
        refreshDrawableState();
        if (!this.f15417o || !(getBackground() instanceof C7922g)) {
            return true;
        }
        m18562B((C7922g) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo15333z(View view) {
        View f = m18567f(view);
        if (f != null) {
            view = f;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f15405w
            android.content.Context r10 = p249s8.C8273a.m31120c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f15407e = r10
            r9.f15408f = r10
            r9.f15409g = r10
            r6 = 0
            r9.f15411i = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f15421s = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002f
            com.google.android.material.appbar.C4931i.m18741a(r9)
        L_0x002f:
            com.google.android.material.appbar.C4931i.m18743c(r9, r11, r12, r4)
            int[] r2 = p009a8.C0082l.f732k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.C5088l.m19898i(r0, r1, r2, r3, r4, r5)
            int r12 = p009a8.C0082l.f742l
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.ViewCompat.m3627v0(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006a
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            q8.g r0 = new q8.g
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.mo22941X(r12)
            r0.mo22934M(r7)
            androidx.core.view.ViewCompat.m3627v0(r9, r0)
        L_0x006a:
            int r12 = p009a8.C0082l.f782p
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0079
            boolean r12 = r11.getBoolean(r12, r6)
            r9.m18570u(r12, r6, r6)
        L_0x0079:
            int r12 = p009a8.C0082l.f772o
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0089
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.C4931i.m18742b(r9, r12)
        L_0x0089:
            r12 = 26
            if (r8 < r12) goto L_0x00ab
            int r12 = p009a8.C0082l.f762n
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L_0x009c:
            int r12 = p009a8.C0082l.f752m
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00ab
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L_0x00ab:
            int r12 = p009a8.C0082l.f792q
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f15417o = r12
            int r12 = p009a8.C0082l.f802r
            int r10 = r11.getResourceId(r12, r10)
            r9.f15418p = r10
            int r10 = p009a8.C0082l.f812s
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.ViewCompat.m3550F0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$f */
    public static class C4915f extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f15453a = 1;

        /* renamed from: b */
        private C4913d f15454b;

        /* renamed from: c */
        Interpolator f15455c;

        public C4915f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f832u);
            this.f15453a = obtainStyledAttributes.getInt(C0082l.f852w, 0);
            mo15375f(m18672a(obtainStyledAttributes.getInt(C0082l.f842v, 0)));
            int i = C0082l.f862x;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f15455c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private C4913d m18672a(int i) {
            if (i != 1) {
                return null;
            }
            return new C4914e();
        }

        /* renamed from: b */
        public C4913d mo15371b() {
            return this.f15454b;
        }

        /* renamed from: c */
        public int mo15372c() {
            return this.f15453a;
        }

        /* renamed from: d */
        public Interpolator mo15373d() {
            return this.f15455c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo15374e() {
            int i = this.f15453a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: f */
        public void mo15375f(C4913d dVar) {
            this.f15454b = dVar;
        }

        public C4915f(int i, int i2) {
            super(i, i2);
        }

        public C4915f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C4915f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C4915f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
