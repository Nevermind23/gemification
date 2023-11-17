package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.util.C1002c;
import androidx.core.util.C1005e;
import androidx.core.util.C1007g;
import androidx.core.view.C1060a1;
import androidx.core.view.C1266x;
import androidx.core.view.C1268x0;
import androidx.core.view.C1274y0;
import androidx.core.view.C1279z0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p253t.C8301a;
import p253t.C8302b;
import p253t.C8303c;

public class CoordinatorLayout extends ViewGroup implements C1268x0, C1274y0 {

    /* renamed from: A */
    static final Comparator f3187A = new C0649h();

    /* renamed from: B */
    private static final C1005e f3188B = new C1007g(12);

    /* renamed from: x */
    static final String f3189x;

    /* renamed from: y */
    static final Class[] f3190y = {Context.class, AttributeSet.class};

    /* renamed from: z */
    static final ThreadLocal f3191z = new ThreadLocal();

    /* renamed from: d */
    private final List f3192d;

    /* renamed from: e */
    private final C0650a f3193e;

    /* renamed from: f */
    private final List f3194f;

    /* renamed from: g */
    private final List f3195g;

    /* renamed from: h */
    private Paint f3196h;

    /* renamed from: i */
    private final int[] f3197i;

    /* renamed from: j */
    private final int[] f3198j;

    /* renamed from: k */
    private boolean f3199k;

    /* renamed from: l */
    private boolean f3200l;

    /* renamed from: m */
    private int[] f3201m;

    /* renamed from: n */
    private View f3202n;

    /* renamed from: o */
    private View f3203o;

    /* renamed from: p */
    private C0648g f3204p;

    /* renamed from: q */
    private boolean f3205q;

    /* renamed from: r */
    private WindowInsetsCompat f3206r;

    /* renamed from: s */
    private boolean f3207s;

    /* renamed from: t */
    private Drawable f3208t;

    /* renamed from: u */
    ViewGroup.OnHierarchyChangeListener f3209u;

    /* renamed from: v */
    private C1060a1 f3210v;

    /* renamed from: w */
    private final C1279z0 f3211w;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0642a implements C1060a1 {
        C0642a() {
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.mo2972Q(windowInsetsCompat);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0643b {
        C0644c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0644c {
        public C0644c() {
        }

        /* renamed from: A */
        public boolean mo3031A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                return mo3060z(coordinatorLayout, view, view2, view3, i);
            }
            return false;
        }

        /* renamed from: B */
        public void mo3032B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* renamed from: C */
        public void mo3033C(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            if (i == 0) {
                mo3032B(coordinatorLayout, view, view2);
            }
        }

        /* renamed from: D */
        public boolean mo3034D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3035a(CoordinatorLayout coordinatorLayout, View view) {
            return mo3038d(coordinatorLayout, view) > Utils.FLOAT_EPSILON;
        }

        /* renamed from: b */
        public boolean mo3036b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int mo3037c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo3038d(CoordinatorLayout coordinatorLayout, View view) {
            return Utils.FLOAT_EPSILON;
        }

        /* renamed from: e */
        public boolean mo3039e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* renamed from: f */
        public WindowInsetsCompat mo3040f(CoordinatorLayout coordinatorLayout, View view, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        /* renamed from: g */
        public void mo3041g(C0647f fVar) {
        }

        /* renamed from: h */
        public boolean mo3042h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* renamed from: i */
        public void mo3043i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* renamed from: j */
        public void mo3044j() {
        }

        /* renamed from: k */
        public boolean mo3045k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo3046l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo3047m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean mo3048n(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo3049o(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return false;
        }

        /* renamed from: p */
        public void mo3050p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo3051q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo3050p(coordinatorLayout, view, view2, i, i2, iArr);
            }
        }

        /* renamed from: r */
        public void mo3052r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        }

        /* renamed from: s */
        public void mo3053s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo3052r(coordinatorLayout, view, view2, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo3054t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo3053s(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
        }

        /* renamed from: u */
        public void mo3055u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        }

        /* renamed from: v */
        public void mo3056v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                mo3055u(coordinatorLayout, view, view2, view3, i);
            }
        }

        /* renamed from: w */
        public boolean mo3057w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo3058x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo3059y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: z */
        public boolean mo3060z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            return false;
        }

        public C0644c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0645d {
        Class value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C0646e implements ViewGroup.OnHierarchyChangeListener {
        C0646e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3209u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2967B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3209u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C0648g implements ViewTreeObserver.OnPreDrawListener {
        C0648g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2967B(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    static class C0649h implements Comparator {
        C0649h() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float O = ViewCompat.m3567O(view);
            float O2 = ViewCompat.m3567O(view2);
            if (O > O2) {
                return -1;
            }
            if (O < O2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f3189x = str;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8301a.f23517a);
    }

    /* renamed from: E */
    static C0644c m2470E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f3189x;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f3191z;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3190y);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0644c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: F */
    private boolean m2471F(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f3194f;
        m2487t(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            C0647f fVar = (C0647f) view.getLayoutParams();
            C0644c f = fVar.mo3069f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo3045k(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo3034D(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f3202n = view;
                    }
                }
                boolean c = fVar.mo3066c();
                boolean i4 = fVar.mo3072i(this, view);
                if (!i4 || c) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i4 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
                }
                if (i2 == 0) {
                    f.mo3045k(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo3034D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: G */
    private void m2472G() {
        this.f3192d.clear();
        this.f3193e.mo3086c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0647f s = mo3015s(childAt);
            s.mo3067d(this, childAt);
            this.f3193e.mo3085b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (s.mo3065b(this, childAt, childAt2)) {
                        if (!this.f3193e.mo3087d(childAt2)) {
                            this.f3193e.mo3085b(childAt2);
                        }
                        this.f3193e.mo3084a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3192d.addAll(this.f3193e.mo3090i());
        Collections.reverse(this.f3192d);
    }

    /* renamed from: I */
    private static void m2473I(Rect rect) {
        rect.setEmpty();
        f3188B.mo3439a(rect);
    }

    /* renamed from: K */
    private void m2474K(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0644c f = ((C0647f) childAt.getLayoutParams()).mo3069f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
                if (z) {
                    f.mo3045k(this, childAt, obtain);
                } else {
                    f.mo3034D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0647f) getChildAt(i2).getLayoutParams()).mo3076m();
        }
        this.f3202n = null;
        this.f3199k = false;
    }

    /* renamed from: L */
    private static int m2475L(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: M */
    private static int m2476M(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: N */
    private static int m2477N(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: O */
    private void m2478O(View view, int i) {
        C0647f fVar = (C0647f) view.getLayoutParams();
        int i2 = fVar.f3223i;
        if (i2 != i) {
            ViewCompat.m3587b0(view, i - i2);
            fVar.f3223i = i;
        }
    }

    /* renamed from: P */
    private void m2479P(View view, int i) {
        C0647f fVar = (C0647f) view.getLayoutParams();
        int i2 = fVar.f3224j;
        if (i2 != i) {
            ViewCompat.m3589c0(view, i - i2);
            fVar.f3224j = i;
        }
    }

    /* renamed from: R */
    private void m2480R() {
        if (ViewCompat.m3632y(this)) {
            if (this.f3210v == null) {
                this.f3210v = new C0642a();
            }
            ViewCompat.m3550F0(this, this.f3210v);
            setSystemUiVisibility(1280);
            return;
        }
        ViewCompat.m3550F0(this, (C1060a1) null);
    }

    /* renamed from: a */
    private static Rect m2481a() {
        Rect rect = (Rect) f3188B.mo3440b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* renamed from: c */
    private static int m2482c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: d */
    private void m2483d(C0647f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: e */
    private WindowInsetsCompat m2484e(WindowInsetsCompat windowInsetsCompat) {
        C0644c f;
        if (windowInsetsCompat.mo3499p()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.m3632y(childAt) && (f = ((C0647f) childAt.getLayoutParams()).mo3069f()) != null) {
                windowInsetsCompat = f.mo3040f(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.mo3499p()) {
                    break;
                }
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: p */
    private void m2485p(View view, int i, Rect rect, Rect rect2, C0647f fVar, int i2, int i3) {
        int i4;
        int i5;
        int b = C1266x.m4406b(m2475L(fVar.f3217c), i);
        int b2 = C1266x.m4406b(m2476M(fVar.f3218d), i);
        int i6 = b & 7;
        int i7 = b & 112;
        int i8 = b2 & 7;
        int i9 = b2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: q */
    private int m2486q(int i) {
        int[] iArr = this.f3201m;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: t */
    private void m2487t(List list) {
        int i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (isChildrenDrawingOrderEnabled) {
                i = getChildDrawingOrder(childCount, i2);
            } else {
                i = i2;
            }
            list.add(getChildAt(i));
        }
        Comparator comparator = f3187A;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: u */
    private boolean m2488u(View view) {
        return this.f3193e.mo3091j(view);
    }

    /* renamed from: w */
    private void m2489w(View view, int i) {
        C0647f fVar = (C0647f) view.getLayoutParams();
        Rect a = m2481a();
        a.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f3206r != null && ViewCompat.m3632y(this) && !ViewCompat.m3632y(view)) {
            a.left += this.f3206r.mo3494j();
            a.top += this.f3206r.mo3496l();
            a.right -= this.f3206r.mo3495k();
            a.bottom -= this.f3206r.mo3493i();
        }
        Rect a2 = m2481a();
        C1266x.m4405a(m2476M(fVar.f3217c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        m2473I(a);
        m2473I(a2);
    }

    /* renamed from: x */
    private void m2490x(View view, View view2, int i) {
        Rect a = m2481a();
        Rect a2 = m2481a();
        try {
            mo2994n(view2, a);
            mo2995o(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            m2473I(a);
            m2473I(a2);
        }
    }

    /* renamed from: y */
    private void m2491y(View view, int i, int i2) {
        C0647f fVar = (C0647f) view.getLayoutParams();
        int b = C1266x.m4406b(m2477N(fVar.f3217c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int q = m2486q(i) - measuredWidth;
        if (i3 == 1) {
            q += measuredWidth / 2;
        } else if (i3 == 5) {
            q += measuredWidth;
        }
        int i5 = 0;
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(q, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: z */
    private void m2492z(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (ViewCompat.m3579V(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0647f fVar = (C0647f) view.getLayoutParams();
            C0644c f = fVar.mo3069f();
            Rect a = m2481a();
            Rect a2 = m2481a();
            a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo3036b(this, view, a)) {
                a.set(a2);
            } else if (!a2.contains(a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a.toShortString() + " | Bounds:" + a2.toShortString());
            }
            m2473I(a2);
            if (a.isEmpty()) {
                m2473I(a);
                return;
            }
            int b = C1266x.m4406b(fVar.f3222h, i);
            boolean z3 = true;
            if ((b & 48) != 48 || (i6 = (a.top - fVar.topMargin) - fVar.f3224j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m2479P(view, i7 - i6);
                z = true;
            }
            if ((b & 80) == 80 && (height = ((getHeight() - a.bottom) - fVar.bottomMargin) + fVar.f3224j) < (i5 = rect.bottom)) {
                m2479P(view, height - i5);
                z = true;
            }
            if (!z) {
                m2479P(view, 0);
            }
            if ((b & 3) != 3 || (i3 = (a.left - fVar.leftMargin) - fVar.f3223i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m2478O(view, i4 - i3);
                z2 = true;
            }
            if ((b & 5) != 5 || (width = ((getWidth() - a.right) - fVar.rightMargin) + fVar.f3223i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m2478O(view, width - i2);
            }
            if (!z3) {
                m2478O(view, 0);
            }
            m2473I(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo2966A(View view, int i) {
        C0644c f;
        View view2 = view;
        C0647f fVar = (C0647f) view.getLayoutParams();
        if (fVar.f3225k != null) {
            Rect a = m2481a();
            Rect a2 = m2481a();
            Rect a3 = m2481a();
            mo2994n(fVar.f3225k, a);
            boolean z = false;
            mo2991k(view2, false, a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m2485p(view, i, a, a3, fVar, measuredWidth, measuredHeight);
            if (!(a3.left == a2.left && a3.top == a2.top)) {
                z = true;
            }
            m2483d(fVar, a3, measuredWidth, i2);
            int i3 = a3.left - a2.left;
            int i4 = a3.top - a2.top;
            if (i3 != 0) {
                ViewCompat.m3587b0(view2, i3);
            }
            if (i4 != 0) {
                ViewCompat.m3589c0(view2, i4);
            }
            if (z && (f = fVar.mo3069f()) != null) {
                f.mo3042h(this, view2, fVar.f3225k);
            }
            m2473I(a);
            m2473I(a2);
            m2473I(a3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo2967B(int i) {
        boolean z;
        int i2 = i;
        int B = ViewCompat.m3541B(this);
        int size = this.f3192d.size();
        Rect a = m2481a();
        Rect a2 = m2481a();
        Rect a3 = m2481a();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f3192d.get(i3);
            C0647f fVar = (C0647f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f3226l == ((View) this.f3192d.get(i4))) {
                        mo2966A(view, B);
                    }
                }
                mo2991k(view, true, a2);
                if (fVar.f3221g != 0 && !a2.isEmpty()) {
                    int b = C1266x.m4406b(fVar.f3221g, B);
                    int i5 = b & 112;
                    if (i5 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i5 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i6 = b & 7;
                    if (i6 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i6 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar.f3222h != 0 && view.getVisibility() == 0) {
                    m2492z(view, a, B);
                }
                if (i2 != 2) {
                    mo3012r(view, a3);
                    if (!a3.equals(a2)) {
                        mo2970H(view, a2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f3192d.get(i7);
                    C0647f fVar2 = (C0647f) view2.getLayoutParams();
                    C0644c f = fVar2.mo3069f();
                    if (f != null && f.mo3039e(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo3070g()) {
                            if (i2 != 2) {
                                z = f.mo3042h(this, view2, view);
                            } else {
                                f.mo3043i(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo3078p(z);
                            }
                        } else {
                            fVar2.mo3074k();
                        }
                    }
                }
            }
        }
        m2473I(a);
        m2473I(a2);
        m2473I(a3);
    }

    /* renamed from: C */
    public void mo2968C(View view, int i) {
        C0647f fVar = (C0647f) view.getLayoutParams();
        if (!fVar.mo3064a()) {
            View view2 = fVar.f3225k;
            if (view2 != null) {
                m2490x(view, view2, i);
                return;
            }
            int i2 = fVar.f3219e;
            if (i2 >= 0) {
                m2491y(view, i2, i);
            } else {
                m2489w(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: D */
    public void mo2969D(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo2970H(View view, Rect rect) {
        ((C0647f) view.getLayoutParams()).mo3079q(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo2971J() {
        if (this.f3200l && this.f3204p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3204p);
        }
        this.f3205q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final WindowInsetsCompat mo2972Q(WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        if (C1002c.m3509a(this.f3206r, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.f3206r = windowInsetsCompat;
        boolean z2 = true;
        if (windowInsetsCompat == null || windowInsetsCompat.mo3496l() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f3207s = z;
        if (z || getBackground() != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        WindowInsetsCompat e = m2484e(windowInsetsCompat);
        requestLayout();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2973b() {
        if (this.f3200l) {
            if (this.f3204p == null) {
                this.f3204p = new C0648g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3204p);
        }
        this.f3205q = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0647f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0647f fVar = (C0647f) view.getLayoutParams();
        C0644c cVar = fVar.f3215a;
        if (cVar != null) {
            float d = cVar.mo3038d(this, view);
            if (d > Utils.FLOAT_EPSILON) {
                if (this.f3196h == null) {
                    this.f3196h = new Paint();
                }
                this.f3196h.setColor(fVar.f3215a.mo3037c(this, view));
                this.f3196h.setAlpha(m2482c(Math.round(d * 255.0f), 0, C11051p3.f31759c));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f3196h);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3208t;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void mo2977f(View view) {
        List g = this.f3193e.mo3088g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                C0644c f = ((C0647f) view2.getLayoutParams()).mo3069f();
                if (f != null) {
                    f.mo3042h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2978g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m2488u(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f3205q) {
            return;
        }
        if (z) {
            mo2973b();
        } else {
            mo2971J();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m2472G();
        return Collections.unmodifiableList(this.f3192d);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f3206r;
    }

    public int getNestedScrollAxes() {
        return this.f3211w.mo3748a();
    }

    public Drawable getStatusBarBackground() {
        return this.f3208t;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0647f generateDefaultLayoutParams() {
        return new C0647f(-2, -2);
    }

    /* renamed from: i */
    public C0647f generateLayoutParams(AttributeSet attributeSet) {
        return new C0647f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0647f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0647f) {
            return new C0647f((C0647f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0647f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0647f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2991k(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo2994n(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: l */
    public List mo2992l(View view) {
        List h = this.f3193e.mo3089h(view);
        this.f3195g.clear();
        if (h != null) {
            this.f3195g.addAll(h);
        }
        return this.f3195g;
    }

    /* renamed from: m */
    public List mo2993m(View view) {
        List g = this.f3193e.mo3088g(view);
        this.f3195g.clear();
        if (g != null) {
            this.f3195g.addAll(g);
        }
        return this.f3195g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2994n(View view, Rect rect) {
        C0651b.m2579a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2995o(View view, int i, Rect rect, Rect rect2) {
        C0647f fVar = (C0647f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2485p(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m2483d(fVar, rect2, measuredWidth, measuredHeight);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2474K(false);
        if (this.f3205q) {
            if (this.f3204p == null) {
                this.f3204p = new C0648g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3204p);
        }
        if (this.f3206r == null && ViewCompat.m3632y(this)) {
            ViewCompat.m3613o0(this);
        }
        this.f3200l = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2474K(false);
        if (this.f3205q && this.f3204p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3204p);
        }
        View view = this.f3203o;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3200l = false;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f3207s && this.f3208t != null) {
            WindowInsetsCompat windowInsetsCompat = this.f3206r;
            if (windowInsetsCompat != null) {
                i = windowInsetsCompat.mo3496l();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f3208t.setBounds(0, 0, getWidth(), i);
                this.f3208t.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2474K(true);
        }
        boolean F = m2471F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2474K(true);
        }
        return F;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0644c f;
        int B = ViewCompat.m3541B(this);
        int size = this.f3192d.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f3192d.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C0647f) view.getLayoutParams()).mo3069f()) == null || !f.mo3046l(this, view, B))) {
                mo2968C(view, B);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo3047m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m2472G()
            r30.mo2978g()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.ViewCompat.m3541B(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.WindowInsetsCompat r3 = r7.f3206r
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.ViewCompat.m3632y(r30)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List r2 = r7.f3192d
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List r0 = r7.f3192d
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0647f) r1
            int r0 = r1.f3219e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m2486q(r0)
            int r11 = r1.f3217c
            int r11 = m2477N(r11)
            int r11 = androidx.core.view.C1266x.m4406b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = r11
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = androidx.core.view.ViewCompat.m3632y(r20)
            if (r0 != 0) goto L_0x00f1
            androidx.core.view.WindowInsetsCompat r0 = r7.f3206r
            int r0 = r0.mo3494j()
            androidx.core.view.WindowInsetsCompat r2 = r7.f3206r
            int r2 = r2.mo3495k()
            int r0 = r0 + r2
            androidx.core.view.WindowInsetsCompat r2 = r7.f3206r
            int r2 = r2.mo3496l()
            androidx.core.view.WindowInsetsCompat r11 = r7.f3206r
            int r11 = r11.mo3493i()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo3069f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo3047m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2969D(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0644c f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0647f fVar = (C0647f) childAt.getLayoutParams();
                if (fVar.mo3073j(0) && (f3 = fVar.mo3069f()) != null) {
                    z2 |= f3.mo3048n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo2967B(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0644c f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0647f fVar = (C0647f) childAt.getLayoutParams();
                if (fVar.mo3073j(0) && (f3 = fVar.mo3069f()) != null) {
                    z |= f3.mo3049o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3880a());
        SparseArray sparseArray = savedState.f3212f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0644c f = mo3015s(childAt).mo3069f();
            if (!(id == -1 || f == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                f.mo3058x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0644c f = ((C0647f) childAt.getLayoutParams()).mo3069f();
            if (!(id == -1 || f == null || (y = f.mo3059y(this, childAt)) == null)) {
                sparseArray.append(id, y);
            }
        }
        savedState.f3212f = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3202n
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m2471F(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f3202n
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0647f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo3069f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f3202n
            boolean r6 = r6.mo3034D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = r5
        L_0x002c:
            android.view.View r7 = r0.f3202n
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m2474K(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3012r(View view, Rect rect) {
        rect.set(((C0647f) view.getLayoutParams()).mo3071h());
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0644c f = ((C0647f) view.getLayoutParams()).mo3069f();
        if (f == null || !f.mo3057w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f3199k) {
            m2474K(false);
            this.f3199k = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0647f mo3015s(View view) {
        C0647f fVar = (C0647f) view.getLayoutParams();
        if (!fVar.f3216b) {
            if (view instanceof C0643b) {
                C0644c behavior = ((C0643b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.mo3077o(behavior);
                fVar.f3216b = true;
            } else {
                C0645d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0645d) cls.getAnnotation(C0645d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo3077o((C0644c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                fVar.f3216b = true;
            }
        }
        return fVar;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m2480R();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3209u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f3208t;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f3208t = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f3208t.setState(getDrawableState());
                }
                C0836a.m3151m(this.f3208t, ViewCompat.m3541B(this));
                Drawable drawable4 = this.f3208t;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f3208t.setCallback(this);
            }
            ViewCompat.m3601i0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0767a.m2895e(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f3208t;
        if (drawable != null && drawable.isVisible() != z) {
            this.f3208t.setVisible(z, false);
        }
    }

    /* renamed from: v */
    public boolean mo3022v(View view, int i, int i2) {
        Rect a = m2481a();
        mo2994n(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m2473I(a);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3208t;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f3192d = new ArrayList();
        this.f3193e = new C0650a();
        this.f3194f = new ArrayList();
        this.f3195g = new ArrayList();
        this.f3197i = new int[2];
        this.f3198j = new int[2];
        this.f3211w = new C1279z0(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C8303c.f23520b, 0, C8302b.f23518a);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C8303c.f23520b, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C8303c.f23520b, attributeSet, typedArray, 0, C8302b.f23518a);
            } else {
                saveAttributeDataForStyleable(context, C8303c.f23520b, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C8303c.f23521c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3201m = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f3201m.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f3201m;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f3208t = typedArray.getDrawable(C8303c.f23522d);
        typedArray.recycle();
        m2480R();
        super.setOnHierarchyChangeListener(new C0646e());
        if (ViewCompat.m3634z(this) == 0) {
            ViewCompat.m3544C0(this, 1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C0644c f;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0647f fVar = (C0647f) childAt.getLayoutParams();
                if (fVar.mo3073j(i3) && (f = fVar.mo3069f()) != null) {
                    int[] iArr2 = this.f3197i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3051q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f3197i;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.f3197i;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo2967B(1);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f3198j);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        C0644c f;
        this.f3211w.mo3750c(view, view2, i, i2);
        this.f3203o = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0647f fVar = (C0647f) childAt.getLayoutParams();
            if (fVar.mo3073j(i2) && (f = fVar.mo3069f()) != null) {
                f.mo3056v(this, childAt, view, view2, i, i2);
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0647f fVar = (C0647f) childAt.getLayoutParams();
                C0644c f = fVar.mo3069f();
                if (f != null) {
                    boolean A = f.mo3031A(this, childAt, view, view2, i, i2);
                    z |= A;
                    fVar.mo3080r(i3, A);
                } else {
                    fVar.mo3080r(i3, false);
                }
            }
        }
        return z;
    }

    public void onStopNestedScroll(View view, int i) {
        this.f3211w.mo3752e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0647f fVar = (C0647f) childAt.getLayoutParams();
            if (fVar.mo3073j(i)) {
                C0644c f = fVar.mo3069f();
                if (f != null) {
                    f.mo3033C(this, childAt, view, i);
                }
                fVar.mo3075l(i);
                fVar.mo3074k();
            }
        }
        this.f3203o = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C0644c f;
        int i6;
        boolean z;
        int i7;
        int childCount = getChildCount();
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0647f fVar = (C0647f) childAt.getLayoutParams();
                if (fVar.mo3073j(i5) && (f = fVar.mo3069f()) != null) {
                    int[] iArr2 = this.f3197i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3054t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f3197i;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        z = true;
                        i7 = Math.max(i9, this.f3197i[1]);
                    } else {
                        z = true;
                        i7 = Math.min(i9, this.f3197i[1]);
                    }
                    i9 = i7;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z2) {
            mo2967B(1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0641a();

        /* renamed from: f */
        SparseArray f3212f;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        static class C0641a implements Parcelable.ClassLoaderCreator {
            C0641a() {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3212f = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3212f.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f3212f;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f3212f.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.f3212f.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0647f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0644c f3215a;

        /* renamed from: b */
        boolean f3216b = false;

        /* renamed from: c */
        public int f3217c = 0;

        /* renamed from: d */
        public int f3218d = 0;

        /* renamed from: e */
        public int f3219e = -1;

        /* renamed from: f */
        int f3220f = -1;

        /* renamed from: g */
        public int f3221g = 0;

        /* renamed from: h */
        public int f3222h = 0;

        /* renamed from: i */
        int f3223i;

        /* renamed from: j */
        int f3224j;

        /* renamed from: k */
        View f3225k;

        /* renamed from: l */
        View f3226l;

        /* renamed from: m */
        private boolean f3227m;

        /* renamed from: n */
        private boolean f3228n;

        /* renamed from: o */
        private boolean f3229o;

        /* renamed from: p */
        private boolean f3230p;

        /* renamed from: q */
        final Rect f3231q = new Rect();

        /* renamed from: r */
        Object f3232r;

        public C0647f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: n */
        private void m2547n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3220f);
            this.f3225k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f3226l = null;
                            this.f3225k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f3226l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f3226l = null;
                    this.f3225k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f3226l = null;
                this.f3225k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3220f) + " to anchor view " + view);
            }
        }

        /* renamed from: s */
        private boolean m2548s(View view, int i) {
            int b = C1266x.m4406b(((C0647f) view.getLayoutParams()).f3221g, i);
            if (b == 0 || (C1266x.m4406b(this.f3222h, i) & b) != b) {
                return false;
            }
            return true;
        }

        /* renamed from: t */
        private boolean m2549t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3225k.getId() != this.f3220f) {
                return false;
            }
            View view2 = this.f3225k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3226l = null;
                    this.f3225k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f3226l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3064a() {
            return this.f3225k == null && this.f3220f != -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3065b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            C0644c cVar;
            if (view2 == this.f3226l || m2548s(view2, ViewCompat.m3541B(coordinatorLayout)) || ((cVar = this.f3215a) != null && cVar.mo3039e(coordinatorLayout, view, view2))) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3066c() {
            if (this.f3215a == null) {
                this.f3227m = false;
            }
            return this.f3227m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo3067d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3220f == -1) {
                this.f3226l = null;
                this.f3225k = null;
                return null;
            }
            if (this.f3225k == null || !m2549t(view, coordinatorLayout)) {
                m2547n(view, coordinatorLayout);
            }
            return this.f3225k;
        }

        /* renamed from: e */
        public int mo3068e() {
            return this.f3220f;
        }

        /* renamed from: f */
        public C0644c mo3069f() {
            return this.f3215a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo3070g() {
            return this.f3230p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Rect mo3071h() {
            return this.f3231q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo3072i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.f3227m;
            if (z2) {
                return true;
            }
            C0644c cVar = this.f3215a;
            if (cVar != null) {
                z = cVar.mo3035a(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.f3227m = z3;
            return z3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3073j(int i) {
            if (i == 0) {
                return this.f3228n;
            }
            if (i != 1) {
                return false;
            }
            return this.f3229o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo3074k() {
            this.f3230p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3075l(int i) {
            mo3080r(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo3076m() {
            this.f3227m = false;
        }

        /* renamed from: o */
        public void mo3077o(C0644c cVar) {
            C0644c cVar2 = this.f3215a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo3044j();
                }
                this.f3215a = cVar;
                this.f3232r = null;
                this.f3216b = true;
                if (cVar != null) {
                    cVar.mo3041g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo3078p(boolean z) {
            this.f3230p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo3079q(Rect rect) {
            this.f3231q.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo3080r(int i, boolean z) {
            if (i == 0) {
                this.f3228n = z;
            } else if (i == 1) {
                this.f3229o = z;
            }
        }

        C0647f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8303c.f23523e);
            this.f3217c = obtainStyledAttributes.getInteger(C8303c.f23524f, 0);
            this.f3220f = obtainStyledAttributes.getResourceId(C8303c.f23525g, -1);
            this.f3218d = obtainStyledAttributes.getInteger(C8303c.f23526h, 0);
            this.f3219e = obtainStyledAttributes.getInteger(C8303c.f23530l, -1);
            this.f3221g = obtainStyledAttributes.getInt(C8303c.f23529k, 0);
            this.f3222h = obtainStyledAttributes.getInt(C8303c.f23528j, 0);
            int i = C8303c.f23527i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f3216b = hasValue;
            if (hasValue) {
                this.f3215a = CoordinatorLayout.m2470E(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            C0644c cVar = this.f3215a;
            if (cVar != null) {
                cVar.mo3041g(this);
            }
        }

        public C0647f(C0647f fVar) {
            super(fVar);
        }

        public C0647f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0647f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
